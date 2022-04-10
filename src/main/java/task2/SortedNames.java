package task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedNames {
    public static void main(String[] args) {
        Stream<String> names = Arrays.asList("Petro", "Ivan", "Anna", "Yulia", "Dmytro", "Ihor")
                .stream()
                .sorted();

        List<String> sortedNames = names.collect(Collectors.toList());
        sortedNames.replaceAll(String::toUpperCase);
        Collections.reverse(sortedNames);
        System.out.println(sortedNames);
    }
}


