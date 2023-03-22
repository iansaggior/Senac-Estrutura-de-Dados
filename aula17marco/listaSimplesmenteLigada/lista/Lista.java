package listaSimplesmenteLigada.lista;

public class Lista {

    /**
     * Variavel início
    */
    private Elemento inicio;
    /**
     * Variavel atual
    */
    private Elemento atual;
    /**
     * Variavel auxiliar
    */
    private Elemento aux;
    /**
     * Variavel auxiliar para contar o ID
    */
    private int cont = 1;
    
    /**
     * Método criado para inserir objetos
     * @param objeto
    */
    public void inserir(Object objeto) {
        Contato contato = (Contato)objeto;
        contato.setId(cont++);
        if (inicio == null) { // verifica se a lista está vazia
            inicio = new Elemento(objeto, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null);
            aux.setProxm(atual);
            aux = atual; // fica junto do atual
        }
    }


    /**
     * Método criado para exibir a lista
     */
    public void exibir() {

        Elemento x = inicio;

        while (x != null ) {
            System.out.println(x.getObjeto());
            x = x.getProxm();
        }
    }


}
