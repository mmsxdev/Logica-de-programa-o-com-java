package Lista;

import java.util.ArrayList;
import java.util.List;
public class CompartilhamentoLista {
    public static void main(String[] args) {

        List<String> alunos = new ArrayList<>();
        alunos.add("Ana");
        alunos.add("Bruno");

        List<String> professorA = new ArrayList<>(alunos);
        List<String> professorB = new ArrayList<>(alunos);

        professorA.add("Carlos");
        professorA.remove("Ana");
        professorA.add("João");

        professorB.add("Paulo");
        professorB.add("Leticia");

        System.out.println("Professor A: " + professorA);
        System.out.println("Tamanho lista professorA: " + professorA.size());
        System.out.println("Professor B: " + professorB);
        System.out.println("Tamanho lista professorB: " + professorB.size());
    }
}
