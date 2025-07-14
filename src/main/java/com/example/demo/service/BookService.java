package com.example.demo.service;

import com.example.demo.BookRepository;
import com.example.demo.entity.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Books> getAllBooks() {
        return bookRepository.findAll();
    }
    public void saveBook(Books book){
        bookRepository.save(book);
    }
    public void deleteBookById(Long id){
        bookRepository.deleteById(id);
    }
    public Books findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

}