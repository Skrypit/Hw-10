package task4;

import java.util.stream.Collectors;

public class MyGeneratorTest {
    public static void main(String[] args) {

        MyGenerator myGenerator = new MyGenerator();

        myGenerator.randomGenerator(25214903917L, 11, 2 ^ 48, 2)
                .limit(20)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
