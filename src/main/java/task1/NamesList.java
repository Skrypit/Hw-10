package task1;

import java.util.Arrays;
import java.util.List;

public class NamesList {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Petro", "Ivan", "Anna", "Yulia", "Dmytro", "Ihor");
        for (int i = 0; i < names.size() - 1; i++) {
            if ((i + 1) % 2 != 0) {
                System.out.println((i + 1) + ". " + names.get(i));
            }
        }
    }
}

