package Pilha.String;

public class PilhaDinamicaString {
    public static void main(String[] args) {
        Pilha pilha1 = new Pilha();

        pilha1.push("Joao");
        pilha1.push("Paulo");
        pilha1.push("Victor");

        pilha1.consultar();

        System.out.println("Topo da pilha: " + pilha1.pop());

        pilha1.consultar();
    }
}
