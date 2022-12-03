package com.goncog1t.apis.bookStore.services;

import org.springframework.stereotype.Service;

@Service
public class InitialService {
    public String concatName(String name, String lastName){
        return "Seu nome é "+ name + " " + lastName;
    }
}
