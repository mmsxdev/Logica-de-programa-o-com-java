package Fila.String;

public class No {
    private String dado; // Alterado de int para String
    private No proximo;


    public String getDado() {
        return dado;
    }


    public void setDado(String dado) {
        this.dado = dado;
    }


    public No getProximo() {
        return proximo;
    }


    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
