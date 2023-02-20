package FirstAndSecondTask;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenIndexNameExtractor {
    public String getOddIndexNames(List<String> names) {
        List<String> oddIndexNames = IntStream.range(0, names.size())
                .filter(index -> index % 2 == 0)
                .mapToObj(index -> (index+1) + ". " + names.get(index))
                .collect(Collectors.toList());
        return oddIndexNames.toString();
    }
}
