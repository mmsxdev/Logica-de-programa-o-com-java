package br.com.projeto.util;

import br.com.projeto.model.Produto;
import java.util.Scanner;

/**
 * Classe com funções auxiliares para interação com o console.
 */
public class ConsoleUtil {

    /**
     * Imprime uma lista de produtos no console.
     * @param produtos O array de produtos a ser impresso.
     */
    public static void imprimirProdutos(Produto[] produtos) {
        if (produtos == null || produtos.length == 0) {
            System.out.println("Nenhum produto para listar.");
            return;
        }
        System.out.println("\n--- Lista de Produtos ---");
        for (Produto p : produtos) {
            if (p != null) {
                System.out.println(p);
            }
        }
        System.out.println("-------------------------\n");
    }

    /**
     * Exibe o menu principal da aplicação.
     */
    public static void exibirMenu() {
        System.out.println("--- Sistema de Gerenciamento de Produtos ---");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Ordenar por ID (Bubble Sort)");
        System.out.println("4 - Ordenar por Preço (Bubble Sort)");
        System.out.println("5 - Ordenar por Nome (Selection Sort)");
        System.out.println("6 - Buscar por ID (Sequencial)");
        System.out.println("7 - Buscar por Nome (Sequencial)");
        System.out.println("8 - Buscar por ID (Binária)");
        System.out.println("9 - Buscar por ID (Hash)");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }
}
