package com.gonco.apis.bookstore.services.utils;

import com.gonco.apis.bookstore.dtos.requests.BookDTO;
import com.gonco.apis.bookstore.entities.Book;

public class BooksUtil {
    private BooksUtil() {
        throw new IllegalStateException("Utility class");
    }
    public static BookDTO toDTO(Book book) {
        return BookDTO.builder()
                .id(book.getId())
                .author(book.getAuthor())
                .title(book.getTitle())
                .gender(book.getGender())
                .build();
    }
}
