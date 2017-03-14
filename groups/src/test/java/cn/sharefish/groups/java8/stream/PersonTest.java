package cn.sharefish.groups.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class PersonTest {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("Max", 18), new Person("Peter", 23), new Person("Pamela", 23),
                new Person("David", 12));

//        List<Person> filtered = persons.stream().filter(p -> p.name.startsWith("P")).collect(Collectors.toList());
//
//        System.out.println(filtered);

//        String phrase = persons.stream().filter(p -> p.age >= 18).map(p -> p.name)
//                .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));
//
//        System.out.println(phrase);
        
//        Person result =
//                persons
//                    .stream()
//                    .reduce(new Person("", 0), (p1, p2) -> {
//                        p1.age += p2.age;
//                        p1.name += p2.name;
//                        return p1;
//                    });
//
//            System.out.format("name=%s; age=%s", result.name, result.age);
        
//        Integer ageSum = persons
//                .stream()
//                .reduce(0, (sum, p) -> sum += p.age, (sum1, sum2) -> sum1 + sum2);
//
//            System.out.println(ageSum);  // 76
//        
//        Integer ageSum1 = persons
//                .stream()
//                .reduce(0,
//                    (sum, p) -> {
//                        System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
//                        return sum += p.age;
//                    },
//                    (sum1, sum2) -> {
//                        System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
//                        return sum1 + sum2;
//                    });
        
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        System.out.println(commonPool.getParallelism());
    }

}
