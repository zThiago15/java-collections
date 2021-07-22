package one.innovation.digital.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Exercicio {

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //Adicionando 5 números inteiros(5, 88, 20, 44, 3)
        sequenciaNumerica.add(5);
        sequenciaNumerica.add(88);
        sequenciaNumerica.add(20);
        sequenciaNumerica.add(44);
        sequenciaNumerica.add(3);

        System.out.println(sequenciaNumerica);

        //Navegue no Set exibindo cada número no console(com Iterate e for each)
        System.out.println("Usando for each");
        for(Integer numero: sequenciaNumerica){
            System.out.println(numero);
        }


        System.out.println("Usando Iterator: ");
        Iterator iterator = sequenciaNumerica.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Remova o primeiro item do Set[5]
        sequenciaNumerica.remove(5);

        //Adiciona um novo número no Set: 23
        sequenciaNumerica.add(23);

        //Verifique o tamanho do Set
        System.out.println("Tamanho: "+ sequenciaNumerica.size());

        //Verifique se o Set está vazio
        System.out.println(sequenciaNumerica.isEmpty());

    }
}
