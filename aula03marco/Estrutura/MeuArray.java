package Estrutura;

public class MeuArray {

    private static Pessoa [] lista = new Pessoa[4];
    private static int indice = 0;

    public static void inserir(Pessoa pessoa) {
        if (indice == lista.length) {
            lista = alocarNovoArray();
        }
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
 
    public static int pesquisar(int id) {
        int inicio = 0, fim = indice - 1, meio;
        while (inicio <= fim) {
            meio = (fim + inicio)/2;
            if (id == lista[meio].getId()) {
                return meio;
            } else if (id > lista[meio].getId()) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        System.out.println("Nào encontrado");   
        return -1;
    }
    private static Pessoa[] alocarNovoArray() {
        Pessoa [] novo = new Pessoa[(int) (lista.length + ((lista.length) * (0.5)))];
    
//        for (int i = 0; i < lista.length; i++) {
//          novo[i] = lista[i];
//        }   
        System.arraycopy(lista, 0, novo, 0, lista.length);

        return novo;
    }
    public static boolean remover(int id) {
        int rem = pesquisar(id);
        if (rem != -1) {
            for (int i = rem; i < indice - 1; i++) {
                lista[i] = lista[i + 1];
            }
            indice--;
            return true;
        }
        return false;
    }

}
