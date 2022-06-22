package com.techarea.firstawsattempt.Entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private String cnp;
}
