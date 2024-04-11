package com.example.restservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GreetingData")
public class GreetingData {
    @Id

    private int id;
    @Column(name = "content")
    private String content;

}

