package ado2;

public class Elemento {
    
    private Elemento r;
    private Elemento direita;
    private Elemento esquerda;
    private int n;

    public Elemento(int n) {
        this.n = n;
    }

    public Elemento getR() {
        return r;
    }

    public void setR(Elemento r) {
        this.r = r;
    }

    public Elemento getDireita() {
        return direita;
    }

    public void setDireita(Elemento direita) {
        this.direita = direita;
    }

    public Elemento getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Elemento esquerda) {
        this.esquerda = esquerda;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }



}
