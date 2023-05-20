package ArvoreBinariaPesquisa.arvore;

public class Arvore {
    private Elemento raiz;
    private Elemento atual;

    public Elemento getRaiz () {
        return raiz;
    }

    public void inserir(int n) {
        if (raiz == null) {
            raiz = new Elemento(n);

        } else {
            atual = new Elemento(n);
            inserir(atual, raiz);
        }
    }

    private void inserir(Elemento atual, Elemento e) {
        if (atual.getN() >= e.getN()) { // ir para direita
            if (e.getDireita() == null) { // verifica se a direita esta vazia
                e.setDireita(atual);
                atual.setR(e);
            } else { // direita nao esta vazia
                inserir(atual, e.getDireita());
            }
        } else { // ir para esquerda
            if (e.getEsquerda() == null) { // verifica se a esquerda esta vazia
                e.setEsquerda(atual);
                atual.setR(e);
            } else { // esquerda nao esta vazia
                inserir(atual, e.getEsquerda());
            }
        }
    }

    public void preOrdem(Elemento e) {
        if (e != null) {
            System.out.print(e.getN() + "\t"); // visitar o nó raiz
            preOrdem(e.getEsquerda());
            preOrdem(e.getDireita());
        }
    }
    
    public void posOrdem(Elemento e) {
        if (e != null) {
            posOrdem(e.getEsquerda());
            posOrdem(e.getDireita());
            System.out.print(e.getN() + "\t"); // visitar o nó raiz
        }
    }

    public void ordem(Elemento e) {
        if (e != null) {
            ordem(e.getEsquerda());
            System.out.print(e.getN() + "\t"); // visitar o nó raiz
            ordem(e.getDireita());
        }
    }

}
