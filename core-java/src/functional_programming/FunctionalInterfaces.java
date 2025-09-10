package functional_programming;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Consumer<Integer> printIfGreaterThan10 = n -> {
            if(n>10) {
                System.out.println(n);
            }
        };

        Predicate<String> startsWithK = str -> str.startsWith("k");

        // we can write n->String.valueOf(n) also lambda way
        Function<Integer,Character> castToSymbols = i -> {
            int n = i;
            return (char)n;
        };

        BiFunction<Double,Integer,Double> getCircleArea = (a,b) -> a*b;

        Map<Double,Integer> map = Map.of(Math.PI,5);
        Double area = map.values().stream().map(r->getCircleArea.apply(Math.PI,r)).reduce(0.0,Double::sum);
        System.out.println("Area "+area);
        List<String> li = List.of("danny","Kavya","kavya");
        System.out.println("Usage of predicate "+li.stream().filter(startsWithK).toList());

        List<Integer> list = List.of(102,104,109);
        System.out.println("Usage of Function "+list.stream().map(castToSymbols).toList());

        List<Integer> list1 = List.of(10,11,12,14,9,8,19);
        System.out.println("Usage of Consumer ");
        list1.stream().forEach(printIfGreaterThan10);
    }
}
