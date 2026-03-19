package Fila.String;

public class Fila {
    private No inicio = null;
    private No fim = null;

    public void inserir(String valor) { // Agora recebe String
        No novoNo = new No();
        novoNo.setDado(valor);

        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
        novoNo.setProximo(null);
    }

    public void consultar() {
        No auxiliar = inicio;
        if (auxiliar == null) {
            System.out.println("A fila está vazia!");
        }
        while (auxiliar != null) {
            System.out.println("Nome: " + auxiliar.getDado());
            auxiliar = auxiliar.getProximo();
        }
    }

    public String excluir() { // Retorna String
        if (inicio == null) return null;


        No auxiliar = inicio;
        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.getProximo();
        }
        return auxiliar.getDado();
    }

    // Retorna a quantidade de elementos
    public int tamanho() {
        int cont = 0;
        No auxiliar = inicio;
        while (auxiliar != null) {
            cont++;
            auxiliar = auxiliar.getProximo();
        }
        return cont;
    }

    // Retorna o primeiro sem remover
    public String primeiro() {
        if (inicio != null) {
            return inicio.getDado();
        }
        return "Fila vazia";
    }

    // Remove todos os elementos
    public void limpar() {
        inicio = null;
        fim = null;
        System.out.println("A fila foi limpa!");
    }
}
