package one.innovation.digital.map;

import java.util.HashMap;

public class Exercicio {

    public static void main(String[] args) {
        HashMap<String, String> estados = new HashMap<>();

        // Adicione 26 estados brasileiros(K = sigla, V = estado)
        estados.put("AC", "Acre");
        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapá");
        estados.put("AM", "Amazonas");
        estados.put("BH", "Bahia");
        estados.put("CE", "Ceará");
        estados.put("ES", "Espírito Santo");
        estados.put("GO", "Goiás");
        estados.put("MA", "Maranhão");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Matro Grosso do Sul");
        estados.put("MG", "Minas Gerais");
        estados.put("PA", "Pará");
        estados.put("PB", "Paraíba");
        estados.put("PR", "Paraná");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Píauí");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("RO", "Rondônia");
        estados.put("RR", "Roraima");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "São Paulo");
        estados.put("SE", "Sergipe");
        estados.put("TO", "Tocantins");

        // Remova o estados Mingas Gerais
        estados.remove("MG");

        System.out.println(estados);

        // Adicione o DF
        estados.put("DF", "Distrito Federal");

        // Verifique o tamanho do mapa
        System.out.println(estados.size());

        // Remove o estados MT usando o nome
        estados.remove("Mato Grosso do Sul");

        System.out.println(estados);

        // Navegue por todos os registros do mapa usando o formato: NOME (SIGLA)
        for(String key: estados.keySet()){
            System.out.println(estados.get(key) + " (" + key + ")");
        }

        // Verifique se Santa Catarina está no mapa com sua sigla SC
        System.out.println(estados.containsKey("SC"));

        // Verifique se Mato Grosso existe buscando pelo nome
        System.out.println(estados.containsValue("Mato Grosso"));
    }
}
