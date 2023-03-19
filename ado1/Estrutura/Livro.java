package Estrutura;

import java.util.Random;

/**
 * Classe que representa um livro
 */
public class Livro {
    private int id;
    private String autor, titulo;
    private double preco;

    /**
     * Construtor que inicializa um novo livro com um id gerado aleatoriamente
     * 
     * @param autor  o autor do livro
     * @param titulo o título do livro
     * @param preco  o preço do livro
     */
    public Livro(String autor, String titulo, double preco) {
        this.id = gerarIdAleatorio();
        this.autor = autor;
        this.titulo = titulo;
        this.preco = preco;
    }

    /**
     * Construtor vazio
     */
    public Livro() {
    }

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
     * Representação formatada em string do livro
     */
    @Override
    public String toString() {
        return "ID: " + id +
                "\nAutor: " + autor +
                "\nTítulo: " + titulo +
                "\nPreço: R$" + preco + "\n";
    }

//  Armazenam números gerados
    private static int[] idsLivros = new int[5];
    private static int quantidadeLivros = 0;

    /**
     * Gera um número aleatório para o id do livro, não permitindo que os valores se repitam
     * @return id aleatório
     */
    private int gerarIdAleatorio() {
        int id;
        boolean checkId;

        do {
            id = new Random().nextInt(Integer.MAX_VALUE);
            checkId = false;

            for (int i = 0; i < quantidadeLivros; i++) {
                if (idsLivros[i] == id) {
                    checkId = true;
                    break;
                }
            }
        } while (checkId);

        idsLivros[quantidadeLivros++] = id;

        if (quantidadeLivros == idsLivros.length) {
            idsLivros = aumentarArray(idsLivros);
        }

        return id;
    }

    /**
     * Função para redimensionar o tamanho do array
     * @return novoArray
     */
    private int[] aumentarArray(int[] tamanhoArray) {
        int[] novoArray = new int[(int)(tamanhoArray.length * 1.5)];
        System.arraycopy(tamanhoArray, 0, novoArray, 0, tamanhoArray.length);
        return novoArray;
    }

}
