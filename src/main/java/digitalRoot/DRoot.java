package digitalRoot;

import java.util.Arrays;

public class DRoot {
    public static int digital_root(int n) {
        int sum = Arrays.stream(String.valueOf(n).split(""))
                        .map(Integer::valueOf)
                        .reduce(0, Integer::sum);

        return sum > 9 ? digital_root(sum) : sum;
    }
}
