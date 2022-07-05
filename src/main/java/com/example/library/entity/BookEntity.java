package com.example.library.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = "books")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false, name = "books")
    private String bookName;

    @Column(unique = true)
    private String bookIdentifier;

    @Column(columnDefinition = "DOUBLE(4,2) NOT NULL")
    private Double bookPrice;

    @OneToOne
    private LibraryEntity library;
}
