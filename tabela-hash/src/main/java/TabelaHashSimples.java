public class TabelaHashSimples {
    private Integer[] tabela;
    private int tamanho;

    public TabelaHashSimples(int tamanho) {
        this.tamanho = tamanho;
        this.tabela = new Integer[tamanho];
    }

    private int funcaoHash(int chave) {
        return Math.abs(chave % tamanho);
    }

    public void inserir(int chave) {
        int pos = funcaoHash(chave);
        tabela[pos] = chave;
    }

    public Integer buscar(int chave) {
        int pos = funcaoHash(chave);
        if (tabela[pos] != null && tabela[pos] == chave) {
            return tabela[pos];
        }
        return null;
    }

    public void remover(int chave) {
        int pos = funcaoHash(chave);
        if (tabela[pos] != null && tabela[pos] == chave) {
            tabela[pos] = null;
        }
    }

    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(i + ": " + (tabela[i] == null ? "vazio" : tabela[i]));
        }
    }
}
