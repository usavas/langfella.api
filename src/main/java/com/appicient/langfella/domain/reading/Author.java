package com.appicient.langfella.domain.reading;

import com.appicient.langfella.domain.common.Entity;

public class Author extends Entity {
    private int id;
    private String name;
    private String lastName;
    private String middleName;

    public Author(int id, String name, String lastName, String middleName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Author(String name, String lastName, String middleName) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
    }
}
