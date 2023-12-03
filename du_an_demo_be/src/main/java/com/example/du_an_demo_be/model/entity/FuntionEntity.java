package com.example.du_an_demo_be.model.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "functions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FuntionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;
}
