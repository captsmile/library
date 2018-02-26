package com.vitalii.library.config;

import com.vitalii.library.entity.Book;
import com.vitalii.library.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final BookRepository repository;

    @Autowired
    public DatabaseLoader(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) {
        this.repository.save(new Book("Букварь","11",1989,"ааак222","вуву"));
    }
}
