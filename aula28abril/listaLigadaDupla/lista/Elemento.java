package listaLigadaDupla.lista;

public class Elemento {

    private Object objeto;
    private Elemento proxm, ant;
    
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
    public Elemento getAnt() {
        return ant;
    }
    public void setAnt(Elemento ant) {
        this.ant = ant;
    }

    public Elemento(Object objeto, Elemento proxm, Elemento ant) {
        this.objeto = objeto;
        this.proxm = proxm;
        this.ant = ant;
    }

}
