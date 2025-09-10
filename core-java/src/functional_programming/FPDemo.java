package functional_programming;

import java.util.*;
import java.util.stream.Collectors;

record Course(String name, String category, int score, long price){};

public class FPDemo {
    public static void main(String[] args) {
        List<Course> courses =  List.of(
                new Course("AWS", "Cloud", 95, 200000),
                new Course("Azure", "Cloud", 90, 150000),
                new Course("Docker", "Cloud", 85, 180000),
                new Course("Kubernetes", "Cloud", 88, 170000),
                new Course("Spring", "Framework", 97, 220000),
                new Course("Spring Boot", "Framework", 93, 210000),
                new Course("Microservices", "Microservices", 98, 250000),
                new Course("FullStack", "FullStack", 96, 230000)
        );
        Map<String,String> map = courses.stream().collect(Collectors.toMap(Course::name,Course::category));
        System.out.println(map);
//        groupingByDemo(courses);
    }

    static void groupingByDemo(List<Course> courses){
        Map<String,List<Course>> map = courses.stream().collect(Collectors.groupingBy(Course::category));
        Map<String,Long> countResult = courses.stream().collect(Collectors.groupingBy(Course::category, Collectors.counting()));
        Map<String, Optional<Course>> getMaxResult = courses.stream().collect(
                Collectors.groupingBy(Course::category,Collectors.maxBy(Comparator.comparing(Course::price))));
        Map<String,List<Long>> mappingEx = courses.stream().collect(Collectors.groupingBy(Course::category,Collectors.mapping(Course::price,Collectors.toList())));
        System.out.println("simple grouping "+map);
        System.out.println("Max result usage "+getMaxResult);
        System.out.println("counting usage "+countResult);
        System.out.println("mapping usage "+mappingEx);
    }
}
