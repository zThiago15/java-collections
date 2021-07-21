package one.innovation.digital.list;

import java.util.*;

public class Exercicio {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        //Adicionando 5 nomes: Juliana, Pedro, Carlos, Larissa e João
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");


        System.out.println("Navegando pelas lista com for each: ");
        for(String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("Navegando na lista com Iterator: ");
        Iterator iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("->"+iterator.next());
        }

        //Substitua Carlos por Roberto
        nomes.set(2, "Roberto");
        System.out.println(nomes.get(2));

        //Retornando nome da posição 1
        System.out.println(nomes.get(1));

        //Removando nome da posição 4
        nomes.remove(4);

        //Remova o nome João
        nomes.remove("João"); //.remove() -> object or index

        //Retornando tamanho da lista
        System.out.println(nomes.size());

        //Verificando se Juliano existe na lista
        boolean temJuliano = nomes.contains("Juliano");
        System.out.println(temJuliano); //false

        //Criando lista com os nomes: Ismael e Rodrigo usando Vector
        List<String> irmaos = new Vector<>();

        irmaos.add("Ismael");
        irmaos.add("Rodrigo");
        System.out.println(irmaos);

        //Adicionando os itens da nova lista à primeira lista
        nomes.addAll(irmaos);

        System.out.println("Ordenando itens da 1 lista por ordem alfabética: ");
        Collections.sort(nomes);
        System.out.println(nomes);
        System.out.println();

        System.out.println("Verificando se a lista está vazia: ");
        boolean estaVazia = nomes.isEmpty();
        System.out.println(estaVazia);

    }
}
