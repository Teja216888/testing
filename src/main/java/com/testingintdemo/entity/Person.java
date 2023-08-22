package com.testingintdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON_DATA")
public class Person {
    @Id
    private Integer personId;
    private String personName;
}
