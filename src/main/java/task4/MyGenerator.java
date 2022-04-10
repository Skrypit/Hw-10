package task4;

import java.util.stream.Stream;

public class MyGenerator {

    public Stream<Long> randomGenerator(long a, long c, long m, long seed) {

        Stream<Long> stream = Stream.iterate(seed, x -> ((a * x + c) % m));
        return stream;
    }
}



