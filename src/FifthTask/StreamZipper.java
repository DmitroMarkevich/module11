package FifthTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamZipper {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Random random = new Random();
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());

        int size = Math.min(firstList.size(), secondList.size());
        List<T> result = new ArrayList<>();

        IntStream.range(0, size).forEach((element) -> {
            int indexOfElement = random.nextInt(firstList.size());
            result.add(firstList.get(indexOfElement));
            firstList.remove(indexOfElement);

            indexOfElement = random.nextInt(secondList.size());
            result.add(secondList.get(indexOfElement));
            secondList.remove(indexOfElement);
        });

        return result.stream();
    }
}
