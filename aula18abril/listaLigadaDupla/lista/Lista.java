package listaLigadaDupla.lista;

public class Lista {
    /**
     * Atributo que representa a posição inicial da lista
     */
    Elemento inicio;
    /**
     * Atributo que representa a posição atual da lista
     */
    Elemento atual;
    /**
     * Atributo auxiliar da lista
     */
    Elemento aux;

    /**
     * Função que verifica se a lista está vazia ou não
     */
    public boolean verificar() {
        return inicio == null;
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
            novo = new Elemento(e.getProxm(),e, objeto );
            e.getProxm().setAnt(novo);
            e.setProxm(novo);
        } else {
            throw new IllegalArgumentException("Valor inválido");
        }
    }

    /**
     * Função de instância que insere objetos na lista
     * @param objeto Object
     */
    public void inserir(Object objeto) {
        if (verificar()) { // verifica se a lista está vazia
            inicio = new Elemento(null, null, objeto);
            aux = inicio;
        } else { // insere valores, que permanecem junto com a variavel atual
            atual = new Elemento(null, aux, objeto);
            aux.setProxm(atual);
            aux = atual;
        }
    }



    /**
     * Função de instância que exibe os objetos da lista
     * @param modo Modo
     */
    public void exibir(Modo modo) {
        Elemento e = inicio;
        if (modo.equals(Modo.DIREITA)) {
            while (e != null) {
                System.out.println(e.getObjeto());
                e = e.getProxm();
            }
        } else {
            e = atual;
            while (e != null) {
                System.out.println(e.getObjeto());
                e = e.getAnt();
            }
        }
    }

    /**
     * Função de instância para pesquisar objetos da lista a partir do ID, retornando o elemento
     * @param id int
     */
    public Elemento pesquisar(int id) {
        Elemento e = inicio;
        Contato c;
        while(e != null) {
            c = (Contato)e.getObjeto(); //cast
            if (id == c.getId()) {
                return e; // retorna o elemento
            }
            e = e.getProxm();
        }
        return null;
    }
    /**
     * 
     * Função de instância para pesquisar objetos da lista a partir do ID, retornando a informação
     * @param id int
     */
    public Object searchObject(int id) {
        Elemento e = inicio;
        Contato c;
        while(e != null) {
            c = (Contato)e.getObjeto(); //cast
            if (id == c.getId()) {
                return e.getObjeto(); //retorna a informação
            }
            e = e.getProxm();
        }
        return null;
    }

    /**
     * Função de instância para remover objetos da lista a partir do ID
     * @param id int
     */
    public boolean remover(int id) {
        Elemento e = (Elemento) searchObject(id);
        if (e != null) {
            if (e == inicio) {
                inicio = inicio.getProxm();
                inicio.setAnt(null);
                e.setProxm(null);
            } else if (e == atual) {
                atual = e.getAnt();
                aux = atual;
                aux.setProxm(null);
                e.setAnt(null);
            } else {
                e.getAnt().setProxm(e.getProxm());
                e.getProxm().setAnt(e.getAnt());
                e.setProxm(null);
                e.setAnt(null);
            }
            return true;
        }
        return false;
    }

    /**
     * Função atualiza algum elemento da lista
     * @param object Object
     */
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
}
