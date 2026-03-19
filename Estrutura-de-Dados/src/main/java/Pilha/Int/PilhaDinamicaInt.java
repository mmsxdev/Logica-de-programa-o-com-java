package Pilha.Int;

public class PilhaDinamicaInt {
    public static void main(String[] args) {
        Pilha pilha1 = new Pilha();

        pilha1.push(1);
        pilha1.push(3);
        pilha1.push(5);

        pilha1.consultar();

        System.out.println("Topo da pilha: " + pilha1.pop());

        pilha1.consultar();
    }
}
