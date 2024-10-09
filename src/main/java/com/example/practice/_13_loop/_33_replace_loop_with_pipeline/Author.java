package com.example.practice._13_loop._33_replace_loop_with_pipeline;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Author {

    private String company;

    private String twitterHandle;

    public Author(String company, String twitterHandle) {
        this.company = company;
        this.twitterHandle = twitterHandle;
    }

    static public List<String> TwitterHandles(List<Author> authors, String company) {
        return authors.stream()
                .filter(it -> it.company.equals(company)  && it.twitterHandle != null)
                .map(it -> it.twitterHandle)
                .toList();
    }

}
