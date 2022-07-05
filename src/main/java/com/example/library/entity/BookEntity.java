package com.example.library.entity;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false, name = "book")
    private String bookName;

    @Column(columnDefinition = "DOUBLE(4,2) NOT NULL")
    private Double bookPrice;
}
