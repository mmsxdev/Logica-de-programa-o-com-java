import java.util.LinkedList;

public class TabelaHashExterior {
    private LinkedList<Integer>[] tabela;
    private int tamanho;

    public TabelaHashExterior(int tamanho) {
        this.tamanho = tamanho;
        tabela = new LinkedList[tamanho];
        for (int i = 0; i < tamanho; i++) {
            tabela[i] = new LinkedList<>();
        }
    }

    private int funcaoHash(int chave) {
        return Math.abs(chave % tamanho);
    }

    public void inserir(int chave) {
        int pos = funcaoHash(chave);
        if (!tabela[pos].contains(chave)) {
            tabela[pos].addLast(chave);
        }
    }

    public boolean buscar(int chave) {
        int pos = funcaoHash(chave);
        return tabela[pos].contains(chave);
    }

    public void remover(int chave) {
        int pos = funcaoHash(chave);
        tabela[pos].remove(Integer.valueOf(chave));
    }
}
