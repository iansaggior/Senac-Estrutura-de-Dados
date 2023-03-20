/*
 *  ADO 1 - Estruturas de Dados
 *  Ian Saggioratto Pereira
 */

 package Cadastro;

 // Fazendo os import das classes Livro e Array
 import Estrutura.Livro;
 import Estrutura.Array;
 
 public class Main {
     public static void main(String[] args) {
 
         // Comando para inserir livros
         Array.inserirLivro(new Livro("Robert Muchamore", "Zona de Conflito", 170));
         Array.inserirLivro(new Livro("William Schakspear", "Hamlet", 500));
         Array.inserirLivro(new Livro("R.J.Palacio", "Extraordinario", 132));
         Array.inserirLivro(new Livro("John Green", "A Culpa é Das Estrelas", 123));
         Array.inserirLivro(new Livro("Miguel De Cervantes", "Dom Quixote De La Mancha", 350));
         Array.inserirLivro(new Livro("Mary Shelly", "Frankenstein ", 153));
         Array.inserirLivro(new Livro("Antoine De Saint-Exupéry", "O Pequeno Príncipe", 220));
         Array.inserirLivro(new Livro("Homero", "Odisseia", 75));
         Array.inserirLivro(new Livro("William Schakspear", "Romeu e Julieta", 200));
         Array.inserirLivro(new Livro("Esopo", "Fábulas de Esopo", 177));
         Array.inserirLivro(new Livro("Franz Kafka", "O processo", 300));
         Array.inserirLivro(new Livro("Fitzgerald", "O Grande Gatsby", 95));


         //  Realiza a busca por título no array
         Livro livroEncontrado = Array.buscaBinariaPorTitulo("extraordinario"); // mudar o parametro para fazer a busca
         if (livroEncontrado != null) {
             System.out.println("\nLivro encontrado:\n" + livroEncontrado);
         } else {
             System.out.println("\nLivro não encontrado");
         }
          System.out.println();
          

 
         //  Remover um livro do array por ID
         // !!AVISO!! OS IDs SÃO ALEATÓRIOS, ENTÃO CASO QUEIRA FAZER A REMOÇÃO, É NECESSÁRIO SABER O ID ANTES
         int idSelecionado = 0; // mudar o parametro para fazer a remoção
         if (Array.remover(idSelecionado)) {
            System.out.println("ID = " + idSelecionado + " removido com sucesso");
        } else {
            System.out.println("Cadastro não removido");
        }
        System.out.println();
 
         // Comando para mostrar os livros
         Array.mostrar();
 
 
     }
 }
