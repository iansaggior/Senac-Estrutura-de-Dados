package lista;

/*
 *  Professor Gerson Risso
 */
public class Contato {
  private String nome;
  private String cel;
  private int id;

    public Contato() {
    }

    public Contato(String nome, String cel) {
        this.nome = nome;
        this.cel = cel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contato: " + 
        "\nid: " + id + 
        "\nNome: " + nome + 
        "\nTelefone: " + cel + "\n";
    }
  
}
