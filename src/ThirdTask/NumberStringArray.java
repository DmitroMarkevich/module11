package ThirdTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStringArray {
    public List<String> getStringFromNumArray(String[] numArray) {
        return Arrays.stream(numArray)
                .flatMap(str -> Arrays.stream(str.split(", ")))
                .sorted().collect(Collectors.toList());
    }
}
