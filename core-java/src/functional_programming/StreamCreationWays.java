package functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationWays {
    public static void main(String[] args) {
        usingCollections();
        usingStreamOf();
        //Stream<T> only accepts object types
        // for primitive type stream we use IntStream,LongStream etc

        primitiveStreams();
        usingGenerateMethod();
        usingIterateMethod();
    }

    static void usingCollections() {
        List<String> list = List.of("a", "b", "c");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }

    static void usingStreamOf() {
        // here int values are automatically boxed to Integer -> autoboxing
        Stream<Integer> stream = Stream.of(1, 2, 3);
        stream.forEach(System.out::println);
    }

    static void primitiveStreams() {
        long var = 2147836471L;
//        float fl = 12.8;
        DoubleStream doubleStream = Arrays.stream(new double[]{4,5,6});
        IntStream intStream = IntStream.range(10,15);
        intStream.forEach(System.out::println);
    }

    static void usingGenerateMethod() {
        Stream<Double> stream = Stream.generate(()->Math.random()).limit(5);
        stream.forEach(System.out::println);
    }

    static void usingIterateMethod() {
        Stream<Integer> stream = Stream.iterate(1,n->n+5).limit(5);
        stream.forEach(System.out::println);
    }
}
