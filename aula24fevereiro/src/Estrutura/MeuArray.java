package Estrutura;

public class MeuArray {
    private static Pessoa [] lista = new Pessoa[10000];
    private static int indice = 0;

    public static void inserir(Pessoa pessoa) {
        pessoa.setId(indice + 1);
        lista[indice++] = pessoa;
    }

    public static void mostarar() {
        for (int i = 0; i < indice; i++) {
            System.out.println(lista[i]);
            // System.out.println(lista[i].getNome());
            // System.out.println(lista[i].getIdade());
        }
    }
    
    /**
     * Realiza busca binaria no array de objetos
     * @param id
     * @return
     */
 
    public static Pessoa pesquisar(int id) {
        int inicio = 0, fim = indice - 1, meio;
        while (inicio <= fim) {
            meio = (fim + inicio)/2;
            if (id == lista[meio].getId()) {
                return lista[meio];
            } else if (id > lista[meio].getId()) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        System.out.println("Nào encontrado");   
        return null;
    }
    
}
