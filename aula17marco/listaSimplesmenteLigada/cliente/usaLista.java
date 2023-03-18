package listaSimplesmenteLigada.cliente;

import listaSimplesmenteLigada.lista.Contato;
import listaSimplesmenteLigada.lista.Lista;

public class usaLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(new Contato("Gerson", "1234-5678"));
        lista.inserir(new Contato("Mia", "5432-5678"));
        lista.inserir(new Contato("Anna", "1234-8520"));
        lista.inserir(new Contato("Claudio", "1597-3547"));
        lista.inserir(new Contato("José", "6230-5071"));
        lista.inserir(new Contato("Nair", "5498-3265"));

        lista.exibir();
    }
    
}
