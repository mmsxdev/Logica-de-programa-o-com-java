package br.com.projeto.service;

import br.com.projeto.model.Produto;

/**
 * Implementação da Tabela Hash para busca rápida de produtos por ID.
 * Utiliza encadeamento para tratamento de colisões.
 * Responsabilidade da Equipe 6.
 */
public class TabelaHash {

    // Classe interna para representar os nós da lista encadeada (para colisões)
    private static class No {
        Produto produto;
        No proximo;

        No(Produto produto) {
            this.produto = produto;
            this.proximo = null;
        }
    }

    private No[] tabela;
    private int tamanho;

    public TabelaHash(int tamanho) {
        this.tamanho = tamanho;
        this.tabela = new No[tamanho];
    }

    /**
     * Função hash simples: index = id % tamanho.
     */
    private int funcaoHash(int id) {
        return id % tamanho;
    }

    /**
     * Insere um produto na tabela hash.
     */
    public void inserir(Produto p) {
        int index = funcaoHash(p.id);
        No novoNo = new No(p);

        if (tabela[index] == null) {
            tabela[index] = novoNo;
        } else {
            No atual = tabela[index];
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    /**
     * Busca um produto na tabela hash pelo seu ID.
     */
    public Produto buscar(int id) {
        int index = funcaoHash(id);
        No atual = tabela[index];

        while (atual != null) {
            if (atual.produto.id == id) {
                return atual.produto;
            }
            atual = atual.proximo;
        }

        return null;
    }
}
