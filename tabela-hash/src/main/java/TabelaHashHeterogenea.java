public class TabelaHashHeterogenea {
    class Item {
        Integer valor;
        int proximo = -1;
    }

    private Item[] tabela;
    private int M; // Área principal
    private int total;

    public TabelaHashHeterogenea(int M, int overflowSize) {
        this.M = M; //[cite: 45]
        this.total = M + overflowSize; //[cite: 40]
        tabela = new Item[total];
        for (int i = 0; i < total; i++) tabela[i] = new Item();
    }

    public void inserir(int chave) {
        int pos = Math.abs(chave % M); //[cite: 41]
        if (tabela[pos].valor == null) {
            tabela[pos].valor = chave;
        } else {
            // Insere na área de overflow (M até total-1)
            for (int i = M; i < total; i++) {
                if (tabela[i].valor == null) {
                    tabela[i].valor = chave;
                    int atual = pos;
                    while (tabela[atual].proximo != -1) atual = tabela[atual].proximo;
                    tabela[atual].proximo = i; //[cite: 47]
                    return;
                }
            }
        }
    }
}
