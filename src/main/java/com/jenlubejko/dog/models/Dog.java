package com.jenlubejko.dog.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="dog")
public class Dog {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="identification")
    private Long identification;

    @Column(name="breed")
    private String breed;

    @Column(name="origin")
    private String origin;

    @Column(name="weight")
    private Integer weight;

    @Column(name="age")
    private Double age;

    @Column(name="intake")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
    private Date intake;

    @Column(name="reproductive")
    private boolean reproductive;

    @Column(name="description")
    private String description;
}
