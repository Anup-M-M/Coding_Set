
// list number integer : list is null or not, list is not print odd number in reverse order

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainTestClass {

    public static void main(String[] args) {
        // Print Odd Numbers in Reverse Order from a List (use Optional)
        List<Integer> list = Arrays.asList(1, 4, 5, 7, 8, 9);  // Try null as well

        Optional.ofNullable(list)
                .orElse(Collections.emptyList()) // if null, return empty list
                .stream()
                .filter(n -> n % 2 != 0)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        Optional.ofNullable(list)
                .ifPresent(li -> li.stream()
                        .filter(n -> n % 2 != 0)
                        .sorted(Comparator.reverseOrder())
                        .forEach(System.out::println));

        List<String> names = Arrays.asList("Anup", "Ram");

        List<Integer> lengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(lengths); // Output: [4, 3]

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Java", "Spring"),
                Arrays.asList("SQL", "Oracle")
        );

        List<String> flatList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flatList); // Output: [Java, Spring, SQL, Oracle]

        String name =  "Anup";
        name.chars().forEach(System.out::println);

        List<String> words = Arrays.asList("Java", "Stream", "API");

        Map<Character, Long> collect = words.stream()
                .map(str -> str.toLowerCase())
                .flatMap(str -> str.chars().mapToObj(c -> (char) c)) // Stream<Character>
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);
    }
}
