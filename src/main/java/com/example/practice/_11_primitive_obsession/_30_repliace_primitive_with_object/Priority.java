package com.example.practice._11_primitive_obsession._30_repliace_primitive_with_object;

import java.lang.invoke.VarHandle;
import java.util.List;

public class Priority {
    private String value;

    private List<String> legalValues = List.of("low", "normal", "high", "rush");

    public Priority(String value) {
        //type safety 를 위해 생성자에 조건추가
        if(legalValues.contains(value)) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("illegal priority value : " + value);
        }
    }

    public boolean higherThan(Priority other) {
        return this.index() < other.index();
    }

    private int index() {
        return this.legalValues.indexOf(this.value);
    }
}
