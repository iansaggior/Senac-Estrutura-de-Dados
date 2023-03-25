package listaSimplesmenteLigada.lista;

public class Elemento {

    private Object objeto;
    private Elemento proxm;
    
    public Object getObjeto() {
        return objeto;
    }
    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }
    public Elemento getProxm() {
        return proxm;
    }
    public void setProxm(Elemento proxm) {
        this.proxm = proxm;
    }
    
    public Elemento(Object objeto, Elemento proxm) {
        this.objeto = objeto;
        this.proxm = proxm;
    }


    

}
