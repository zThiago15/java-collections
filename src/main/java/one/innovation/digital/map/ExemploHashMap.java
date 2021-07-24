package one.innovation.digital.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> campeoesMundiaisFifa = new HashMap<>();

        // Inserindo chaves(times) e seus valores(vitórias)
        campeoesMundiaisFifa.put("Brasil", 5);
        campeoesMundiaisFifa.put("Alemanha", 4);
        campeoesMundiaisFifa.put("Itália", 4);
        campeoesMundiaisFifa.put("Uruguai", 2);
        campeoesMundiaisFifa.put("Argentina", 2);
        campeoesMundiaisFifa.put("França", 2);
        campeoesMundiaisFifa.put("Inglaterra", 1);
        campeoesMundiaisFifa.put("Espanha", 1);

        System.out.println(campeoesMundiaisFifa);

        // Atualizando valor do Brasil
        campeoesMundiaisFifa.put("Brasil", 6);
        System.out.println(campeoesMundiaisFifa);

        // Retorna vitórias da Argentina
        System.out.println(campeoesMundiaisFifa.get("Argentina"));

        // Retorna se França existe ou não (true)
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        // Remova a França e verifica se ela exista (false)
        campeoesMundiaisFifa.remove("França");
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        // Verifica se existe alguma seleção hexa campeã
        System.out.println(campeoesMundiaisFifa.containsValue(6));

        // Verificar tamanho do HashMap(não tem ordem)
        System.out.println(campeoesMundiaisFifa.size());

        // Usando a interface Entry do Map
        for(Map.Entry<String, Integer> entry: campeoesMundiaisFifa.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //Usando keySet()
        for(String key: campeoesMundiaisFifa.keySet()){
            System.out.println(key + " -- " + campeoesMundiaisFifa.get(key));
        }

        // Verifica se existe a chave Estados Unidos
        System.out.println(campeoesMundiaisFifa.containsKey("Estados Unidos"));

    }
}
