import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Pilha pilha = new Pilha();
        int option = 0;
        int optionFila = 0;
        int optionPilha = 0;
        Object objFila = null;
        Object objPilha = null;

        do {
            String options[] = {
                    "FILA",
                    "PILHA",
                    "SAIR"
            };
            option = JOptionPane.showOptionDialog(null, null, "OPÇÕES",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            switch (option) {
                case 0:
                    String optionsFila[] = {
                            "INSERIR",
                            "REMOVER",
                            "PRIMEIRO ELEMENTO",
                            "ESTÁ VAZIA?",
                            "TAMANHO",
                            "SAIR"
                    };
                    optionFila = JOptionPane.showOptionDialog(null, null, "OPÇÕES",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsFila,
                            optionsFila[0]);
                        // opções para escolha relacionadas a FILA
                        switch (optionFila) {

                            case 0:
                                objFila = JOptionPane.showInputDialog(null, "Digite o que deseja inserir na fila:");
                                if (objFila == null) {
                                    JOptionPane.showMessageDialog(null, "ERRO AO ADICIONAR ELEMENTO NA FILA!",
                                    "ERROR", JOptionPane.WARNING_MESSAGE);
                                } else {
                                    fila.enqueue(objFila);
                                    JOptionPane.showMessageDialog(null, objFila + " ADICIONADO A FILA COM SUCESSO!",
                                    "CONFIRMAÇÃO DA INSERÇÃO", JOptionPane.WARNING_MESSAGE);
                                }
                                break;

                            case 1:
                                int optionRemoverElemFila = JOptionPane.showConfirmDialog(
                                        null, "Tem certeza que deseja remover o primeiro elemento da fila?", "OPÇÕES",
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE);
                                if (optionRemoverElemFila == 0) {
                                    if (fila.size() == 0) {
                                        JOptionPane.showMessageDialog(null, "Erro ao remover primeiro elemento da fila, pois ela esta vazia!!",
                                        "CONFIRMAÇÃO DA REMOÇÃO", JOptionPane.WARNING_MESSAGE);
                                    } else {
                                        fila.dequeue();
                                        JOptionPane.showMessageDialog(null,
                                                "Primeiro elemento da fila foi removido com sucesso",
                                                "CONFIRMAÇÃO DA REMOÇÃO", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                } else if (fila.size() == 0) {
                                    JOptionPane.showMessageDialog(null, "Erro ao remover ultimo elemento da fila, pois ela esta vazia!!",
                                            "CONFIRMAÇÃO DA REMOÇÃO", JOptionPane.WARNING_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Erro ao remover primeiro elemento da fila",
                                            "CONFIRMAÇÃO DA REMOÇÃO", JOptionPane.WARNING_MESSAGE);
                                }
                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null, "O primeiro elemento da fila é: " + fila.front(),
                                        "PRIMEIRO ELEMENTO DA FILA", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            case 3:
                                if (fila.empty()) {
                                    JOptionPane.showMessageDialog(null, "Sim, a fila está vazia",
                                            "A FILA ESTÁ VAZIA?", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Não, a fila não está vazia",
                                            "A FILA ESTÁ VAZIA?", JOptionPane.INFORMATION_MESSAGE);
                                }
                                break;

                            case 4:
                                JOptionPane.showMessageDialog(null, "Atualmente a fila tem " + fila.size() + " elemento(s)",
                                        "TAMNHO DA FILA", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            case 5:
                                JOptionPane.showMessageDialog(null, "...SAINDO DA FILA...");
                                break;

                            default: // saindo da fila
                                JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
                                break;

                        }
                    break;

                case 1:
                String optionsPilha[] = {
                    "INSERIR",
                    "REMOVER",
                    "PRIMEIRO ELEMENTO",
                    "ESTÁ VAZIA?",
                    "TAMANHO",
                    "SAIR"
            };
            optionPilha = JOptionPane.showOptionDialog(null, null, "OPÇÕES",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsPilha,
                    optionsPilha[0]);
                    // opções para escolha relacionadas a FILA
                        switch (optionPilha) {

                            case 0:
                                objPilha = JOptionPane.showInputDialog(null, "Digite o que deseja inserir na pilha:");
                                if (objPilha == null) {
                                    JOptionPane.showMessageDialog(null, "ERRO AO ADICIONAR ELEMENTO NA PILHA!",
                                    "ERROR", JOptionPane.WARNING_MESSAGE);
                                } else {
                                    pilha.push(objPilha);
                                    JOptionPane.showMessageDialog(null, objPilha + " ADICIONADO A PILHA COM SUCESSO!",
                                    "CONFIRMAÇÃO DA INSERÇÃO", JOptionPane.WARNING_MESSAGE);
                                }
                        break;

                            case 1:
                                int optionRemoverElemnPilha = JOptionPane.showConfirmDialog(
                                        null, "Tem certeza que deseja remover o primeiro elemento da pilha?", "OPÇÕES",
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE);
                                if (optionRemoverElemnPilha == 0) {
                                    if (pilha.size() == 0) {
                                        JOptionPane.showMessageDialog(null, "Erro ao remover ultimo elemento da pilha, pois ela esta vazia!!",
                                        "CONFIRMAÇÃO DA REMOÇÃO", JOptionPane.WARNING_MESSAGE);
                                } else {
                                        pilha.pop();
                                        JOptionPane.showMessageDialog(null,
                                                "ultimo elemento da pilha foi removido com sucesso",
                                                "CONFIRMAÇÃO DA REMOÇÃO", JOptionPane.INFORMATION_MESSAGE);

                                    }
                                } else if (pilha.size() == 0) {
                                    JOptionPane.showMessageDialog(null, "Erro ao remover ultimo elemento da pilha, pois ela esta vazia!!",
                                            "CONFIRMAÇÃO DA REMOÇÃO", JOptionPane.WARNING_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Erro ao remover ultimo elemento da pilha",
                                            "CONFIRMAÇÃO DA REMOÇÃO", JOptionPane.WARNING_MESSAGE);
                                }
                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null, "O primeiro elemento da pilha é: " + pilha.top(),
                                        "PRIMEIRO ELEMENTO DA pilha", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            case 3:
                                if (pilha.empty()) {
                                    JOptionPane.showMessageDialog(null, "Sim, a pilha está vazia",
                                            "A pilha ESTÁ VAZIA?", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Não, a pilha não está vazia",
                                            "A pilha ESTÁ VAZIA?", JOptionPane.INFORMATION_MESSAGE);
                                }
                                break;

                            case 4:
                                JOptionPane.showMessageDialog(null, "Atualmente a pilha tem " + pilha.size() + " elemento(s)",
                                        "TAMNHO DA pilha", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            case 5:
                                JOptionPane.showMessageDialog(null, "...SAINDO DA pilha...");
                                break;

                            default: // saindo da fila
                                JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
                                break;
                        }

                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "bye", "ENCERRANDO O PROGRAMA...", JOptionPane.DEFAULT_OPTION);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "bye", "ERROR...", JOptionPane.CANCEL_OPTION);
                    break;
            }
        } while (option != 2);

        /*
         * fila.enqueue(4);
         * fila.enqueue(1);
         * fila.enqueue(2);
         * fila.enqueue(3);
         * fila.dequeue();// remove o primeiro elemento da fila
         * System.out.println(fila.front()); // primeiro elemento da fila
         * System.out.println(fila.empty()); // está vazia?
         * System.out.println(fila.size());// tamanho da fila
         * 
         * pilha.push(1);
         * pilha.push(3);
         * pilha.push(2);
         * pilha.push(0);
         * pilha.pop();// remove o primeiro elemento da fila
         * System.out.println(pilha.top());// ultimo elemento da pilha
         * System.out.println(pilha.empty()); // está vazia?
         * System.out.println(pilha.size());// tamanho da pilha
         */
    }
}
