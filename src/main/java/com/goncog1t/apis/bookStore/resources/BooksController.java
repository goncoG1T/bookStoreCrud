package com.goncog1t.apis.bookStore.resources;

import com.goncog1t.apis.bookStore.dtos.BookDTO;
import com.goncog1t.apis.bookStore.services.InitialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {
    @Autowired
    private InitialService initialService;

    @PostMapping
    public BookDTO saveABook(){
        return BookDTO.builder().build();
    }
    @GetMapping
    public List<BookDTO> getAlistOfBooks(){
        return new ArrayList<BookDTO>();
    }
    @GetMapping("/{id}")
    public BookDTO getABook(){
        return BookDTO.builder().build();
    }

    @DeleteMapping("/{id}")
    public void deleteABook(){

    }

    @PutMapping("/{id}")
    public BookDTO updateABook(){
        return BookDTO.builder().build();
    }
}
