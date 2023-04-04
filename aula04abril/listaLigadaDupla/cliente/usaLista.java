package listaLigadaDupla.cliente;

import listaLigadaDupla.lista.*;

public class usaLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(new Contato("Mel", "1234-5678"));
        lista.inserir(new Contato("Gaia", "4567-7891"));
        lista.inserir(new Contato("Tonica", "5326-5124"));
        lista.inserir(new Contato("Ronda", "2451-3562"));
        lista.inserir(new Contato("Mustafa", "1937-9137"));
        lista.inserir(new Contato("Cleiton", "5934-2165"));

        /*
         * System.out.println("...PESQUISANDO...");
         * int numeroPesquisar = 1;
         * Elemento e = lista.pesquisar(numeroPesquisar);
         * if (e != null) {
         * System.out.println("Achouo contato de ID " + numeroPesquisar);
         * System.out.println(e.getObjeto());
         * } else {
         * System.out.println("Não achou o contato de ID " + numeroPesquisar);
         * }
         */

        /*
         * System.out.println("...REMOVENDO...");
         * int numeroRemover = 2;
         * if (lista.remover(numeroRemover)) {
         * System.out.println("Contato de ID: " + numeroRemover +
         * " removido com sucesso\n");
         * } else {
         * System.out.println("Contato de ID: " + numeroRemover + " não removido\n");
         * }
         */

        System.out.println("Conteúdo da lista:");
        lista.exibir(Modo.DIREITA);

        int numeroPesquisarAtualizar = 3;
        Object obj = lista.searchObject(numeroPesquisarAtualizar);
        Contato contato = (Contato) obj;
        contato.atualizarContato(contato, "0000-0000");
        lista.atualizarElemento(contato);
        lista.exibir(Modo.DIREITA);
    }
}
