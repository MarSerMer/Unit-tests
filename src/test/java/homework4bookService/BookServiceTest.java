package homework4bookService;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
public class BookServiceTest {


    @Test
    void getBookInformation() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        String bookName = "Книга огненных страниц";
        String bookName2 = "Охота на ведьм";

        bookService.getBookInformation(bookName);
        verify(bookService).getBookInformation(bookName);
        verify(bookService, times(1)).getBookInformation(anyString());

        verify(bookService, never()).getBookInformation(bookName2);
    }


}
