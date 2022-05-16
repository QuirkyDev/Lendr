package be.quirkydev.services;

import be.quirkydev.entities.Book;

import java.util.List;

public interface BookService {
    Book getBookById(Long id);
    List<Book> GetAllBooks();
    Book addBook(Book book);
    Book editBook(Long id,Book book);
    void deleteBook(Book book);
}
