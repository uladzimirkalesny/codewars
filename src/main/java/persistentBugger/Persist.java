package persistentBugger;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Persist {
    static int operationCounter = 0;
    static int result = 0;

    public static int persistence(long n) {
        result = operationCounter;

        String[] array = String.valueOf(n).split("");

        if (array.length != 1) {
            operationCounter++;

            result = operationCounter;

            Integer reduce = Stream.of(array)
                                   .map(Integer::valueOf)
                                   .collect(Collectors.toList())
                                   .stream()
                                   .reduce(1, (a, b) -> a * b);

            persistence(reduce);
        }

        operationCounter = 0;
        return result;
    }
}
