package ru.rb.onion.domain.entity;

import lombok.Data;

@Data
public class User {

    private String name;

    private int age;

    private Identity id;

}
