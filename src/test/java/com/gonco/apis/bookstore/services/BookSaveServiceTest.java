package com.gonco.apis.bookstore.services;

import com.gonco.apis.bookstore.entities.Book;
import com.gonco.apis.bookstore.dtos.requests.BookDTO;
import com.gonco.apis.bookstore.repositories.BookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BookSaveServiceTest {
    @InjectMocks
    BookSaveService bookSaveService;
    @Mock
    BookRepository bookRepository;
    @Captor
    ArgumentCaptor<Book> bookSaveAC;

    @Test
    @DisplayName("Book Save Service :: Executing a save process successfully.")
    void save_test() {

        var mockBookDTO = BookDTO.builder().author("Dummy Name").title("A Title").gender("Drama").build();
        var mockBook = Book.builder().id(1L).author("Dummy Name").title("A Title").gender("Drama").build();
        when(bookRepository.save(any())).thenReturn(mockBook);

        var actual = bookSaveService.save(mockBookDTO);

        verify(bookRepository, times(1)).save(bookSaveAC.capture());
        assertAll(
                () -> Assertions.assertNotEquals(mockBookDTO.getId(), bookSaveAC.getValue().getId()),
                () -> Assertions.assertEquals(mockBookDTO.getTitle(), bookSaveAC.getValue().getTitle()),
                () -> Assertions.assertEquals(mockBookDTO.getAuthor(), bookSaveAC.getValue().getAuthor()),
                () -> Assertions.assertEquals(mockBookDTO.getGender(), bookSaveAC.getValue().getGender()),
                () -> Assertions.assertEquals(mockBook.getId(), actual.getId()),
                () -> Assertions.assertEquals(mockBook.getTitle(), actual.getTitle()),
                () -> Assertions.assertEquals(mockBook.getAuthor(), actual.getAuthor()),
                () -> Assertions.assertEquals(mockBook.getGender(), actual.getGender())
        );

    }
}
