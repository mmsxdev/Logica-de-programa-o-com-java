package br.com.projeto.service;

import br.com.projeto.model.Produto;

/**
 * Contém os algoritmos de ordenação.
 * Responsabilidade das Equipes 4 e 5.
 */
public class OrdenacaoService {

    /**
     * Ordena um vetor de produtos pelo ID usando o algoritmo Bubble Sort.
     * Responsabilidade da Equipe 4.
     * @param lista O vetor de produtos a ser ordenado.
     */
    public static void bubbleSortPorId(Produto[] lista) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista[j].id > lista[j + 1].id) {
                    // Troca lista[j] e lista[j+1]
                    Produto temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Ordena um vetor de produtos pelo Preço usando o algoritmo Bubble Sort.
     * Responsabilidade da Equipe 4.
     * @param lista O vetor de produtos a ser ordenado.
     */
    public static void bubbleSortPorPreco(Produto[] lista) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista[j].preco > lista[j + 1].preco) {
                    // Troca lista[j] e lista[j+1]
                    Produto temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Ordena um vetor de produtos pelo Nome usando o algoritmo Selection Sort.
     * Responsabilidade da Equipe 5.
     * @param lista O vetor de produtos a ser ordenado.
     */
    public static void selectionSortPorNome(Produto[] lista) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            // Encontra o índice do menor elemento no restante do array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                // Usa compareTo para comparar Strings
                if (lista[j].nome.compareToIgnoreCase(lista[min_idx].nome) < 0) {
                    min_idx = j;
                }
            }
            // Troca o menor elemento encontrado com o primeiro elemento (da parte não ordenada)
            Produto temp = lista[min_idx];
            lista[min_idx] = lista[i];
            lista[i] = temp;
        }
    }
}
