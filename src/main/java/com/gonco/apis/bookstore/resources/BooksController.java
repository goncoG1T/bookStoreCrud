package com.gonco.apis.bookstore.resources;

import com.gonco.apis.bookstore.dtos.responses.BooksListDTO;
import com.gonco.apis.bookstore.dtos.requests.BookDTO;
import com.gonco.apis.bookstore.services.BookFindService;
import com.gonco.apis.bookstore.services.BookSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BooksController {
    @Autowired
    private BookSaveService bookSaveService;
    @Autowired
    private BookFindService bookFindService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO saveABook(@RequestBody BookDTO saveRequestBook){
        return bookSaveService.save(saveRequestBook);
    }
    @GetMapping
    public BooksListDTO findAll(){
        return bookFindService.findAll();
    }

}
