import java.util.Random;
import java.util.ArrayList;

/**
 * @author Ian
 */

public class Aluno {

    private String nome;
    private String situacaoFaltas;
    private double p1;
    private double p2;
    private double media;
    private int faltaHoras;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getFaltaHoras() {
        return faltaHoras;
    }

    public void setFaltaHoras(int faltaHoras) {
        this.faltaHoras = faltaHoras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSituacaoFaltas() {
        return situacaoFaltas;
    }

    public void setSituacaoFaltas(String situacaoFaltas) {
        this.situacaoFaltas = situacaoFaltas;
    }

    public Aluno(String nome, double p1, double p2, int faltaHoras) {
        this.id = gerarIdAleatorio();
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.faltaHoras = faltaHoras;
        calcularMedia(); // Chama o método para calcular e atribuir a média
        aprovFalta(); // verifica se o aluno esta reprovado por faltas ou nao
    }

    private void calcularMedia() {
        media = (p1 + p2) / 2;
    }

    private void aprovFalta() {
        if (faltaHoras > 18) {
            situacaoFaltas = "Reprovado por falta";
        } else {
            situacaoFaltas = "Não estourou o limite de faltas";
        }
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nNome: " + nome +
                "\np1: " + p1 +
                "\np2: " + p2 +
                "\nMedia: " + String.format("%.2f", media) +
                "\nHoras faltadas: " + faltaHoras +
                "\nSituação: " + situacaoFaltas + "\n\n";
    }

    private static ArrayList<Integer> idsGerados = new ArrayList<>();
    private static Random random = new Random();

    private int gerarIdAleatorio() {
        while (true) {
            int idGerado = random.nextInt(Integer.MAX_VALUE); // Gera um número aleatório
            if (!idsGerados.contains(idGerado)) {
                idsGerados.add(idGerado);
                return idGerado;
            }
        }
    }
}
