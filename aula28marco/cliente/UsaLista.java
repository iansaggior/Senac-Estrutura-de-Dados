package cliente;

/*
*  Professor Gerson Risso
 */
import lista.*;

public class UsaLista {

    public static void main(String[] args) {

        // INSERINDO OBJETOS NA LISTA
        Lista lista = new Lista();

        /*
         * //INSERINDO OBJETOS CONTATO NA LISTA
         * lista.inserirContato(new Contato("Gerson", "1234-5678"));
         * lista.inserirContato(new Contato("Mia", "5432-5678"));
         * lista.inserirContato(new Contato("Anna", "1234-8520"));
         * lista.inserirContato(new Contato("Claudio", "1597-3547"));
         * lista.inserirContato(new Contato("José", "6230-5071"));
         * lista.inserirContato(new Contato("Nair", "5498-3265"));
         * 
         * //MOSTRAR Os OBJETOS CONTATOS
         * lista.exibirContatos();
         * 
         * //BUSCAR ELEMENTO PELO ID (Contato)
         * int idPesquisarContato = 3; //váriavel que armazena o ID a ser buscado
         * Object obj = lista.pesquisarIdContato(idPesquisarContato)[0];
         * if (obj == null) {
         * System.out.println("Não achou o contato com o ID: " + idPesquisarContato +
         * "!!");
         * } else {
         * System.out.println("Contato com o ID " + idPesquisarContato +
         * " encontrado!!");
         * System.out.println(obj);
         * }
         * 
         * //REMOVER ELEMENTO PELO ID (Contato)
         * int idRemoverContato = 4; //váriavel que armazena o ID a ser removido
         * if (lista.removerIdContato(idRemoverContato)) {
         * System.out.println("Removeu o contato de ID " + idRemoverContato +
         * " com sucesso!!\n");
         * //MOSTRAR OS OBJETOS CONTATOS DEPOIS DA REMOÇÃO
         * System.out.println("Depois da remoção:");
         * lista.exibirContatos();
         * } else {
         * System.out.println("Não removeu o contato de ID: " + idRemoverContato);
         * }
         * 
         */

        /*
        // INSERINDO OBJETOS PRODUTO NA LISTA
        lista.inserirProduto(new Produto(20, "Sabonete", "Higiene Pessoal"));
        lista.inserirProduto(new Produto(15, "Maçã", "Alimentícia"));
        lista.inserirProduto(new Produto(29.99, "Desodorante", "Higiene Pessoal"));
        lista.inserirProduto(new Produto(17, "Água Saniária", "Limpeza"));
        lista.inserirProduto(new Produto(10.99, "Coca-Cola", "Alimentícia"));

        // MOSTRAR OS OBJETOS PRODUTOS
        System.out.println("ANTES DO DESCONTO");
        lista.exibirProdutos();
        System.out.println("------------------------------------------------------------------------------------\n");

        // APLICAR O DESCONTO NOS PRODUTOS
        lista.desconto("Higiene Pessoal", 0.25);
        lista.desconto("Alimentícia", 0.1);
        lista.desconto("Limpeza", 0.15);

        // MOSTRAR OS OBJETOS PRODUTOS
        System.out.println("DEPOIS DO DESCONTO");
        lista.exibirProdutos();

        // BUSCAR ELEMENTO PELO ID (Produto)
        int idPesquisarProduto = 3; // váriavel que armazena o ID a ser pesquisado
        Object obj2 = lista.pesquisarIdProduto(idPesquisarProduto)[0];
        if (obj2 == null) {
            System.out.println("Não achou!");
        } else {
            System.out.println("Produto com o ID " + idPesquisarProduto + " encontrado!!");
            System.out.println(obj2);
        }

        // REMOVER ELEMENTO PELO ID (Produto)
        int idRemoverProduto = 2; // váriavel que armazena o ID a ser removido
        if (lista.removerIdProduto(idRemoverProduto)) {
            System.out.println("Removeu o produto de ID " + idRemoverProduto);
            // MOSTRAR OS OBJETOS PRODUTOS DEPOIS DA REMOÇÃO
            System.out.println("DEPOIS DA REMOÇÃO:\n");
            lista.exibirProdutos();
        } else {
            System.out.println("Não removeu produto de ID " + idRemoverProduto);
        }
        */
    }
}
