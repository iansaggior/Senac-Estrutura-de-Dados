/**
 * @author Ian
 */

public class Arvore {

    private Elemento raiz;
    private Elemento atual;
    private int cont = 0; // variavel para contar a quantidade de insercoes que foram realizadas
    private boolean aprovado = false;

    // método que grava qual aluno foi inserido na arvore primeiro
    public Elemento pegarRaiz() {
        return raiz;
    }

    // método que insere alunos na arvore
    public void inserir(Aluno aluno) {
        if (raiz == null) {
            raiz = new Elemento(aluno);
            cont++;
        } else {
            atual = new Elemento(aluno);
            inserir(atual, raiz);
            cont++;
        }
    }

    private void inserir(Elemento atual, Elemento e) {
        if (atual.getAluno().getId() >= e.getAluno().getId()) { // ir para direita, porque o ID é maior
            if (e.getDireita() == null) { // verifica se a direita está vazia
                e.setDireita(atual);
                atual.setRaiz(e);
            } else { // direita não está vazia
                inserir(atual, e.getDireita());
            }
        } else { // ir para esquerda, porque o ID é menor
            if (e.getEsquerda() == null) { // verifica se a esquerda está vazia
                e.setEsquerda(atual);
                atual.setRaiz(e);
            } else { // esquerda não está vazia
                inserir(atual, e.getEsquerda());
            }
        }
    }

    // método que ordena de modo crescente os alunos de acordo com o ID
    public void ordem(Elemento e) {
        if (e != null) {
            ordem(e.getEsquerda());
            System.out.print(e.getAluno().toString()); // visita e imprime o nó raiz
            ordem(e.getDireita());
        }
    }

    // método que calcula quantos alunos foram inseridos nas arvore
    public int tamanhoArvore() {
        return cont;
    }

    // método de pesquisa a partir do ID do aluno
    public Aluno pesquisarAluno(int id, Elemento e) {
        if (e != null) {
            if (e.getAluno().getId() == id) {
                return e.getAluno();
            } else {
                if (id > e.getAluno().getId()) {
                    return pesquisarAluno(id, e.getDireita());
                } else {
                    return pesquisarAluno(id, e.getEsquerda());
                }
            }
        }
        return null;
    }

    // com base nas horas faltadas, descobrimos se o aluno foi reprovado ou nao
    public boolean situacaoAprovacao(int id, Elemento e) {
        Aluno aluno = pesquisarAluno(id, e);
        if (aluno != null) {
            if (aluno.getFaltaHoras() > 18) {
                aprovado = false;
            } else {
                aprovado = true;
            }
        }
        System.out.println(aprovado);
        return aprovado;
    }

    // retorna a maior média obtida pelos alunos
    public double maiorMedia() {
        if (raiz == null) {
            return 0;
        }
        return maiorMedia(raiz);
    }

    private double maiorMedia(Elemento atual) {
        if (atual != null) {
            double maiorMediaEsquerda = maiorMedia(atual.getEsquerda());
            double maiorMediaDireita = maiorMedia(atual.getDireita());
            double maiorMediaAtual = atual.getAluno().getMedia();

            return Math.max(maiorMediaAtual, Math.max(maiorMediaEsquerda, maiorMediaDireita));
        }
        return 0;
    }

    // retorna a menor média obtida pelos alunos
    public double menorMedia() {
        if (raiz == null) {
            return 0;
        }
        return menorMedia(raiz);
    }

    private double menorMedia(Elemento atual) {
        if (atual != null) {
            double menorMediaEsquerda = menorMedia(atual.getEsquerda());
            double menorMediaDireita = menorMedia(atual.getDireita());
            double menorMediaAtual = atual.getAluno().getMedia();

            return Math.min(menorMediaAtual, Math.min(menorMediaEsquerda, menorMediaDireita));
        }
        return 10;
    }
}
