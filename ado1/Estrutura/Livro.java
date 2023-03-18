package Estrutura;

/**
 * Classe que representa um livro
 */
public class Livro {
    private int id = 0;
    private String autor, titulo;
    private double preco;

    // Gerando os métodos getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Construtor que inicializa um novo livro com um id gerado aleatoriamente
     * @param autor  o autor do livro
     * @param titulo o título do livro
     * @param preco  o preço do livro
     */
    public Livro(String autor, String titulo, double preco) {
        this.id = randomNumbers();
        this.autor = autor;
        this.titulo = titulo;
        this.preco = preco;
    }

    /**
     * Construtor que inicializa um novo livro com um id específico
     * @param id     o id do livro
     * @param autor  o autor do livro
     * @param titulo o título do livro
     * @param preco  o preço do livro
     */
    public Livro(int id, String autor, String titulo, double preco) {
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.preco = preco;
    }

    /**
     * Representação formatada em string do livro
     */
    @Override
    public String toString() {
        return "ID: " + id +
                "\nAutor: " + autor +
                "\nTítulo: " + titulo +
                "\nPreço: " + preco + "\n";
    }

    /**
     * Método do tipo boolean que aceita um parâmetro do tipo Livro e compara
     * apenas os valores dos atributos id dos dois objetos, não permitindo que os
     * valores se repitam
     * @param livro
     * @return true se os objetos forem iguais ou false caso contrário
     */
    public boolean checkEquals(Livro livro) {
        if (livro == null) {
            return false;
        }
        return this.id == livro.id;
    }

    /**
     * Gera um número aleatório para o id do livro (usando o valor máximo possível
     * com a constante Integer.MAX_VALUE)
     * @return um número aleatório para o id do livro
     */
    private static int randomNumbers() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }

}
