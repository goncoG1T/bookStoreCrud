package com.gonco.apis.bookstore.dtos.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.gonco.apis.bookstore.dtos.requests.BookDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BooksListDTO {
    private List<BookDTO> books;
}
