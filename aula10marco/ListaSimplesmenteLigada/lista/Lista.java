package ListaSimplesmenteLigada.lista;

public class Lista {

    private Elemento inicio, atual, aux;

    public void inserir(Object objeto) {
        if (inicio == null) {
            inicio = new Elemento(objeto, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null);
            aux.setProx(atual);
            aux = atual;
        }
    }
}
