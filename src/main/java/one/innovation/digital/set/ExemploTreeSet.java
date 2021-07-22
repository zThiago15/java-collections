package one.innovation.digital.set;

import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");

        //Exibindo toas as capitais
        System.out.println(treeCapitais);

        //Primeiro elemento
        System.out.println(treeCapitais.first());

        //Último elemento
        System.out.println(treeCapitais.last());

        //Capital acima do elemento Florianópolis
        System.out.println(treeCapitais.lower("Florianópolis"));

        //Capital abaixo do elemento Florianópolis
        System.out.println(treeCapitais.higher("Florianópolis"));

        //Retorna e retira o primeiro elemento
        System.out.println(treeCapitais.pollFirst());

        //Retorna e retira o retira elemento
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);
    }
}

