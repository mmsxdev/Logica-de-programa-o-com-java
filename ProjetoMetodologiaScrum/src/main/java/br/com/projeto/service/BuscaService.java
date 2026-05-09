package br.com.projeto.service;

import br.com.projeto.model.Produto;

/**
 * Contém os algoritmos de busca.
 * Responsabilidade das Equipes 2 e 3.
 */
public class BuscaService {

    /**
     * Realiza uma busca sequencial em um vetor de produtos pelo ID.
     * Responsabilidade da Equipe 2.
     * @param lista O vetor de produtos.
     * @param id O ID a ser buscado.
     * @return O Produto encontrado ou null.
     */
    public static Produto buscaSequencial(Produto[] lista, int id) {
        for (Produto produto : lista) {
            if (produto != null && produto.id == id) {
                return produto;
            }
        }
        return null;
    }

    /**
     * Realiza uma busca sequencial em um vetor de produtos pelo Nome.
     * Responsabilidade da Equipe 2.
     * @param lista O vetor de produtos.
     * @param nome O nome a ser buscado.
     * @return O Produto encontrado ou null.
     */
    public static Produto buscaSequencial(Produto[] lista, String nome) {
        for (Produto produto : lista) {
            if (produto != null && produto.nome.equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    /**
     * Realiza uma busca binária em um vetor de produtos pelo ID.
     * IMPORTANTE: A lista DEVE estar ordenada por ID para que funcione.
     * Responsabilidade da Equipe 3.
     * @param lista O vetor de produtos ordenado por ID.
     * @param id O ID a ser buscado.
     * @return O Produto encontrado ou null.
     */
    public static Produto buscaBinaria(Produto[] lista, int id) {
        int inicio = 0;
        int fim = lista.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (lista[meio].id == id) {
                return lista[meio]; // Encontrou
            }

            if (lista[meio].id < id) {
                inicio = meio + 1; // Busca na metade direita
            } else {
                fim = meio - 1; // Busca na metade esquerda
            }
        }
        return null; // Não encontrou
    }
}
