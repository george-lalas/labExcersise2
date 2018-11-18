package com.example.demomssql.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "user_tbl")
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private Date birthDate;
    @Column
    private String address;
    @Column
    private String email;


}