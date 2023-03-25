package listaSimplesmenteLigada.lista;

public class Lista {

    /**
     * Variavel início
    */
    private Elemento inicio;
    /**
     * Variavel atual
    */
    private Elemento atual;
    /**
     * Variavel auxiliar
    */
    private Elemento aux;
    /**
     * Variavel auxiliar para contar o ID
    */
    private int cont = 0;
    
    /**
     * Método criado para inserir produtos
     * @param objeto
    */
    public void inserirProduto(Object objeto) {
        Produto produto = (Produto)objeto;// CAST - conversao temporária
        produto.setId(++cont);
        if (inicio == null) { // verifica se a lista está vazia
            inicio = new Elemento(objeto, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null);
            aux.setProxm(atual);
            aux = atual; // fica junto do atual
        }
    }

    /**
     * Método criado para inserir contatos  
     * @param objeto
    */   
    public void inserirContato(Object objeto) {
        Contato contato = (Contato)objeto;// CAST - conversao temporária
        contato.setId(++cont);
        if (inicio == null) { // verifica se a lista está vazia
            inicio = new Elemento(objeto, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null);
            aux.setProxm(atual);
            aux = atual; // fica junto do atual
        }
    }


    /**
     * Método criado para exibir a lista dos contatos
     */
    public void exibirContatos() {

        Elemento x = inicio;

        while (x != null ) {
            System.out.println(x.getObjeto());
            x = x.getProxm();
        }
    }
    /**
     * Método criado para exibir a lista dos produtos
     */
    public void exibirProdutos() {

        Elemento x = inicio;

        while (x != null ) {
            System.out.println(x.getObjeto());
            x = x.getProxm();
        }
    }

    /**
     * Método de instância criado para pesquisar objetos pelo ID (Contatos)
     * @param id
    */
    public Object pesquisarIdContato(int id) {
        if (inicio == null) {
            return null;
        } else {
            Elemento e = inicio;
            Contato c;
            while (e != null) {
                c = (Contato)e.getObjeto();
                if (id == c.getId()) {
                    return c;
                }
                e = e.getProxm();
            }
        }
        return null;
    }

    /**
     * Método de instância criado para pesquisar objetos pelo ID (Produtos)
     * @param id
    */
    public Object pesquisarIdProduto(int id) {
        if (inicio == null) {
            return null;
        } else {
            Elemento e = inicio;
            Produto p;
            while (e != null) {
                p = (Produto)e.getObjeto();
                if (id == p.getId()) {
                    return p;
                }
                e = e.getProxm();
            }
        }
        return null;
    }

    public void desconto(String categoria, double desconto) {
        if (inicio == null) {
            return;
        } else {
            Elemento e = inicio;
            Produto p;
            double preco;
            while (e != null) {
                p = (Produto)e.getObjeto();
                if (categoria.equals(p.getCategoria())) {
                    preco = p.getPreco() - p.getPreco() * desconto;
                    p.setPreco(preco);
                }
                e = e.getProxm();
            }

        }
    }

}
