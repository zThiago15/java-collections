package one.innovation.digital.optional;

import java.util.Optional;

public class Exercicio {

    public static void main(String[] args) {

        // Crie com estado vazio, estado presente e com null
        Optional<String> nullValue = Optional.empty();

        Optional<String> presentValue = Optional.of("Optional value");


        // Se presente, exiba o valor no console
        // Se vazio, lança uma exceção IllegalStateException
        nullValue.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));

        // Se presente, transforme o valor e exiba no console
        presentValue.map((newValue) -> newValue.concat("****")).ifPresent(System.out::println);

        System.out.println(presentValue);

        // Se presente, pegue o valor do optional e atribua em uma variável
        if(presentValue.isPresent()){
            String value = presentValue.get();
            System.out.println("New value of: "+value);
        }

        // Se presente, filtre o optional com uma determinada regra de negócio
        if(presentValue.isPresent()){
                System.out.println("You're fired! ");
        } else {
                System.out.println("You're employed");
        }

        }
}
