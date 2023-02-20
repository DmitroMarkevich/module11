package FirstAndSecondTask;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseUpperNamesList {
    public List<String> sortedReverseUpperNames(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }
}
