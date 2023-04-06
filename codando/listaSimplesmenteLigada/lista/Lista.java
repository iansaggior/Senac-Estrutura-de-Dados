package lista;

/*
 * Ian S pereira
 */
public class Lista {

    /**
     * Atributo que representa uma variável início
     */
    private Elemento inicio;
    /**
     * Atributo que representa uma variável atual
     */
    private Elemento atual;
    /**
     * Variável auxiliar
     */
    private Elemento aux;
    /**
     * Variavel auxiliar para contar o ID
     */
    private int cont = 0;

    /**
     * Método que verifica se a lista está vazia
     */
    public boolean verificar() {
        return inicio == null;
    }

    /**
     * Método criado para exibir a lista dos contatos
     */
    public void exibirContatos() {
        Elemento x = inicio;
        while (x != null) {
            System.out.println(x.getObjeto());
            x = x.getProx();
        }
    }

    /**
     * Método criado para exibir a lista dos produtos
     */
    public void exibirProdutos() {
        Elemento x = inicio;
        while (x != null) {
            System.out.println(x.getObjeto());
            x = x.getProx();
        }
    }

    /**
     * Método criado para inserir contatos na lista
     * 
     * @param objeto
     */
    public void inserirContato(Object objeto) {
        Contato contato = (Contato) objeto;// Cast
        contato.setId(++cont);
        if (verificar()) { // verifica se a lista está vazia
            inicio = new Elemento(null, objeto);
            aux = inicio;
        } else {
            atual = new Elemento(null, objeto);
            aux.setProx(atual);
            aux = atual;
        }
    }

    /**
     * Método criado para inserir produtos na lista
     * 
     * @param objeto
     */
    public void inserirProduto(Object objeto) {
        Produto produto = (Produto) objeto;// CAST - conversao temporária
        produto.setId(++cont);
        if (verificar()) { // verifica se a lista está vazia
            inicio = new Elemento(null, objeto);
            aux = inicio;
        } else {
            atual = new Elemento(null, objeto);
            aux.setProx(atual);
            aux = atual; // fica junto do atual
        }
    }

    /**
     * Realiza a pesquisa linear na lista simplesmente encadeada
     * e retorna um array com três informações. --
     * Pesquisa um contato pelo seu ID --
     * Índice 0 - Tipo Abstrato de Dados --
     * Índice 1 - Endereço do elemento a ser removido --
     * Índice 2 - Endereço do elemento anterior
     * 
     * @param id int
     * @return Object[]
     */
    public Object[] pesquisarIdContato(int id) {
        if (!verificar()) {
            Object[] v = new Object[3];
            Elemento e = inicio;
            Elemento auxRem = null;
            Contato c;
            while (e != null) {
                c = (Contato) e.getObjeto();
                if (id == c.getId()) {
                    v[0] = c;
                    v[1] = e;
                    v[2] = auxRem;
                    return v;
                }
                auxRem = e;
                e = e.getProx();
            }
        }
        return null;
    }

    /**
     * Realiza a pesquisa linear na lista simplesmente encadeada
     * e retorna um array com três informações
     * Pesquisa um produto pelo seu ID
     * Índice 0 - Tipo Abstrato de Dados
     * Índice 1 - Endereço do elemento a ser removido
     * Índice 2 - Endereço do elemento anterior
     * 
     * @param id int
     * @return Object[]
     */
    public Object[] pesquisarIdProduto(int id) {
        if (!verificar()) {
            Object[] v = new Object[3];
            Elemento e = inicio;
            Elemento auxRem = null;
            Produto p;
            while (e != null) {
                p = (Produto) e.getObjeto();
                if (id == p.getId()) {
                    v[0] = p;
                    v[1] = e;
                    v[2] = auxRem;
                    return v;
                }
                auxRem = e;
                e = e.getProx();
            }
        }
        return null;
    }

    /**
     * Realiza a remoção de um objeto na lista (Contatos)
     * 
     * @param id int
     */
    public boolean removerIdContato(int id) {
        if (!verificar()) {
            Object[] v = pesquisarIdContato(id);
            if (v != null) {
                Elemento e = (Elemento) v[1];
                Elemento auxRem = (Elemento) v[2];
                // 1 - Remoçao do primeiro elemento
                if (e == inicio) {
                    inicio = e.getProx();
                    e.setProx(null);
                    // 2 - Remoçao do último elemento
                } else if (e == atual) {
                    aux = auxRem;
                    atual = auxRem;
                    auxRem.setProx(null);
                    // 3 -Remoçao de um elemento qualquer
                } else {
                    auxRem.setProx(e.getProx());
                    e.setProx(null);
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /**
     * Realiza a remoção de um objeto na lista (Produtos)
     * 
     * @param id int
     */
    public boolean removerIdProduto(int id) {
        Object[] v = pesquisarIdProduto(id);
        if (v != null) {
            Elemento e = (Elemento) v[1];
            Elemento auxRem = (Elemento) v[2];
            // 1 - Remoçao do primeiro elemento
            if (e == inicio) {
                inicio = e.getProx();
                e.setProx(null);
                // 2 - Remoçao do último elemento
            } else if (e == atual) {
                aux = auxRem;
                atual = auxRem;
                auxRem.setProx(null);
                // 3 -Remoçao de um elemento qualquer
            } else {
                auxRem.setProx(e.getProx());
                e.setProx(null);
            }
            return true;
        }
        return false;
    }

    /**
     * Realiza o desconto de um produto de acordo com a categoria selecionada
     * 
     * @param categoria String
     * @param desconto  double
     */
    public void desconto(String categoria, double desconto) {
        if (verificar()) {
            return;
        } else {
            Elemento e = inicio;
            Produto p;
            double preco;
            while (e != null) {
                p = (Produto) e.getObjeto();
                if (categoria.equals(p.getCategoria())) {
                    preco = p.getPreco() - p.getPreco() * desconto;
                    p.setPreco(preco);
                }
                e = e.getProx();
            }

        }
    }

}
