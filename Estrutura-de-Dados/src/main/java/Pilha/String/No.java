package Pilha.String;

public class No {
    private String dado;
    private No proximo;

    public No getProximo() {
        return proximo;
    }

    public String getDado() {
        return dado;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }
}
