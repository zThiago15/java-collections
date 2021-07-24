package one.innovation.digital.map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploMapTable {

    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 22);
        estudantes.put("Fernanda", 18);
        estudantes.put("Gabriel", 30);
        estudantes.put("Bárbara", 44);

        System.out.println(estudantes);

        // Adiciona estudante Pedro
        estudantes.put("Pedro", 50);

        // Remove estudante: Bárbara
        estudantes.remove("Bárbara");

        // Exibi todos os estudantes
        System.out.println(estudantes);

        //Navega nos registros do Mapa com entrySet()
        for(Map.Entry<String, Integer> entry: estudantes.entrySet()){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        for(String key : estudantes.keySet()){
            System.out.println(key + " --- " + estudantes.get(key));
        }
    }
}
