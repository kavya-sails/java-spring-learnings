package files_directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PathsDemo {
    public static void main(String[] args) throws IOException {
        Consumer<Integer> consumer =PathsDemo::print;
        IntStream.range(0, 5).forEach((IntConsumer) consumer);
    }
    static void print() {
        System.out.println("i");
    }

    static void print(int i) {
        System.out.println(i);
    }
}
