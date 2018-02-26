package com.vitalii.library.controller;

import com.vitalii.library.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "/api", description = "Операции с профилем")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/")
    @ApiOperation(value = "Выводит данные о профиле")
    private void home(){
        System.out.println(bookService.findAll().toString());
    }
}
