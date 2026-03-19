package Fila.Int;

public class Fila {
    private No inicio = null;
    private No fim = null;

    public void inserir(int valor) { // Agora recebe int
        No novoNo = new No();
        novoNo.setDado(valor);
        novoNo.setProximo(null);

        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
    }

    public void consultar() {
        No auxiliar = inicio;

        if (auxiliar == null) {
            System.out.println("A fila está vazia!");
            return;
        }

        while (auxiliar != null) {
            System.out.println("Valor: " + auxiliar.getDado());
            auxiliar = auxiliar.getProximo();
        }
    }

    public int excluir() { // Agora retorna int
        if (inicio == null) {
            System.out.println("Fila vazia!");
            return -1; // Valor de erro (pode ajustar se quiser)
        }

        No auxiliar = inicio;

        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.getProximo();
        }

        return auxiliar.getDado();
    }

    public int tamanho() {
        int cont = 0;
        No auxiliar = inicio;

        while (auxiliar != null) {
            cont++;
            auxiliar = auxiliar.getProximo();
        }

        return cont;
    }

    public int primeiro() {
        if (inicio != null) {
            return inicio.getDado();
        }

        System.out.println("Fila vazia!");
        return -1; // Valor de erro
    }

    public void limpar() {
        inicio = null;
        fim = null;
        System.out.println("A fila foi limpa!");
    }
}