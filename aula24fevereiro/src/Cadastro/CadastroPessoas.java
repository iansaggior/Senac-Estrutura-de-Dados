package Cadastro;

import Estrutura.Pessoa;
import Estrutura.MeuArray;

public class CadastroPessoas {
    public static void main(String[] args) {

        MeuArray.inserir(new Pessoa("Gerson", 31));
        MeuArray.inserir(new Pessoa("Sandra", 32));
        MeuArray.inserir(new Pessoa("Mel", 3));
        MeuArray.inserir(new Pessoa("Gaia", 4));
        MeuArray.mostarar();
        System.out.println("\n====== ...PESQUISANDO... ======");

        Pessoa p = MeuArray.pesquisar(2);
        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("Nào Achei");
        }
    }    
}
