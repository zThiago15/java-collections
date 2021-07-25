package one.innovation.digital.optional;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExamplePrimitiveOptionals {

    public static void main(String[] args) {

        System.out.println("Int value optional: ");
        OptionalInt.of(1).ifPresent(System.out::println);

        System.out.println("Decimal value optional: ");
        OptionalDouble.of(56.5).ifPresent(System.out::println);

        System.out.println("Long value optional: ");
        OptionalLong.of(23L).ifPresent(System.out::println);
    }
}
