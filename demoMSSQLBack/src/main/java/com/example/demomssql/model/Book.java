package com.example.demomssql.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "Book_tbl")
@NoArgsConstructor
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String language;
    @Column
    private String bookTitle;
    @Column
    private double price;

}