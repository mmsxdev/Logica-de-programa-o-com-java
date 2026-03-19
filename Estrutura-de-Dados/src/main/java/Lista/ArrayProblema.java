package Lista;

import java.util.ArrayList;
import java.util.List;

public class ArrayProblema {
    public static void main(String[] args) {

        //  int[] notas = new int[3];
        //  notas[0] = 70;
        //  notas[1] = 80;
        //  notas[2] = 90;

        List<Integer> notas = new ArrayList<>();

        notas.add(70);
        notas.add(80);
        notas.add(90);
        notas.add(100);

        System.out.print("Notas: " + notas);
        System.out.println("Total de alunos na turma:" + notas.size());
    }
}
