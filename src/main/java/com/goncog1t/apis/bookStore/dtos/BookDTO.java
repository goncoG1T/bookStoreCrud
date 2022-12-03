package com.goncog1t.apis.bookStore.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BookDTO {

    private String author;
    private String title;
    private String gender;

}
