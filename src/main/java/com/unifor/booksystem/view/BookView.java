// Define o pacote da camada de visão.
package com.unifor.booksystem.view;

import com.unifor.booksystem.model.Book;
import java.util.Scanner; // Importa a classe Scanner, conforme solicitado[cite: 34].

/**
 * View: Responsável pela interação com o usuário (entrada e saída de dados no console).
 * Não contém nenhuma regra de negócio.
 * Fonte: [cite: 7, 150]
 */
public class BookView {
    private Scanner scanner;

    public BookView() {
        this.scanner = new Scanner(System.in);
    }

    // Método para solicitar o título e retornar a entrada do usuário.
    public String getBookTitleInput() {
        System.out.print("Digite o título do livro: ");
        return scanner.nextLine();
    }

    // Método para solicitar o autor e retornar a entrada do usuário.
    public String getBookAuthorInput() {
        System.out.print("Digite o autor do livro: ");
        return scanner.nextLine();
    }

    // Método para solicitar o ano e retornar a entrada do usuário.
    public int getBookYearInput() {
        System.out.print("Digite o ano de publicação: ");
        // Tratamento básico de erro para garantir que um número seja inserido.
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número para o ano.");
            scanner.next(); // Descarta a entrada inválida.
            System.out.print("Digite o ano de publicação: ");
        }
        return scanner.nextInt();
    }

    // Método para exibir os detalhes do livro formatados no console[cite: 24].
    public void displayBookDetails(Book book) {
        System.out.println("\n--- Livro Registrado com Sucesso ---");
        System.out.println("Título: " + book.getTitle());
        System.out.println("Autor: " + book.getAuthor());
        System.out.println("Ano de Publicação: " + book.getPublicationYear());
        System.out.println("------------------------------------");
    }

    // Fecha o scanner para liberar recursos.
    public void closeScanner() {
        scanner.close();
    }
}