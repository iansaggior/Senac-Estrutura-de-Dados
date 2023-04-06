package lista;

/*
 * Ian S pereira
 */

public class Contato {
    private String nome;
    private Long cel;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCel() {
        return cel;
    }

    public void setCel(Long cel) {
        this.cel = cel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contato() {
    }

    public Contato(String nome, Long cel) {
        this.nome = nome;
        this.cel = cel;
    }

    @Override
    public String toString() {
        return "Contato: " +
                "\nID: " + id +
                "\nNome: " + nome +
                "\nTelefone: " + cel + "\n";
    }

}
