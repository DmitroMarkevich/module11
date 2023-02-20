package FourthTask;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinearCongruentGenerator {
    public List<Long> generatePseudoRandomNumbers(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m).skip(1).limit(10).collect(Collectors.toList());
    }
}
