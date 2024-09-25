package com.example.practice._03_long_function._09_preserve_whole_object;


import java.util.HashMap;
import java.util.Map;

// Participant 레코드는 점차 클래스의 형태를 갖춰감
public record Participant(String username, Map<Integer, Boolean> homework) {
    public Participant(String username) {
        this(username, new HashMap<>());
    }

    public void setHomeworkDone(int index) {
        this.homework.put(index, true);
    }


    double getRate(int totalNumberOfEvents) {
        long count = homework().values().stream()
                .filter(v -> v == true)
                .count();
        return (double) (count * 100 / totalNumberOfEvents);
    }
}
