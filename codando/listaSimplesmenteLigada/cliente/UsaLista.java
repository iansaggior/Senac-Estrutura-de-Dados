package cliente;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import lista.*;

/**
 * @author Ian S pereira
 */

public class UsaLista {

    public static void main(String[] args) {

        int opcao, opcaoContato, opcaoProduto;
        long celular;
        int idPesquisarContato, idRemoverContato, idPesquisarProduto, idRemoverProduto = 0;
        double precoProduto, desconto = 0;

        // INSERINDO OBJETOS NA LISTA
        Lista listaContato = new Lista();
        Lista listaProduto = new Lista();

        // INSERINDO ALGUNS OBJETOS CONTATO NA LISTA
        listaContato.inserirContato(new Contato("Mia", (long) 54325678));
        listaContato.inserirContato(new Contato("Anna", (long) 12348520));
        listaContato.inserirContato(new Contato("Claudio", (long) 15973547));
        listaContato.inserirContato(new Contato("José", (long) 62305071));
        listaContato.inserirContato(new Contato("Nair", (long) 54983265));
        listaContato.inserirContato(new Contato("Gerson", (long) 12345678));

        // INSERINDO ALGUNS OBJETOS PRODUTO NA LISTA
        listaProduto.inserirProduto(new Produto(20, "Sabonete", "Higiene Pessoal"));
        listaProduto.inserirProduto(new Produto(14, "Maçã", "Alimenticia"));
        listaProduto.inserirProduto(new Produto(29.99, "Desodorante", "Higiene Pessoal"));
        listaProduto.inserirProduto(new Produto(17, "Água Saniária", "Limpeza"));
        listaProduto.inserirProduto(new Produto(10.99, "Coca-Cola", "Alimenticia"));
        listaProduto.inserirProduto(new Produto(19.90, "Alcool 70%", "Limpeza"));

        do {
            String[] opcoes = {
                    "Contato",
                    "Produto",
                    "Sair"
            };
            ImageIcon customIcon = new ImageIcon("C:../codando/listaSimplesmenteLigada/cliente/botaoOpcao.png");
            opcao = JOptionPane.showOptionDialog(null, null, "Cadastro de Elementos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, customIcon, opcoes, opcoes[0]);

            switch (opcao) {

                case 0:
                    String[] opcoesContato = {
                            "Cadastrar Novo Contato",
                            "Pesquisar Contato",
                            "Remover Contato",
                            "Mostrar Contatos",
                    };
                    ImageIcon agenda = new ImageIcon("C:../codando/listaSimplesmenteLigada/cliente/agenda.png");
                    opcaoContato = JOptionPane.showOptionDialog(null, null, "Cadastro de Elementos",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, agenda, opcoesContato,
                            opcoesContato[0]);

                    switch (opcaoContato) {

                        case 0: // opção para cadastrar um Contato
                            String nomeContato = JOptionPane.showInputDialog(null,
                                    "Digite o nome do contato a ser cadastrado:");
                            String celularString = JOptionPane.showInputDialog(null,
                                    "Digite o número de telefone celular do contato a ser cadastrado:");
                            if (nomeContato != null || celularString != null) {
                                try {
                                    celular = Long.parseLong(celularString);
                                    Contato contato = new Contato(nomeContato, celular);
                                    listaContato.inserirContato(contato);
                                    JOptionPane.showMessageDialog(null, "Contato cadastrado com sucesso!");
                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null,
                                            "Telefone é do tipo númerico!! Tente novamente!!");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Falha a cadastrar o Contato!");
                            }
                            break;

                        case 1: // opção para pesquisar um Contato
                            String idPesquisarContatoString = JOptionPane
                                    .showInputDialog("Digite o ID do Contato que deseja pesquisar:");
                            if (idPesquisarContatoString != null) {
                                idPesquisarContato = Integer.parseInt(idPesquisarContatoString);
                                Object obj = listaContato.pesquisarIdContato(idPesquisarContato)[0];
                                if (obj == null) {
                                    JOptionPane.showMessageDialog(null,
                                            "Não achou o contato com o ID: " + idPesquisarContato + "!!");
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "Contato com o ID " + idPesquisarContato + " encontrado!!");
                                    JOptionPane.showMessageDialog(null, obj);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Falha ao pesquisar o ID de um contato");
                            }
                            break;

                        case 2: // opção para remover um Contato
                            String idRemoverContatoString = JOptionPane
                                    .showInputDialog("Digite o ID do Contato que deseja remover:");
                            if (idRemoverContatoString != null) {
                                try {
                                    idRemoverContato = Integer.parseInt(idRemoverContatoString);
                                    if (listaContato.removerIdContato(idRemoverContato)) {
                                        JOptionPane.showMessageDialog(null,
                                                "Removeu o contato de ID " + idRemoverContato + " com sucesso!!");
                                    } else {
                                        JOptionPane.showMessageDialog(null,
                                                "Não removeu o contato de ID: " + idRemoverContato);

                                    }
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "ID é do tipo númerico!! Tente novamente!!");
                                    continue;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Falha ao remover o contato");
                            }
                            break;

                        case 3: // opção para mostrar a Lista de Contatos
                            System.out.println(
                                    "--------------------------------------------------------------------------------------------------------");
                            listaContato.exibirContatos();
                            break;

                        default: // saindo
                            JOptionPane.showMessageDialog(null, "...SAINDO...");
                            break;
                    }

                    break;

                case 1:

                    String[] opcoesProduto = {
                            "Cadastrar Novo Produto",
                            "Pesquisar Produto",
                            "Remover Produto",
                            "Aplicar Desconto no Produto",
                            "Mostrar Produtos",
                    };
                    ImageIcon carrinho = new ImageIcon("C:../codando/listaSimplesmenteLigada/cliente/carrinho.png");
                    opcaoProduto = JOptionPane.showOptionDialog(null, null, "Cadastro de Produtos",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, carrinho, opcoesProduto,
                            opcoesProduto[0]);

                    switch (opcaoProduto) {

                        case 0: // opção para cadastrar produtos na Lista
                        String nomeProduto = JOptionPane.showInputDialog(null,
                                "Digite o nome do produto a ser cadastrado");
                        String precoProdutoString = JOptionPane.showInputDialog(null,
                                "Digite o preço do produto a ser cadastrado");
                        Object[] opcoesCategoria = {"Alimenticia", "Higiene Pessoal", "Limpeza"}; // Opções de categoria pré-definidas
                        int categoriaSelecionada = JOptionPane.showOptionDialog(null, "Selecione a categoria do produto",
                                "Categoria do Produto", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesCategoria, opcoesCategoria[0]);
                                String  categoriaProduto = opcoesCategoria[categoriaSelecionada].toString();
                            if (nomeProduto != null && precoProdutoString != null && categoriaProduto != null && categoriaProduto.length() > 0) {
                                if(categoriaSelecionada >= 0) {
                                    try {
                                        precoProduto = Double.parseDouble(precoProdutoString);
                                        Produto produto = new Produto(precoProduto, nomeProduto, categoriaProduto);
                                        listaProduto.inserirProduto(produto);
                                        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!!");
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null, "Preço é do tipo númerico!! Tente novamente!!");
                                        continue;
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Falha a cadastrar o produto!");
                            }

                        break;
                    

                        case 1: // opção para pesquisar produtos na Lista
                            String idPesquisarProdutoString = JOptionPane
                                    .showInputDialog("Digite o ID do Produto que deseja pesquisar:");
                            if (idPesquisarProdutoString != null) {
                                try {
                                    idPesquisarProduto = Integer.parseInt(idPesquisarProdutoString);
                                    Object obj = listaProduto.pesquisarIdProduto(idPesquisarProduto)[0];
                                    if (obj == null) {
                                        JOptionPane.showMessageDialog(null,
                                                "Não achou o produto com o ID: " + idPesquisarProduto + "!!");
                                    } else {
                                        JOptionPane.showMessageDialog(null,
                                                "Produto com o ID " + idPesquisarProduto + " encontrado!!");
                                        JOptionPane.showMessageDialog(null, obj);
                                    }
                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "ID é do tipo númerico!! Tente novamente!!");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Falha ao pesquisar o ID do Produto");
                            }
                            break;

                        case 2: // opção para remover produtos na Lista
                            String idRemoverProdutoString = JOptionPane
                                    .showInputDialog("Digite o ID do Produto que deseja remover:");
                            if (idRemoverProdutoString != null) {
                                try {
                                    idRemoverProduto = Integer.parseInt(idRemoverProdutoString);
                                    if (listaProduto.removerIdProduto(idRemoverProduto)) {
                                        JOptionPane.showMessageDialog(null,
                                                "Removeu o produto de ID " + idRemoverProduto + " com sucesso!!");
                                    } else {
                                        JOptionPane.showMessageDialog(null,
                                                "Não removeu o produto de ID: " + idRemoverProduto);

                                    }
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "ID é do tipo númerico!! Tente novamente!!");
                                    continue;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Falha ao remover o produto");
                            }
                            break;

                            case 3: // opção para aplicar descontos aos produtos da Lista
                            String[] categorias = {"Alimenticia", "Higiene Pessoal", "Limpeza"}; // categorias pré-definidas
                            int index = JOptionPane.showOptionDialog(null, "Selecione a categoria do produto que deseja aplicar o desconto:",
                                    "Seleção de categoria", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, categorias, categorias[0]);
                            if (index >= 0) {
                                categoriaProduto = categorias[index];
                                String descontoString = JOptionPane
                                        .showInputDialog("Digite o desconto(em porcentagem) que deseja aplicar");
                                if (descontoString != null) {
                                    try {
                                        desconto = Double.parseDouble(descontoString);
                                        desconto = desconto / 100;
                                        listaProduto.desconto(categoriaProduto, desconto);
                                        JOptionPane.showMessageDialog(null, "Desconto aplicado com sucesso!!");
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null,
                                                "Desconto é do tipo númerico!! Tente novamente!!");
                                    }
                        
                                } else {
                                    JOptionPane.showMessageDialog(null, "Falha ao aplicar o desconto nos produtos");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Falha ao selecionar a categoria do produto");
                            }
                            break;
                        

                        case 4: // opção para mostrar os produtos da Lista
                            System.out.println(
                                    "--------------------------------------------------------------------------------------------------------");
                            listaProduto.exibirProdutos();
                            break;

                        default: // saindo
                            JOptionPane.showMessageDialog(null, "...SAINDO...");
                            break;
                    }

                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "...ENCERRANDO PROGRAMA...");
                    System.out.println("*** PROGRAMA *** ENCERRADO ***");
                    break;

                default: // opção inválida
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        } while (opcao != 2);
    }
}
