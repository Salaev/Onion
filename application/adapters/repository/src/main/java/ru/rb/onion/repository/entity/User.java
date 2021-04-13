package ru.rb.onion.repository.entity;

import lombok.Data;

@Data
public class User {

    private String name_user;

    private int age_user;

    private Passport id;
}
