package com.vitalii.library.repo;

import com.vitalii.library.entity.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {
}
