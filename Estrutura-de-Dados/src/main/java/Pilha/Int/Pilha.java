package Pilha.Int;

public class Pilha {
    private No topo = null;

    public void push (int valor){
        No novoNo = new No();
        novoNo.setDado(valor);

        novoNo.setProximo(topo);
        topo = novoNo;
    }

    public void consultar() {

        if (topo == null) {
            System.out.println("Pilha está vazia!");
        } else {
            No auxiliar = topo;
            System.out.println("Elementos da pilha:");

            while (auxiliar != null) {
                System.out.println("Valor: " + auxiliar.getDado());
                auxiliar = auxiliar.getProximo();
            }
        }
    }

    public int pop () {
        if (topo == null) {
            System.out.println("Pilha está vazia!");
            return -1;
        } else {
            int valorremovido = topo.getDado();
            topo = topo.getProximo();
            return valorremovido;
        }
    }
}
