package Fila.Int;

public class FilaDinamicaInt {
    public static void main(String[] args) {
        Fila fila1 = new Fila();

        fila1.inserir(101);
        fila1.inserir(132);
        fila1.inserir(234);

        System.out.println("Tamanho atual: " + fila1.tamanho());
        System.out.println("Próximo da fila: " + fila1.primeiro());

        fila1.consultar();

        System.out.println("Atendendo: " + fila1.excluir());

        fila1.limpar();
        fila1.consultar();
    }
}

