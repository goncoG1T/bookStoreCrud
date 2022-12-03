package com.gonco.apis.bookstore.services;

import com.gonco.apis.bookstore.entities.Book;
import com.gonco.apis.bookstore.repositories.BookRepository;
import com.gonco.apis.bookstore.dtos.requests.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookSaveService {
    @Autowired
    private BookRepository bookRepository;

    public BookDTO save(BookDTO saveRequestBook) {
        var savedBook = bookRepository.save(Book.builder()
                .author(saveRequestBook.getAuthor())
                .title(saveRequestBook.getTitle())
                .gender(saveRequestBook.getGender())
                .build());

        saveRequestBook.setId(savedBook.getId());

        return saveRequestBook;
    }
}
