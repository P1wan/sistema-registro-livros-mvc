// Define o pacote, organizando o código na estrutura de pastas que criamos.
package com.unifor.booksystem.model;

/**
 * Model: Representa a entidade de dados do nosso sistema.
 * Contém apenas os dados e a lógica de negócio associada a esses dados.
 * Fonte: 
 */
public class Book {
    private String title;
    private String author;
    private int publicationYear;

    // Construtor para inicializar o objeto Book.
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Métodos "getters" para permitir que outras camadas acessem os dados de forma controlada.
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}