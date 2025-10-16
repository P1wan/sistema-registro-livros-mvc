package com.unifor.booksystem.view;

import com.unifor.booksystem.controller.BookController;
import com.unifor.booksystem.model.Book;
import java.util.Scanner;

/**
 * View: Ponto de entrada da aplicação e camada de interação com o usuário.
 * Inicia o fluxo, coleta os dados e os envia para o Controller.
 */
public class BookView {
    private BookController controller;
    private Scanner scanner;

    public BookView() {
        // A View agora cria sua instância do Controller, estabelecendo a conexão.
        this.controller = new BookController(this);
        this.scanner = new Scanner(System.in);
    }
    
    /**
     * Método que inicia a interação com o usuário.
     * Ela mesma gerencia a coleta de todos os dados antes de acionar o Controller.
     */
    public void start() {
        System.out.println("--- Sistema de Registro de Livros ---");

        System.out.print("Digite o título do livro: ");
        String title = scanner.nextLine();

        System.out.print("Digite o autor do livro: ");
        String author = scanner.nextLine();

        System.out.print("Digite o ano de publicação: ");
        int year = scanner.nextInt();

        // Após coletar todos os dados, a View aciona o Controller.
        controller.registerBook(title, author, year);
        
        scanner.close();
    }
    
    /**
     * Exibe os detalhes do livro. Este método é chamado pelo Controller
     * ao final do processo de registro.
     */
    public void displayBookDetails(Book book) {
        System.out.println("\n--- Livro Registrado com Sucesso ---");
        System.out.println("Título: " + book.getTitle());
        System.out.println("Autor: " + book.getAuthor());
        System.out.println("Ano de Publicação: " + book.getPublicationYear());
        System.out.println("------------------------------------");
    }

    /**
     * Ponto de entrada da aplicação.
     * A responsabilidade de iniciar o sistema agora é da própria View.
     */
    public static void main(String[] args) {
        BookView view = new BookView();
        view.start();
    }
}
