import FirstAndSecondTask.EvenIndexNameExtractor;
import FirstAndSecondTask.ReverseUpperNamesList;
import ThirdTask.NumberStringArray;
import FourthTask.LinearCongruentGenerator;
import static FifthTask.StreamZipper.zip;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
          List<String> names = new ArrayList<>(Arrays.asList("Ivan", "Peter", "Dmytro", "Pavlo", "Vadym"));

//        TASK 1
          System.out.println("First Task: " +
                  new EvenIndexNameExtractor().getOddIndexNames(names) + "\n");

//        TASK 2
          System.out.println("Second Task: " +
                  new ReverseUpperNamesList().sortedReverseUpperNames(names) + "\n");

//        TASK 3
          String[] array = {"1, 2, 0, 3, 1, 9", "4, 5"};
          System.out.println("Third Task: " +
                  new NumberStringArray().getStringFromNumArray(array) + "\n");

//        TASK 4 (генерує "випадкові" числа, поставив ліміт в 10 чисел)
          long a = 25214903917L;
          long c = 11L;
          long m = 2 ^ 48L;
          long seed = System.currentTimeMillis();
          System.out.println("Fourth Task: " +
                  new LinearCongruentGenerator().generatePseudoRandomNumbers(a, c, m, seed) + "\n");

//        TASK 5
          Stream<String> first = Stream.of("One", "Two", "Three", "Four", "Five");
          Stream<String> second = Stream.of("Six", "Seven", "Eight", "Nine", "Ten");
          List<String> result = zip(first, second).collect(Collectors.toList());
          System.out.println("Fifth Task: " + result);
    }
}
