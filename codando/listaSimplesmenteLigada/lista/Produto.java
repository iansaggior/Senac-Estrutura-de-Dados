package lista;

/*
 * Ian S pereira
 */
public class Produto {

    private double preco;
    private int id;
    private String nome, categoria;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Produto(double preco, String nome, String categoria) {
        this.preco = preco;
        this.nome = nome;
        this.categoria = categoria;
    }

    public Produto() {
    }

    @Override
    public String toString() {
        return "Produto: " +
                "\nID: " + id +
                "\nNome: " + nome +
                "\nPreço: R$" + String.format("%.2f", preco) +
                "\nCategoria: " + categoria + "\n";
    }

}
