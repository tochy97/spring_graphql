package com.tochy.graphql.model;

public record Post(Integer id, String title, String category, String data) {

    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getData() {
        return data;
    }

}
