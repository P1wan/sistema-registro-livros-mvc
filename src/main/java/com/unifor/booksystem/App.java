// Define o pacote principal da aplicação.
package com.unifor.booksystem;

import com.unifor.booksystem.controller.BookController;
import com.unifor.booksystem.view.BookView;

/**
 * Classe principal que inicia a aplicação.
 * Sua única responsabilidade é instanciar os componentes MVC e iniciar o fluxo.
 * Fonte: 
 */
public class App {
    public static void main(String[] args) {
        // 1. Cria a instância da View.
        BookView view = new BookView();

        // 2. Cria a instância do Controller, injetando a View.
        BookController controller = new BookController(view);

        // 3. Inicia a execução do fluxo da aplicação.
        controller.run();
    }
}