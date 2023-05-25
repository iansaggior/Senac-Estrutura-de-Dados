import javax.swing.JOptionPane;

/**
 * @author Ian
 */

public class Main {
    public static void main(String[] args) throws Exception {
        Arvore arvore = new Arvore();

        int opcao;
        do {
            String[] opcoes = {
                    "Inserir aluno",
                    "Pesquisar aluno",
                    "Situação de aprovação",
                    "Relatório",
                    "Maior média",
                    "Menor média",
                    "Quantidade de alunos ",
                    "Sair"
            };
            opcao = JOptionPane.showOptionDialog(null, null, "Escolha uma opção",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

            switch (opcao) {
                case 0:
                    String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
                    int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota do aluno:"));
                    int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota do aluno:"));
                    int horasFaltadas = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite quantas horas o aluno faltou (carga horária da disciplina - 72 horas):"));

                    arvore.inserir(new Aluno(nome, nota1, nota2, horasFaltadas));
                    JOptionPane.showMessageDialog(null, "Aluno inserido com sucesso!");

                    break;

                case 1:
                    int alunoID = Integer
                            .parseInt(JOptionPane.showInputDialog("Digite o ID do aluno para pesquisa-lo:"));
                    if ((arvore.tamanhoArvore()) != 0) {
                        if (arvore.pesquisarAluno(alunoID, arvore.pegarRaiz()) == null) {
                            JOptionPane.showMessageDialog(null, "ALUNO NÃO ENCONTRADO", "AVISO",
                                    JOptionPane.WARNING_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    arvore.pesquisarAluno(alunoID, arvore.pegarRaiz()).toString(), "ALUNO ENCONTRADO: ",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Arvore vazia!");
                    }
                    break;

                case 2:
                    int alunoID2 = Integer.parseInt(JOptionPane
                            .showInputDialog("Digite o ID do aluno para verificar a situação de aprovação:"));
                    if (arvore.situacaoAprovacao(alunoID2, arvore.pegarRaiz()) == true) {
                        JOptionPane.showMessageDialog(null, "Não estourou o limite de faltas");
                    } else {
                        if (arvore.pesquisarAluno(alunoID2, arvore.pegarRaiz()) == null) {
                            JOptionPane.showMessageDialog(null, "ID nao encontrado");
                            break;
                        }
                        JOptionPane.showMessageDialog(null, "Está reprovado por falta");
                    }
                    break;

                case 3:
                    if ((arvore.tamanhoArvore()) != 0) {
                        System.out.println("...RELATÓRIO DOS ALUNOS...");
                        arvore.ordem(arvore.pegarRaiz());
                    } else {
                        JOptionPane.showMessageDialog(null, "Arvore vazia!");
                    }
                    break;

                case 4:
                    if ((arvore.tamanhoArvore()) != 0) {
                        JOptionPane.showMessageDialog(null, "A maior média é: " + arvore.maiorMedia());
                    } else {
                        JOptionPane.showMessageDialog(null, "Arvore vazia!");
                    }
                    break;

                case 5:
                    if ((arvore.tamanhoArvore()) != 0) {
                        JOptionPane.showMessageDialog(null, "A menor média é: " + arvore.menorMedia());
                    } else {
                        JOptionPane.showMessageDialog(null, "Arvore vazia!");
                    }
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Quantidade de alunos cadastrados: " + arvore.tamanhoArvore());
                    break;

                case 7:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Por favor, tente novamente.");
                    break;
            }
        } while (opcao != 7);
    }
}
