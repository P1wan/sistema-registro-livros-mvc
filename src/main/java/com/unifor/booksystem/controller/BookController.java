package com.unifor.booksystem.controller;

import com.unifor.booksystem.model.Book;
import com.unifor.booksystem.model.BookRepository;
import com.unifor.booksystem.view.BookView;


public class BookController {
    private BookRepository repository;
    private BookView view;


    public BookController(BookView view) {
        this.repository = new BookRepository();
        this.view = view;
    }


    public void registerBook(String title, String author, int year) {
        // Delega a criação do livro para a camada de negócio (Model).
        repository.createBook(title, author, year);

        // Pede ao Model o resultado da operação.
        Book registeredBook = repository.getLastRegisteredBook();

        // Envia o resultado para a View para exibição.
        view.displayBookDetails(registeredBook);
    }
}
