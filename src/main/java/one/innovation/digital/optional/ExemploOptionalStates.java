package one.innovation.digital.optional;

import org.w3c.dom.ls.LSOutput;

import javax.swing.text.html.Option;
import java.util.Optional;

public class ExemploOptionalStates {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Present value");

        System.out.println("Optional value that exists: ");

        //If optionalString has a value, it'll show the 1st param, if not, will show the second one
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Not present")); //Lambda expression


        System.out.println("Optional value that's not present: ");

        Optional<String> nullOptional = Optional.ofNullable(null);
        nullOptional.ifPresentOrElse(System.out::println, () -> System.out.println("The value's null, so it's not present"));

        Optional<String> optionalNullError = Optional.of(null);
        optionalNullError.ifPresentOrElse(System.out::println, () -> System.out.println("Error: value it's not present"));


    }
}
