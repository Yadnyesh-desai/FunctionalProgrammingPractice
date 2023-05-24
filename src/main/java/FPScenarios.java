package main.java;

import java.util.List;
import java.util.stream.Collectors;

public class FPScenarios {

    public List<String> startsWithFilter(List<String> names, String sequence) {
        return names.stream()
                .distinct()
                .sorted()
//                .map(String::toLowerCase)
                .filter(s -> s.startsWith(sequence.toLowerCase()) || s.startsWith(sequence.toUpperCase()))
                .collect(Collectors.toList());
    }

    public List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<Integer> getOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted()
                .filter(n -> n % 2 == 1)
                .collect(Collectors.toList());
    }

    public int sumOfEvens(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
    }

    public int sumOfOdds(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .distinct()
                .filter(n -> n % 2 == 1)
                .reduce(0, (n1, n2) -> n1 + n2);
    }
}
