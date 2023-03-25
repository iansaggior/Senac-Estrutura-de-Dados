package listaSimplesmenteLigada.cliente;

import listaSimplesmenteLigada.lista.Contato;
import listaSimplesmenteLigada.lista.Produto;
import listaSimplesmenteLigada.lista.Lista;

public class usaLista {
    public static void main(String[] args) {
        //INSERINDO OBJETOS NA LISTA
        Lista lista = new Lista();
/*          lista.inserirContato(new Contato("Gerson", "1234-5678"));
        lista.inserirContato(new Contato("Mia", "5432-5678"));
        lista.inserirContato(new Contato("Anna", "1234-8520"));
        lista.inserirContato(new Contato("Claudio", "1597-3547"));
        lista.inserirContato(new Contato("José", "6230-5071"));
        lista.inserirContato(new Contato("Nair", "5498-3265"));  
        //MOSTRAR Os OBJETOS
        lista.exibirContatos();*/
        
        lista.inserirProduto(new Produto(20,"Sabonete", "Higiene Pessoal"));
        lista.inserirProduto(new Produto(15,"Maçã", "Alimentícia"));
        lista.inserirProduto(new Produto(29.99,"Desodorante", "Higiene Pessoal"));
        lista.inserirProduto(new Produto(17,"Água Saniária", "Limpeza"));
        lista.inserirProduto(new Produto(10.99,"Coca-Cola", "Alimentícia"));


        System.out.println("ANTES DO DESCONTO");
        //MOSTRAR Os OBJETOS
        lista.exibirProdutos();
        System.out.println("------------------------------------------------------------------------------------");

        //APLICAR O DESCONTO NOS PRODUTOS
        lista.desconto("Higiene Pessoal", 0.25);
        lista.desconto("Alimentícia", 0.1);
        lista.desconto("Limpeza", 0.15);

        System.out.println("DEPOIS DO DESCONTO");
        //MOSTRAR Os OBJETOS
        lista.exibirProdutos();

/*          //BUSCAR ELEMENTO PELO ID (Contato)
        int buscarIdContato = 4;
        //Object obj = lista.pesquisarIdContato(buscarIdContato);
        // lista.pesquisarId(buscarIdContato) é a mesma coisa que obj
        if (lista.pesquisarIdContato(buscarIdContato) != null) {
            Contato elemento = (Contato) lista.pesquisarIdContato(buscarIdContato);
            System.out.println("\nElemento encontrado");
            System.out.println(elemento);
        }
        else {
            System.out.println("Elemento não encontrado");
        } */

/*          //BUSCAR ELEMENTO PELO ID (Produto)
        int buscarIdProduto = 4;
        //Object obj = lista.pesquisarIdProduto(buscarIdProduto);
        // lista.pesquisarId(buscarIdProduto) é a mesma coisa que obj
        if (lista.pesquisarIdProduto(buscarIdProduto) != null) {
            Contato elemento = (Contato) lista.pesquisarIdProduto(buscarIdProduto);
            System.out.println("\nElemento encontrado");
            System.out.println(elemento);
        }
        else {
            System.out.println("Elemento não encontrado");
        }   */

    }
    
}
