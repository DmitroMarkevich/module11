package ThirdTask;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NumberStringArray {
    public String getStringFromNumArray(String[] numArray) {
        return Arrays.stream(numArray)
                .flatMap(str -> Arrays.stream(str.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
