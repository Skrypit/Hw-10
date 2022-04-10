package task5;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mixer {

    public static void main(String[] args) {

        Stream<String> names = Stream.of("Petro", "Ivan", "Anna", "Yulia", "Dmytro", "Ihor");
        Stream<String> age = Stream.of("26", "35", "88", "15", "45");

        List<String> mixedStreams = zip(names, age)
                .collect(Collectors.toList());
        System.out.println(mixedStreams);
    }

    public static <T> Stream<T> zip(Stream<T> names, Stream<T> age) {

        Iterator<T> firstIterator = names.iterator();
        Iterator<T> secondIterator = age.iterator();
        Stream<T> result = Stream.empty();

        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            result = Stream.concat(result, Stream.of(firstIterator.next(), secondIterator.next()));
        }
        return result;
    }

}
