package one.innovation.digital.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        esportes.add("Basquetebol");
        esportes.add("Futebol");
        esportes.add("Voleibol");
        esportes.add("ìsqui");

        //Alterar valor da posição 3
        esportes.set(3, "Handebol");
        System.out.println(esportes.get(3));


        //Percorrendo List com for each
        for(String esporte: esportes){
            System.out.println(esporte);
        }



    }
}
