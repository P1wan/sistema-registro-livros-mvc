package com.unifor.booksystem.model;

/**
 * Model (Serviço/Repositório): Gerencia a coleção de dados e as operações de negócio.
 * Esta classe abstrai a fonte de dados. No momento, é apenas uma variável em memória,
 * mas poderia ser um banco de dados no futuro.
 */
public class BookRepository {
    // Para esta atividade, o "banco de dados" é apenas uma única variável.
    private Book lastRegisteredBook;

    /**
     * Cria uma nova instância de Book e a armazena.
     * Esta é a "regra de negócio" da camada Model.
     * @param title O título do livro.
     * @param author O autor do livro.
     * @param year O ano de publicação do livro.
     */
    public void createBook(String title, String author, int year) {
        this.lastRegisteredBook = new Book(title, author, year);
    }

    /**
     * Retorna o último livro que foi registrado.
     * @return O objeto Book mais recente.
     */
    public Book getLastRegisteredBook() {
        return this.lastRegisteredBook;
    }
}
