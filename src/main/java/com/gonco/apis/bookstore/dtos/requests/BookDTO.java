package com.gonco.apis.bookstore.dtos.requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BookDTO {
    private Long id;
    @NotBlank(message = "Author field must not be null.")
    private String author;
    @NotBlank(message = "Title field must be filled.")
    private String title;
    private String gender;

}
