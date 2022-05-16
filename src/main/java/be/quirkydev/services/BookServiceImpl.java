package be.quirkydev.services;

import be.quirkydev.entities.Book;
import be.quirkydev.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public Book getBookById(Long id) {
        return bookRepository.getById(id);
    }

    public List<Book> GetAllBooks() {
        return bookRepository.findAll();
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book editBook(Long id, Book book) {
        Book b =  bookRepository.getById(id);
        b.setTitle(book.getTitle());
        b.setAuthor(book.getAuthor());
        b.setPublisher(book.getPublisher());
        b.setSummary(book.getSummary());
        b.setPages(book.getPages());
        b.setLanguageId(book.getLanguageId());
        b.setFormatId(book.getFormatId());
        b.setGenres(book.getGenres());
        return bookRepository.save(b);
    }

    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }
}
