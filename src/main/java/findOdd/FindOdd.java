package findOdd;

import java.util.Arrays;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class FindOdd {
    public static int findIt(int[] array) {
        return Arrays.stream(array)
                     .boxed()
                     .collect(groupingBy(Integer::intValue))
                     .entrySet()
                     .stream()
                     .filter(entry -> entry.getValue().size() % 2 == 1)
                     .mapToInt(Map.Entry::getKey)
                     .findFirst()
                     .getAsInt();
    }
}
