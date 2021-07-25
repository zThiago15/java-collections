package one.innovation.digital.optional;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.OptionalLong;

public class OptionalExample {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.ofNullable("Value's present");

        System.out.println(optionalString.isPresent());
        System.out.println(optionalString.isEmpty());

        optionalString.ifPresent(System.out::println);

        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("The value's not present"));

        if (optionalString.isPresent()) {
            String valor = optionalString.get(); //It'll get the value of optionalString and pul inside 'valor'

            System.out.println(valor);
        }


        // Map -> we'll transform the value of 'valor', in this case, we're concatenating with '*****'.
        optionalString.map((valor) -> valor.concat("*****")).ifPresent(System.out::println);

        optionalString.orElseThrow(IllegalStateException::new);

    }
}
