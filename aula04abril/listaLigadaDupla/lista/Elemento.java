package listaLigadaDupla.lista;

public class Elemento {

    private Elemento proxm, ant;
    private Object objeto;
    
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

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public Elemento(Elemento proxm, Elemento ant, Object objeto) {
        this.proxm = proxm;
        this.ant = ant;
        this.objeto = objeto;
    }
    


    

}
