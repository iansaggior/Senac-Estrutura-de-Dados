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
        String categoriaProduto;

        // INSERINDO OBJETOS NA LISTA
        Lista listaContato = new Lista();
        Lista listaProduto = new Lista();

        // INSERINDO ALGUNS OBJETOS NA LISTA CONTATO
        listaContato.inserirContato(new Contato("Mia", (long) 54325678));
        listaContato.inserirContato(new Contato("Anna", (long) 12348520));
        listaContato.inserirContato(new Contato("Claudio", (long) 15973547));
        listaContato.inserirContato(new Contato("José", (long) 62305071));
        listaContato.inserirContato(new Contato("Nair", (long) 54983265));
        listaContato.inserirContato(new Contato("Gerson", (long) 12345678));

        // INSERINDO ALGUNS OBJETOS NA LISTA PRODUTO
        listaProduto.inserirProduto(new Produto(20.12, "Sabonete", "Higiene Pessoal"));
        listaProduto.inserirProduto(new Produto(14.39, "Maçã", "Alimenticia"));
        listaProduto.inserirProduto(new Produto(29.99, "Desodorante", "Higiene Pessoal"));
        listaProduto.inserirProduto(new Produto(17.22, "Água Saniária", "Limpeza"));
        listaProduto.inserirProduto(new Produto(10.99, "Coca-Cola", "Alimenticia"));
        listaProduto.inserirProduto(new Produto(19.70, "Alcool 70%", "Limpeza"));

        do {
            String[] opcoes = { // opções de escolha para entrar no programa, Lista de Contatos, Lista de Produtos ou sair do programa
                    "Contato",
                    "Produto",
                    "Sair"
            };
            ImageIcon customIcon = new ImageIcon("C:../codando/listaSimplesmenteLigada/cliente/botaoOpcao.png"
            ); // imagem de um botao pedindo para o usuario selecionar alguma opção
            opcao = JOptionPane.showOptionDialog(null, null, "Cadastro de Elementos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, customIcon, opcoes, opcoes[0]);

            switch (opcao) { // tres opções de escolha, Lista de Contatos, Lista de Produtos ou sair do programa

                case 0: // Opções disponíveis na Lista de Contatos
                    String[] opcoesContato = {
                            "Cadastrar Novo Contato",
                            "Pesquisar Contato",
                            "Remover Contato",
                            "Mostrar Contatos",
                    }; // opções disponiveis para a lista Contatos
                    ImageIcon agenda = new ImageIcon("C:../codando/listaSimplesmenteLigada/cliente/agenda.png"
                    ); // imagem de uma agenda telefônica
                    opcaoContato = JOptionPane.showOptionDialog(null, null, "Cadastro de Elementos",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, agenda, opcoesContato, opcoesContato[0]);

                    switch (opcaoContato) {

                        case 0: // opção para cadastrar um Contato
                            String nomeContato = JOptionPane.showInputDialog(null, "Digite o nome do contato a ser cadastrado:");
                            String celularString = JOptionPane.showInputDialog(null, "Digite o número de telefone celular do contato a ser cadastrado:");
                            if (nomeContato == null || celularString == null || nomeContato.isEmpty()|| celularString.isEmpty() 
                            ) { // verificar se alguma variável não foi preenchida corretamente
                                JOptionPane.showMessageDialog(null, "Falha a cadastrar o Contato!", "AVISO", JOptionPane.WARNING_MESSAGE);
                            } else {
                                try {
                                    if (celularString.length() < 8 || celularString.length() > 9) { // Validação do tamanho de dígitos do número do celular
                                        JOptionPane.showMessageDialog(null, "Número de celular inválido. O número deve ter 8 ou 9 dígitos!!", "AVISO", JOptionPane.WARNING_MESSAGE);
                                    } else {
                                        celular = Long.parseLong(celularString);
                                        Contato contato = new Contato(nomeContato, celular);
                                        listaContato.inserirContato(contato);
                                        JOptionPane.showMessageDialog(null, "Contato cadastrado com sucesso!");
                                    }
                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "Telefone é do tipo númerico!! Tente novamente!!", "AVISO", JOptionPane.WARNING_MESSAGE);
                                }
                            }
                            break;

                        case 1: // opção para pesquisar um Contato
                            String idPesquisarContatoString = JOptionPane.showInputDialog("Digite o ID do Contato que deseja pesquisar:");
                            if (idPesquisarContatoString != null && !idPesquisarContatoString.isEmpty()) { // verificar se a variável não foi preenchida corretamente
                                try {
                                    idPesquisarContato = Integer.parseInt(idPesquisarContatoString
                                    ); // conversão da variável idPesquisarContatoString, que é uma String, para variável idPesquisarContato, que é um inteiro
                                    Object[] objArray = listaContato.pesquisarIdContato(idPesquisarContato);
                                    if (objArray != null) {
                                        Object obj = objArray[0];
                                        if (obj == null) {
                                            JOptionPane.showMessageDialog(null,
                                                    "Não achou o contato com o ID: " + idPesquisarContato + "!!", "AVISO", JOptionPane.WARNING_MESSAGE);
                                        } else {
                                            JOptionPane.showMessageDialog(null,
                                                    "Contato com o ID " + idPesquisarContato + " encontrado!!");
                                            JOptionPane.showMessageDialog(null, obj);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Não foi possível pesquisar o contato com o ID: " + idPesquisarContato + "!!", "AVISO", JOptionPane.WARNING_MESSAGE);
                                    }
                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "O ID deve ser um número inteiro válido!", "AVISO", JOptionPane.WARNING_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Falha ao pesquisar o ID de um contato", "AVISO", JOptionPane.WARNING_MESSAGE);
                            }
                            break;

                        case 2: // opção para remover um Contato
                            String idRemoverContatoString = JOptionPane
                                    .showInputDialog("Digite o ID do Contato que deseja remover:");
                            if (idRemoverContatoString != null) {
                                try {
                                    idRemoverContato = Integer.parseInt(idRemoverContatoString); // conversão da variável idRemoverContatoString, que é uma String, para variável idRemoverContato, que é um inteiro
                                    if (listaContato.removerIdContato(idRemoverContato)) {
                                        JOptionPane.showMessageDialog(null,
                                                "Removeu o contato de ID " + idRemoverContato + " com sucesso!!");
                                    } else {
                                        JOptionPane.showMessageDialog(null,
                                                "Não foi possivel remover o contato de ID: " + idRemoverContato + " porque ele não existe", "AVISO", JOptionPane.WARNING_MESSAGE);

                                    }
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "ID é do tipo númerico!! Tente novamente!!", "AVISO", JOptionPane.WARNING_MESSAGE);
                                    continue;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Falha ao remover o contato", "AVISO", JOptionPane.WARNING_MESSAGE);
                            }
                            break;

                        case 3: // opção para mostrar a Lista de Contatos
                            System.out.println(
                                    "--------------------------------------------------------------------------------------------------------");
                            listaContato.exibirContatos();
                            break;

                        default: // saindo da lista de contatos
                            JOptionPane.showMessageDialog(null, "...SAINDO...");
                            break;
                    }

                    break;

                case 1: // Opções disponíveis na Lista de Produtos

                    String[] opcoesProduto = {
                            "Cadastrar Novo Produto",
                            "Pesquisar Produto",
                            "Remover Produto",
                            "Aplicar Desconto no Produto",
                            "Mostrar Produtos",
                    }; // opções disponiveis para a lista Produtos
                    ImageIcon carrinho = new ImageIcon("C:../codando/listaSimplesmenteLigada/cliente/carrinho.png"); // imagem de um carrinho de compras
                    opcaoProduto = JOptionPane.showOptionDialog(null, null, "Cadastro de Produtos",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, carrinho, opcoesProduto,
                            opcoesProduto[0]);

                    switch (opcaoProduto) {

                        case 0: // opção para cadastrar produtos na Lista
                            String nomeProduto = JOptionPane.showInputDialog(null,
                                    "Digite o nome do produto a ser cadastrado");
                            String precoProdutoString = JOptionPane.showInputDialog(null,
                                    "Digite o preço do produto a ser cadastrado");
                            Object[] opcoesCategoria = { "Alimenticia", "Higiene Pessoal", "Limpeza" }; // Opções de categoria pré-definidas
                            int categoriaSelecionada = JOptionPane.showOptionDialog(null,
                                    "Selecione a categoria do produto","Categoria do Produto", JOptionPane.DEFAULT_OPTION, 
                                    JOptionPane.DEFAULT_OPTION, null,opcoesCategoria, opcoesCategoria[0]);
                                if (nomeProduto != null && precoProdutoString != null && categoriaSelecionada != -1) { // verificando seu alguma variavel não foi preenchida
                                    try {
                                        categoriaProduto = opcoesCategoria[categoriaSelecionada].toString();
                                        precoProduto = Double.parseDouble(precoProdutoString);
                                        Produto produto = new Produto(precoProduto, nomeProduto, categoriaProduto);
                                        listaProduto.inserirProduto(produto);
                                        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!!");
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null,
                                                "Preço é do tipo númerico!! Tente novamente!!", "Aviso", JOptionPane.WARNING_MESSAGE);
                                        continue;
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Falha a cadastrar o produto!", "AVISO", JOptionPane.WARNING_MESSAGE);
                                }

                            break;

                        case 1: // opção para pesquisar produtos na Lista
                            String idPesquisarProdutoString = JOptionPane.showInputDialog("Digite o ID do Produto que deseja pesquisar:");
                            if (idPesquisarProdutoString != null) {
                                try {
                                    idPesquisarProduto = Integer.parseInt(idPesquisarProdutoString); // conversão da variável idPesquisarProdutoString, que é uma String, para variável idPesquisarProduto, que é um inteiro
                                    Object obj = listaProduto.pesquisarIdProduto(idPesquisarProduto)[0];
                                    if (obj == null) {
                                        JOptionPane.showMessageDialog(null, "Não achou o produto com o ID: " + idPesquisarProduto + "!!", "AVISO", JOptionPane.WARNING_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Produto com o ID " + idPesquisarProduto + " encontrado!!");
                                        JOptionPane.showMessageDialog(null, obj);
                                    }
                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "ID é do tipo númerico!! Tente novamente!!", "AVISO", JOptionPane.WARNING_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Falha ao pesquisar o ID do Produto", "AVISO", JOptionPane.WARNING_MESSAGE);
                            }
                            break;

                        case 2: // opção para remover produtos na Lista
                            String idRemoverProdutoString = JOptionPane.showInputDialog("Digite o ID do Produto que deseja remover:");
                            if (idRemoverProdutoString != null) {
                                try {
                                    idRemoverProduto = Integer.parseInt(idRemoverProdutoString); // conversão da variável idRemoverProdutoString, que é uma String, para variável idRemoverProduto, que é um inteiro
                                    if (listaProduto.removerIdProduto(idRemoverProduto)) {
                                        JOptionPane.showMessageDialog(null, "Removeu o produto de ID " + idRemoverProduto + " com sucesso!!");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Não removeu o produto de ID: " + idRemoverProduto + " porque ele não existe", "AVISO", JOptionPane.WARNING_MESSAGE);
                                    }
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "ID é do tipo númerico!! Tente novamente!!", "AVISO", JOptionPane.WARNING_MESSAGE);
                                    continue;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Falha ao remover o produto", "AVISO", JOptionPane.WARNING_MESSAGE);
                            }
                            break;

                        case 3: // opção para aplicar descontos aos produtos da Lista
                            String[] categorias = { "Alimenticia", "Higiene Pessoal", "Limpeza" }; // categorias pré-definidas
                            int index = JOptionPane.showOptionDialog(null,
                                    "Selecione a categoria do produto que deseja aplicar o desconto:",
                                    "Seleção de categoria", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION,
                                    null, categorias, categorias[0]);
                            String descontoString = JOptionPane
                                    .showInputDialog("Digite a % (porcentagem) desconto que deseja aplicar");
                            if (index != -1 && descontoString != null) {
                                try {
                                    categoriaProduto = categorias[index];
                                    desconto = Double.parseDouble(descontoString);
                                    desconto = desconto / 100;
                                    listaProduto.desconto(categoriaProduto, desconto);
                                    JOptionPane.showMessageDialog(null, "Desconto aplicado com sucesso!!");
                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null,
                                            "Desconto é do tipo númerico!! Tente novamente!!", "AVISO", JOptionPane.WARNING_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Falha ao aplicar o desconto nos produtos", "AVISO", JOptionPane.WARNING_MESSAGE);
                            }
                            break;

                        case 4: // opção para mostrar os produtos da Lista
                            System.out.println(
                                    "--------------------------------------------------------------------------------------------------------");
                            listaProduto.exibirProdutos();
                            break;

                        default: // saindo da lista de Produtos
                            JOptionPane.showMessageDialog(null, "...SAINDO...");
                            break;
                    }

                    break;

                case 2: // opçãopara encerrar o programa
                    JOptionPane.showMessageDialog(null, "...ENCERRANDO PROGRAMA...");
                    System.out.println("*** PROGRAMA *** ENCERRADO ***");
                    break;

                default: // opção inválida
                    JOptionPane.showMessageDialog(null, "Opção inválida", "AVISO", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (opcao != 2);
    }
}
