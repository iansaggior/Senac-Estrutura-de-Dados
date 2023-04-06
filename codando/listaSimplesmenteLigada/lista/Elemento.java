package lista;

/*
 * Ian S pereira
 */
public class Elemento {
    private Elemento prox;
    private Object objeto;

    public Elemento(Elemento prox, Object objeto) {
        this.prox = prox;
        this.objeto = objeto;
    }

    public Elemento getProx() {
        return prox;
    }

    public void setProx(Elemento prox) {
        this.prox = prox;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

}
