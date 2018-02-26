package com.vitalii.library.service;

import com.vitalii.library.entity.Book;
import com.vitalii.library.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Book findAll(){
        return bookRepository.findOne(1L);
    }
}
