package generics;

import java.util.List;

public class WildCardsUseCase {
    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Double> b = List.of(1.2,1.3);
        copy(a,b);
    }
    static <T extends Number, K extends Number> void copy(List<T> from, List<K> to) {

    }

}
