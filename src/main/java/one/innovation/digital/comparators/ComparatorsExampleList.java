package one.innovation.digital.comparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Thiago", 19));
        estudantes.add(new Estudante("Carlos", 29));
        estudantes.add(new Estudante("Mariana", 10));
        estudantes.add(new Estudante("João", 20));
        estudantes.add(new Estudante("George", 23));
        estudantes.add(new Estudante("Larissa", 34));

        System.out.println("--- Ordem de inserção: ---");
        System.out.println(estudantes);
        System.out.println();

        System.out.println("--- Ordem natural dos números - idade ---");
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println(estudantes);

        System.out.println("--- Ordem reversa dos números - idade ---");
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println(estudantes);

        System.out.println("Ordem natural dos números(idade) com method reference");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade)); //Compara os 2 parâmetros de idade da classe Estudante
        System.out.println(estudantes);




    }
}
