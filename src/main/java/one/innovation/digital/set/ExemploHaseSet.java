package one.innovation.digital.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHaseSet {

    public static void main(String[] args) {
        //HashSet -> É performática, não permite ordenação, tem as função herdadas do Collections, como size(), isEmpty(), isEqual(), etc
        Set<Double> notaAlunos = new HashSet<>();

        notaAlunos.add(4.6);
        notaAlunos.add(6.8);
        notaAlunos.add(2.6);
        notaAlunos.add(1.9);
        notaAlunos.add(9.0);

        System.out.println(notaAlunos); //sem ordem

        //Removendo elemento
        notaAlunos.remove(9.0);
        System.out.println(notaAlunos);

        //Tamanho do HashSet
        System.out.println(notaAlunos.size());

        //Navega em todos os itens com o iterator
        Iterator iterator = notaAlunos.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Navegar em todos os itens com o for each
        for(Double notaAluno: notaAlunos){
            System.out.println(notaAluno);
        }

        //Limpar
        notaAlunos.clear();

        //Está vazio?
        System.out.println(notaAlunos.isEmpty()); //true
    }
}
