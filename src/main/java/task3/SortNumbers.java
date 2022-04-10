package task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortNumbers {
    public static void main(String[] args) {
        String[] numbers = {"1, 2, 0", "4, 5"};
        String mergedStrings = numbers[0] + ", " + numbers[1];
        String[] newString = mergedStrings.split(", ");

        Stream<String> sortNum =
                Arrays.asList(newString)
                        .stream()
                        .sorted();
        List<String> sortedNames = sortNum.collect(Collectors.toList());
        System.out.println(sortedNames);
    }
}

