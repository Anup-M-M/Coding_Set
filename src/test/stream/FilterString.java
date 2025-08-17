package test.stream;

import java.util.Arrays;
import java.util.List;

public class FilterString {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("America", "akash", "Mars", "anubhav", "nitish", "ashish", "alpha");

        names.stream()
                .filter( name -> name.toUpperCase().startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
