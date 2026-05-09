public class TabelaHashHomogenea {
    class Item {
        Integer valor;
        int proximo;

        Item() { this.valor = null; this.proximo = -1; }
    }

    private Item[] tabela;
    private int tamanho;

    public TabelaHashHomogenea(int tamanho) {
        this.tamanho = tamanho;
        tabela = new Item[tamanho];
        for (int i = 0; i < tamanho; i++) tabela[i] = new Item();
    }

    private int encontrarPosicaoLivre() {
        for (int i = tamanho - 1; i >= 0; i--) {
            if (tabela[i].valor == null) return i; //[cite: 32]
        }
        return -1;
    }

    public void inserir(int chave) {
        int pos = Math.abs(chave % tamanho);
        if (tabela[pos].valor == null) {
            tabela[pos].valor = chave; //[cite: 35]
        } else {
            int livre = encontrarPosicaoLivre();
            if (livre != -1) {
                tabela[livre].valor = chave;
                int atual = pos;
                while (tabela[atual].proximo != -1) atual = tabela[atual].proximo;
                tabela[atual].proximo = livre; //[cite: 33]
            }
        }
    }
    // buscar e remover seguem a lógica de percorrer os índices 'proximo' [cite: 36, 37]
}
