package one.innovation.digital.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exercicio {

    public static void main(String[] args) {

        Queue<String> pessoas = new LinkedList<>();

        //Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
        pessoas.add("Juliana");
        pessoas.add("Pedro");
        pessoas.add("Carlos");
        pessoas.add("Larissa");
        pessoas.add("João");

        System.out.println("Percorrendo fila com for each: ");
        for(String pessoa: pessoas){
            System.out.println(pessoa);
        }
        System.out.println();

        System.out.println("Percorrendo fila com iterator: ");
        Iterator iteratorPessoas = pessoas.iterator();

        while(iteratorPessoas.hasNext()){
            System.out.println(iteratorPessoas.next());
        }
        System.out.println();

        System.out.println("Retornando 1 item da fila sem removê-lo: ");
        System.out.println(pessoas.peek());
        System.out.println();

        System.out.println("Retornando o 1 item da fila e o removendo: ");
        System.out.println(pessoas.poll());
        System.out.println(pessoas);
        System.out.println();

        System.out.println("Adicionando o nome Daniel e verificando sua posição: ");
        pessoas.add("Daniel");

        System.out.println(pessoas); //Apareceu no fim da fila
        System.out.println();

        System.out.println("Retornando o tamanho da lista: ");
        System.out.println(pessoas.size());
        System.out.println();

        System.out.println("Verificanso se a lista está vazia: ");
        System.out.println(pessoas.isEmpty());
        System.out.println();

        System.out.println("Verificando se Carlos está na lista: ");
        boolean temCarlos = pessoas.contains("Carlos");
        System.out.println(temCarlos);

    }
}
