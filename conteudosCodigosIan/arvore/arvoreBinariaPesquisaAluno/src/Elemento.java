/**
 * @author Ian
 */

public class Elemento {

    private Elemento raiz;
    private Elemento direita;
    private Elemento esquerda;
    private Aluno aluno;

    public Elemento(Aluno aluno) {
        this.aluno = aluno;
    }

    public Elemento getRaiz() {
        return raiz;
    }

    public void setRaiz(Elemento raiz) {
        this.raiz = raiz;
    }

    public Elemento getDireita() {
        return direita;
    }

    public void setDireita(Elemento direita) {
        this.direita = direita;
    }

    public Elemento getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Elemento esquerda) {
        this.esquerda = esquerda;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
