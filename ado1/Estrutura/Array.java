package Estrutura;

public class Array {
    
    /**
     * Array de objetos "livros"
     */
    public static Livro[] lista = new Livro[5];
    public static int indice = 0;

    /**
     * Função para inserir um novo livro
     * @param livro
     */
    public static void inserirLivro(Livro livro) {
        if (indice < lista.length) {
            lista[indice++] = livro;
        } else{
            lista = aumentarArray();
            lista[indice++] = livro;
        }
    }

    /**
     * Função para redimensionar o tamanho do array
     * @return listaNova
     */
    public static Livro[] aumentarArray() {
        Livro[] listaNova = new Livro[(int)(lista.length * 1.5)];
        System.arraycopy(lista, 0, listaNova, 0, lista.length);
        return listaNova;
    }

    /**
     * Função para remover o item do array pelo id, alterando o seu tamanho
     * @param id
     */
    public static void remover(int id) {
        Livro[] listaNova = new Livro[indice];
        for (int i = 0, j = 0; i < indice; i++) {
            if (lista[i].getId() != id) {
                listaNova[j++] = lista[i];
            }
        }
        lista = listaNova;
    }

    /**
     * Função para mostrar os itens do array, já ordenados
     * @return livros
     */
    public static void mostrar() {
        quickSort(0, indice - 1);
        int controle = 0;
        for (Livro i : lista) {
            if (i != null) {
                System.out.println(i);
            }
            if (i == null) {
                controle++;
            }
        }
        if (controle == indice) {
            System.out.println("[vazio]");
        }
    }




    /**
     * Implementação do algoritmo QuickSort para ordenação de objetos Livro por título
     * @param inicio o índice de início da partição a ser ordenada
     * @param fim o índice de fim da partição a ser ordenada
     */
    public static void quickSort(int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = particao(inicio, fim);
            quickSort(inicio, posicaoPivo - 1);
            quickSort(posicaoPivo + 1, fim);
        }
    }

    /**
     * Realiza a partição do array de Livros para o algoritmo QuickSort por título
     * @param inicio o índice de início da partição a ser ordenada
     * @param fim o índice de fim da partição a ser ordenada
     * @return a posição do pivô após a partição
     */
    private static int particao(int inicio, int fim) {
        Livro pivo = lista[inicio];
        int i = inicio + 1;
        int f = fim;
        while (i <= f) {
            if (lista[i].getTitulo().compareToIgnoreCase(pivo.getTitulo()) <= 0) {
                i++;
            } else if (pivo.getTitulo().compareToIgnoreCase(lista[f].getTitulo()) < 0) {
                f--;
            } else {
                Livro troca = lista[i];
                lista[i] = lista[f];
                lista[f] = troca;
                i++;
                f--;
            }
        }
        lista[inicio] = lista[f];
        lista[f] = pivo;
        return f;
    }

    /**
     * Realiza a busca binária por título no array (array tem que estar ordenado)
     * @param titulo 
     * @return o livro encontrado ou não
     */
    public static Livro buscaBinariaPorTitulo(String titulo) {
        quickSort(0, indice - 1);
        int inicio = 0;
        int fim = indice - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comparacao = lista[meio].getTitulo().compareToIgnoreCase(titulo);
            if (comparacao == 0) {
                return lista[meio];
            } else if (comparacao < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return null;
    }
}