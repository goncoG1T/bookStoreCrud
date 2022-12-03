package com.goncog1t.apis.bookStore.resources;

import com.goncog1t.apis.bookStore.services.InitialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitialController {
    @GetMapping("/")
    public String initial(){
        return "Book storage online!!";
    }
}
