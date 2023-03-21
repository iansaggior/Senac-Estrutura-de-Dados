/*
 * ADO 1 - Estruturas de Dados
 * Ian Saggioratto Pereira
 * ID: 1142512281
 */

package Cadastro;

import Estrutura.Array;
import Estrutura.Livro;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int opcao;
        int preco = 0;
        int id = 0;
        do {
            Array.quickSort(0, Array.indice - 1);
            String[] opcoes = { "Cadastrar", "Remover", "Buscar", "Mostrar", "Sair" }; // lista as opções do
                                                                                       // usuário(Cadastrar, Remover,
                                                                                       // Buscar, Listar, Sair)
            ImageIcon customIcon = new ImageIcon("C:../ADO1/Cadastro/botaoo.png");
            opcao = JOptionPane.showOptionDialog(null, null, "Cadastro de Livros",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, customIcon, opcoes, opcoes[0]);

            switch (opcao) {
                case 0: // opção para cadastrar um livro
                    String autor = JOptionPane.showInputDialog(null, "Digite o nome do autor do livro:");
                    String titulo = JOptionPane.showInputDialog(null, "Digite o título do livro:");
                    String precoString = JOptionPane.showInputDialog(null, "Digite o preço do livro:");
                    if (autor != null && titulo != null && precoString != null) {
                        try {
                            preco = Integer.parseInt(precoString);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Preço é do tipo inteiro!! Tente novamente!!");
                            continue;
                        }
                        Livro livro = new Livro(autor, titulo, preco);
                        Array.inserirLivro(livro);
                        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Falha a cadastrar o livro!");
                    }
                    break;

                case 1: // opção para remover um livro pelo ID
                    Array.quickSort(0, Array.indice - 1);
                    String idString = JOptionPane.showInputDialog(null, "Digite o ID do livro que deseja remover:");
                    if (idString != null) {
                        try {
                            id = Integer.parseInt(idString);
                            if (Array.remover(id)) {
                                JOptionPane.showMessageDialog(null, "ID = " + id + " removido com sucesso");
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "Não foi possível remover o ID: " + id + " pois ele não existe");
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "ID é do tipo inteiro!! Tente novamente!!");
                            continue;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao remover o ID, favor inserir um valor!!");
                    }
                    break;

                case 2:// opção para buscar livro pelo título
                    Array.quickSort(0, Array.indice - 1);
                    String tituloBusca = JOptionPane.showInputDialog(null,
                            "Digite o título do livro que deseja buscar:");
                    Livro livroBusca = Array.buscaBinariaPorTitulo(tituloBusca);
                    if (livroBusca != null) {
                        JOptionPane.showMessageDialog(null, "Livro encontrado: " + livroBusca);
                    } else {
                        JOptionPane.showMessageDialog(null, "Livro não encontrado");
                    }
                    break;

                case 3: // opção para mostrar os livros cadastrados
                    Array.mostrar();
                    System.out.println(
                            "------------------------------------------------------------------------------------");
                    break;

                case 4: // opção para encerrar o programa
                    JOptionPane.showMessageDialog(null, "Encerrando programa...");
                    System.out.println("*** PROGRAMA *** ENCERRADO ***");
                    break;

                default: // opção inválida
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        } while (opcao != 4);
    }
}

// ***************************************************************************************
// OPÇÕES DE LIVROS PARA CADASTRAR
// ***************************************************************************************
// AUTOR - TÍTULO - PREÇO
// Robert Muchamore - Zona de Conflito - 170
// William Schakspea - Hamlet - 500
// R.J.Palaci - Extraordinario - 132
// John Green - A Culpa é Das Estrelas - 123
// Miguel De Cervantes - Dom Quixote De La Mancha - 350
// Mary Shelly - Frankenstein - 153
// Antoine De Saint-Exupéry - O Pequeno Príncipe - 620
// Homero - Odisseia - 750
// William Schakspear - Romeu e Julieta - 200
// Esopo - Fábulas de Esopo - 177
// Franz Kafka - O processo - 300
// Fitzgerald - O Grande Gatsby - 950
