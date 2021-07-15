package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome: nomes )
            System.out.println("Nome: "+nome);

        nomes.set(2,"Roberto");
        System.out.println(nomes);

        String posicaoUm = nomes.get(1);
        System.out.println(posicaoUm);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("João");
        System.out.println(nomes);

        Integer qtdItensLista = nomes.size();
        System.out.println(qtdItensLista);

        boolean temJuliano = nomes.contains("Juliano");
        System.out.println(temJuliano);

        List<String> nomes2 = new ArrayList<>();

        nomes2.add("Ismael");
        nomes2.add("Rodrigo");

        System.out.println(nomes2);

        nomes.addAll(nomes2);
        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        boolean listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);
        nomes.clear();
        listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);
    }

}
