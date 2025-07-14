package com.cognizant.orm_learn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="country")
@Getter
@Setter
@ToString
public class Country {

    @Id
    @Column(name="co_code")
    private String code;

    @Column(name="co_name")
    private String name;

    // getters and setters

    // toString()

}

