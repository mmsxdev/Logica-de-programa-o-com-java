package Pilha.String;

public class Pilha {
    private No topo = null;

    public void push (String valor){
        No novoNo = new No();
        novoNo.setDado(valor);

        novoNo.setProximo(topo);
        topo = novoNo;
    }

    public void consultar() {
        No auxiliar = topo;

        if (auxiliar == null){
            System.out.println("Pilha está vazia!");
        } else {
            System.out.println("Elementos da pilha:");
            while (auxiliar != null) {
                System.out.println("Nome: " + auxiliar.getDado());
                auxiliar = auxiliar.getProximo();
            }
        }
    }

    public String pop (){
        if (topo == null){
            System.out.println("Pilha está vazia!");
            return String.valueOf(-1);
        }else{
            String valorremovido = topo.getDado();
            topo = topo.getProximo();
            return valorremovido;
        }
    }
}
