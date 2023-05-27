package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Joey", "Chandler", "Monica", "Rachel", "Ross", "Phoebe", "Adam", "David",
                "Brock", "Brendon", "Anna", "Scott", "Django", "Emily", "Eric", "Andrew", "Fred", "Gibson", "Jerry", "Samuel",
                "Yadnyesh", "Zed", "Josh", "Butler", "Mike", "Max", "Charles", "Fernando", "Carlos", "Sergio", "George", "Lewis",
                "Luke", "Pumkin", "Neil", "Nash", "Nessa", "Lando", "Lenda", "Lando", "Lenda", "Norris", "Opera", "Om", "Omkar", "Ordy", "Perry",
                "Quantum", "Quest", "Querry", "Ram", "Ramesh", "Rock", "Rocky", "Ron", "Merry", "John", "Johnty", "Johny", "Stacy",
                "Sara", "Sam", "Sandy", "Mili", "Todd", "Terry", "Tom", "Tammy", "Ursula", "Uma", "Urmila", "Vic", "Vam", "Vej", "Victor",
                "Vessy", "Wade", "Jade", "Von", "Weddy", "Zester", "Xampa"));
        List<Integer> numbers = new ArrayList<>(List.of(1, 3, 5, 2, 4, 6));

        FPScenarios fpScenarios = new FPScenarios();

        System.out.println(fpScenarios.startsWithFilter(names, "l"));
        System.out.println("List of even numbers = " + fpScenarios.getEvenNumbers(numbers));
        System.out.println("List of odd numbers = " + fpScenarios.getOddNumbers(numbers));
        System.out.println("Sum of even numbers = " + fpScenarios.sumOfEvens(numbers));
        System.out.println("Sum of odd numbers = " + fpScenarios.sumOfOdds(numbers));
        System.out.println("Prime numbers = " + fpScenarios.primeNumbers(numbers));
        System.out.println("Sum of all numbers = " + fpScenarios.sum(numbers));
        System.out.println(fpScenarios.firstTenSquared());
        //  785, 534, 785
        System.out.println("Max = " + Stream.of(34, 25, 657, 43, 785, 534, 120).max(Integer::compare).get());
        System.out.println("Even Max = " + Stream.of(34, 25, 657, 43, 785, 534, 120).filter(n -> n % 2 == 0).max(Integer::compare).get());
        System.out.println("Odd Max = " + Stream.of(34, 25, 657, 43, 785, 534, 120).filter(n -> n % 2 == 1).max(Integer::compare).get());
        //  25, 34, 25
        System.out.println("Min = " + Stream.of(34, 25, 657, 43, 785, 534, 120).min(Integer::compare).get());
        System.out.println("Even Min = " + Stream.of(34, 25, 657, 43, 785, 534, 120).filter(n -> n % 2 == 0).min(Integer::compare).get());
        System.out.println("Odd Min = " + Stream.of(34, 25, 657, 43, 785, 534, 120).filter(n -> n % 2 == 1).min(Integer::compare).get());
        System.out.println(fpScenarios.rangeSquared(11,20));
    }
}
