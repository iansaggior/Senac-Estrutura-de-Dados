package listaLigadaDupla.cliente;

import listaLigadaDupla.lista.*;

public class usaLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(new Contato("Mel", "1234-5678"));
        lista.inserir(new Contato("Gaia", "4567-7891"));
        lista.inserir(new Contato("Tonica", "5326-5124"));
        lista.inserir(new Contato("Ronda", "2451-3562"));

        //lista.remover(1);

        Elemento e = lista.pesquisar(2);
        if (e != null) {
            System.out.println("Objeto pesquisado:");
            System.out.println(e.getObjeto());
        } else {
            System.out.println("Não achei");
        }

        System.out.println("Tamanho da Lsita: " + lista.tamanho());

        Contato elemento1 = new Contato("aaaaa", "0000-0000");
        
        lista.inserir(elemento1, 3);
        
        lista.exibir();
    }
}
