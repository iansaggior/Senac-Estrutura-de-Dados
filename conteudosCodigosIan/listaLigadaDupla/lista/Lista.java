package listaLigadaDupla.lista;

public class Lista {


    private Elemento inicio, atual, aux;

    public boolean verificar(){
        return inicio == null;
    }

    
    /**
     * Função de instância que insere objetos na lista
     * @param objeto Object
     */
    public void inserir(Object objeto) {
        if (verificar()) {
            inicio = new Elemento(objeto, null, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null, aux);
            aux.setProxm(atual);
            aux = atual;
        }
    }

    /**
     * Função que insere elementos na lista a partir de um parametro
     * @param objeto Object
     * @param posicao int
     */ 
    public void inserir (Object objeto, int posicao) {
        if (posicao > 0 && posicao < tamanho()) {
            Elemento e = inicio, novo;
            for (int i = 1; i < posicao; i++) {
                e = e.getProxm();
            }
            novo = new Elemento(objeto, e.getProxm(), e );
            e.getProxm().setAnt(novo);
            e.setProxm(novo);
        } else {
            throw new IllegalArgumentException("Valor inválido");
        }
    }

    /**
     * Função que conta o tamanho da lista
     * @return cont
     */
    public int tamanho() {
        Elemento e = inicio;
        int cont = 0;
        while (e != null) {
            cont++;
            e = e.getProxm();
        }
        return cont;
    }

    /**
    * Função que exibe os elementos da lista
    */ 
    public void exibir() {
        Elemento e = inicio;
        while (e != null) {
            System.out.println(e.getObjeto());
            e = e.getProxm();
        }
    }

    /**
     * Realiza a busca linear em uma lista duplamente ligada
     * @param id int
     */
    public Elemento pesquisar(int id) {
        Elemento e = inicio;
        Contato c;
        while (e != null) {
            c = (Contato) e.getObjeto();
            if (id == c.getId()) {
                return e;
            }
            e = e.getProxm();
        }
        return null;
    }

    public Object searchObject(int id) {
        Elemento e = inicio;
        Contato c;
        while (e != null) {
            c = (Contato) e.getObjeto(); // cast
            if (id == c.getId()) {
                return e.getObjeto();
            }
            e = e.getProxm();
        }
        return null;
    }

    /**
     * Remove um elemento da lista duplamente ligada
     * considerando três casos:
     * Remoção do primeiro elemento, remoção do último e remoção de um elemento qualquer.
     * @param id int
     */
    public void remover(int id) {
        Elemento e = pesquisar(id);
        if (e != null) {
            if (e == inicio) { //1-Remoção do primero elemento
                inicio = e.getProxm();
                e.setProxm(null);
                inicio.setAnt(null);
            } else if (e == atual) { //2-Remoção do último elemento
                aux = e.getAnt();
                atual = aux;
                aux.setProxm(null);
                e.setAnt(null);
            } else {
                e.getAnt().setProxm(e.getProxm());
                e.getProxm().setAnt(e.getAnt());
                e.setProxm(null);
                e.setAnt(null);
            }
        }
    }

    public void atualizarElemento(Object object) {
        if (!verificar()) {
            Elemento e = inicio;
            while (e != null) {
                if (e == object) {
                    e = (Elemento) object;
                    return;
                }
                e = e.getProxm();
            }
        }
    }
    
}