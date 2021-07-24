package one.innovation.digital.map;

import java.util.Iterator;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {
        TreeMap<String, String> treeCapitais = new TreeMap<>();

        // Insere valores
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("MG", "Minas Gerais");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SC", "Florianópolis");

        System.out.println(treeCapitais);

        // Retorna o primeiro elemento(K, V)
        System.out.println(treeCapitais.firstEntry().getKey() + " -- " + treeCapitais.firstEntry().getValue());

        // Retorna o último elemento(K, V)
        System.out.println(treeCapitais.lastEntry().getKey() + " -- " + treeCapitais.lastEntry().getValue());

        // Retorna a capital acima de SC
        System.out.println(treeCapitais.lowerEntry("SC").getKey() + " -- " + treeCapitais.lowerEntry("SC").getValue());

        // Retorna a capital abaixo de SC
        System.out.println(treeCapitais.higherEntry("SC").getKey() + " -- " + treeCapitais.higherEntry("SC").getValue());

        // Exibir todas as capitais
        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.keySet().iterator();

        while(iterator.hasNext()){
            String key = iterator.next(); //irá guardar a chave
            System.out.println(key + "--" + treeCapitais.get(key));
        }



    }
}
