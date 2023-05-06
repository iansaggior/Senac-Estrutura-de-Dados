public class Elemento {
    private Object objeto;
    private Elemento proximo, anterior;



    public Object getObjeto() {
        return objeto;
    }
    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }
    public Elemento getProximo() {
        return proximo;
    }
    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
    public Elemento getAnterior() {
        return anterior;
    }
    public void setAnterior(Elemento anterior) {
        this.anterior = anterior;
    }
    
    public Elemento(Object objeto, Elemento proximo, Elemento anterior) {
        this.objeto = objeto;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    

}
