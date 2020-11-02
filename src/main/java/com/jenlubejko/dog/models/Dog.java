package com.jenlubejko.dog.models;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name="dog")
public class Dog {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;
}
