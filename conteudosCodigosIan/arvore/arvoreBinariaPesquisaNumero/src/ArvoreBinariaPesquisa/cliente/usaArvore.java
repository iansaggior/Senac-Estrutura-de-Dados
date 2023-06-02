package ArvoreBinariaPesquisa.cliente;

import ArvoreBinariaPesquisa.arvore.Arvore;

public class usaArvore {
    public static void main(String[] args) {

        Arvore arvore = new Arvore();
        arvore.inserir(40);
        arvore.inserir(32);
        arvore.inserir(15);
        arvore.inserir(36);
        arvore.inserir(50);
        arvore.inserir(60);
        

        //arvore.ordem(arvore.getRaiz());
        if (arvore.pesquisar(15, arvore.getRaiz())) {
            System.out.println("Achou");
        } else  {
            System.out.println("Nao achou");
        }

        System.out.println("O tamanho da arvore é: " + arvore.tamanhoArvore());

    }
}
