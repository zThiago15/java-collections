package one.innovation.digital.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>(); //Fila

        filaBanco.add("Pamela");
        filaBanco.add("Gabriel");
        filaBanco.add("Anderson");
        filaBanco.add("Flávio");
        filaBanco.add("Roberto");

        System.out.println("Fila atual: "+filaBanco);

        //Retorna e retira o 1 elemento da fila
        String clienteASerAtendido = filaBanco.poll(); //retorna e remove o 1º da fila
        System.out.println("Cliente a ser atendido: "+clienteASerAtendido);

        System.out.println("Fila atual: "+filaBanco);

        //filaBanco.clear();

        // Retorna e não remove o 1 elemento da fila
         String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        //Retorna o 1 elemento ou uma exceção se a fila estiver vazia
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);

        System.out.println(filaBanco);

        //Percorrendo a fila
        for(String element: filaBanco){
            System.out.println(element);
        }

        //Irá iterar os elementos da fila do banco
        Iterator<String> iterator = filaBanco.iterator();

        while(iterator.hasNext()){ //Caso existir um próximo valor, irá executar esse bloco
            System.out.println("-->"+iterator.next());
        }

        //Retorna o tamanho da fila
        System.out.println(filaBanco.size());

        // A fila está vazia?
        System.out.println(filaBanco.isEmpty());

    }
}
