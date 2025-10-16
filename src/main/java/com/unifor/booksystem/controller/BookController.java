// Define o pacote da camada de controle.
package com.unifor.booksystem.controller;

import com.unifor.booksystem.model.Book;
import com.unifor.booksystem.view.BookView;

/**
 * Controller: Orquestra o fluxo de comunicação entre a View e o Model.
 * Ele atua como um intermediário.
 * Fonte: [cite: 8, 156, 157]
 */
public class BookController {
    // O Controller possui referências para o Model e a View, mas não os instancia diretamente aqui.
    // Isso é um passo em direção ao princípio de Inversão de Dependência (D do SOLID).
    private BookView view;

    // O Controller recebe a View via construtor (Injeção de Dependência).
    public BookController(BookView view) {
        this.view = view;
    }

    /**
     * Método principal que executa o fluxo de registro do livro.
     * Este método implementa os requisitos funcionais da atividade.
     */
    public void run() {
        // 1. Solicita as informações do usuário através da View[cite: 20].
        String title = view.getBookTitleInput(); // Requisito do título[cite: 21].
        String author = view.getBookAuthorInput(); // Requisito do autor[cite: 22].
        int year = view.getBookYearInput(); // Requisito do ano[cite: 23].

        // 2. Cria o objeto Model com os dados coletados.
        // O Controller é responsável por instanciar o Model com base na entrada do usuário.
        Book book = new Book(title, author, year);

        // 3. Envia o Model para a View para exibição[cite: 24].
        view.displayBookDetails(book);
        
        // 4. Libera os recursos da View.
        view.closeScanner();
    }
}