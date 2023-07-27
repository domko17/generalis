package com.dataminds.tutorial;

public enum Days {
    MONDAY("Pondelok"),
    THUESDAY("Utorok"),
    WENDESDAY("Streda"),
    THESDAY("Stvrtok"),
    FRIDAY("Paitok");


    public final String title;

    private Days(String title) {
        this.title = title;
    }

    String getTitle() {
        return this.title;
    }

}
