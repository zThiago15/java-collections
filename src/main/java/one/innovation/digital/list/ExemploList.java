package one.innovation.digital.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Thiago");
        names.add("João");
        names.add("Maria");
        names.add("Larissa");
        names.add("Laura");

        System.out.println(names);

        //Troque Maria por Gabriela
        names.set(2, "Gabriela");
        System.out.println("Trocando Maria por Gabriela: "+names);

        // Ordenando elementos
        Collections.sort(names);
        System.out.println("Organizando elementos: "+names);

        //Remove elemento por índice
        names.remove(2);
        System.out.println("Removendo índice 2(Larissa): "+names);

        //Remove elemento por objeto
        names.remove("Thiago");
        System.out.println("Removendo Thiago: "+names);

        // Método get
        String nome = names.get(0);
        System.out.println(nome);

        //Tamanho: .size()
        int tamanho = names.size();
        System.out.println("Tamanho: "+tamanho);

        names.remove(1);
        tamanho = names.size();

        System.out.println("Tamanho após remover 1 nome: "+tamanho);

        //Contém o nome Fernando?
        boolean temFernando = names.contains("Fernando");
        System.out.println(temFernando); //false

        //A lista está vazia?
        boolean listaEstaVazia = names.isEmpty();
        System.out.println(listaEstaVazia); //false

        names.clear();
        listaEstaVazia = names.isEmpty();
        System.out.println(listaEstaVazia); //true

        // Adicionando novos nomes
        names.add("Daniel");
        names.add("Carlos");
        names.add("Fernanda");

        //Em que posição está o nome Carlos?
        int posicao = names.indexOf("Carlos");
        System.out.println(posicao);

        //Percorrendo uma Lista de array com for each
        for(String nomeLinha: names){
            System.out.println(nomeLinha);
        }

        //Percorrendo array com a Interface iterator
        Iterator iterator = names.iterator();

        while(iterator.hasNext()){ //Enquanto existir um próximo valor, continuará executando esse bloco
            System.out.println("-->"+ iterator.next());
        }

    }
}
