package ThirdTask;


import java.util.Arrays;

public class NumberStringArray {
    public String getStringFromNumArray(String[] numArray) {
        String[] joinedArray = String.join(", ", numArray).split(", ");
        return Arrays.toString(Arrays.stream(joinedArray).sorted().toArray());
    }
}
