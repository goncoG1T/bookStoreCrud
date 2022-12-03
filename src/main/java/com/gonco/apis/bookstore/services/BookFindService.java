package com.gonco.apis.bookstore.services;

import com.gonco.apis.bookstore.dtos.responses.BooksListDTO;
import com.gonco.apis.bookstore.repositories.BookRepository;
import com.gonco.apis.bookstore.services.utils.BooksUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class BookFindService {
    @Autowired
    private BookRepository bookRepository;

    public BooksListDTO findAll(){
        return BooksListDTO.builder()
                .books(bookRepository.findAll()
                        .stream()
                        .map(BooksUtil::toDTO)
                        .collect(Collectors.toList()))
                .build();
    }
}
