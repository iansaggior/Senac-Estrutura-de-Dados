package listaLigadaDupla.lista;

public class Contato {
    private int id;
    private String nome, telefone;
    private static int contador;
    
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Contato() {
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.id = ++contador;
    }
    
    @Override
    public String toString() {
        return "CONTATO" + 
        "\nID: " + id + 
        "\nNome: " + nome + 
        "\nTelefone: " + telefone + "\n";
    }

    /**
     * Método para atualizar o contato
     */
    public boolean atualizarContato(Contato contato, String telefone) {
        if (contato != null) {
            contato.setTelefone(telefone);
            return true;
        }
        return false;
    }

}