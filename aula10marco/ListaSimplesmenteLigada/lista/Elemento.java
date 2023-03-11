package ListaSimplesmenteLigada.lista;

public class Elemento {

    private Object objeto;
    private Elemento prox;
    
    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public Elemento getProx() {
        return prox;
    }

    public void setProx(Elemento prox) {
        this.prox = prox;
    }

    public Elemento(Object objeto, Elemento prox) {
        this.objeto = objeto;
        this.prox = prox;
    }

}