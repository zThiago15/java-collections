package one.innovation.digital.comparators;

public class Carro implements Comparable<Carro>{

    // Criando classe de domínio com Comparable

    private final String marca;
    private final int ano;

    public Carro(String marca, Integer ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString(){
        return marca + " - " + ano;
    }

    @Override
    public int compareTo(Carro o){
        return this.getAno() - o.getAno();
    }
}
