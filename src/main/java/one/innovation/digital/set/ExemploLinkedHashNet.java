package one.innovation.digital.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashNet {

    public static void main(String[] args) {

        //Tem os mesmos métodos que as outras interfaces
        LinkedHashSet<Integer> sequeciaNumero = new LinkedHashSet<>();

        sequeciaNumero.add(3);
        sequeciaNumero.add(7);
        sequeciaNumero.add(5);
        sequeciaNumero.add(1);
        sequeciaNumero.add(9);

        System.out.println(sequeciaNumero); //Mantém ordem de inserção

        //Remover número
        sequeciaNumero.remove(9);

        //Retornando os elementos com for each e iterator
        Iterator iterator = sequeciaNumero.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(Integer numero: sequeciaNumero){
            System.out.println(numero);
        }

    }
}
