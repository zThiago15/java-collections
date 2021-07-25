package one.innovation.digital.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {

        List<String> estudantes = new ArrayList<>();

        // Adicionando 7 alunos
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        System.out.println(estudantes);

        // Retorna a contagem de elementos da stream
        System.out.println("Contagem: " + estudantes.stream().count());

        // Retorna o elemento com a maior palavra
        System.out.println("Maior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));;

        // Retorna o elemento com a menor palavra
        System.out.println("Menor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        // Retorna elementos com a letra R
        // filter() -> executa o algoritmo para verificar se é true/false, se for true irá jogar esses elementos para uma nova lista
        System.out.println("Com a letra r no nome: " + estudantes.stream().filter((estudante) ->
            estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        // Retorna nova coleção com os nomes concatenados com a quantidade de letras de cada nome
        System.out.println("Nova coleção com a quantidade de letras: " + estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        // Retorna os 3 primeiros elementos da seleção
        System.out.println("Retorna 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        // Exeibi cada elemento no console e retorna a mesma coleção
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        // Exibi cada elemento sem retornar outra coleção
        System.out.println("Retorna os elementos com ForEach: ");
        estudantes.stream().forEach(System.out::println);

        // Retorna true se todos os elementos tiverem W no nome
        System.out.println("Todos os nomes tem a letra W? " + estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        // Retorna true se algum dos elementos pussuírem a letra 'a' minúscula no nome
        System.out.println("Tem algum elemento com a letra a minúscula no nome? " + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

        // Retorna o primeiro elemento da coleção, se existir vai exibir no console
        System.out.println("Primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        // Exemplo de operação encadeada
        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                //.filter((estudante) ->
                //        estudante.toLowerCase().contains("r"))
                //.collect(Collectors.toList()));
                //.collect(Collectors.joining(", ")));
                //.collect(Collectors.toSet()));
                .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));
                //Agrupa pela quantidade de letras


    }
}
