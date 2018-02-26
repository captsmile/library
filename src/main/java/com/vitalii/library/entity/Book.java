package com.vitalii.library.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Book {
    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private String name;
    @NonNull
    private String author;
    @NonNull
    private int year;
    @NonNull
    private String isbn;
    @NonNull
    private String description;

    private String photo;


}
