package maximumSubarraySum;

public class Max {
    public static int sequence(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            sum += arr[i];
            for (int j = i; j < arr.length; j++) {
                if (j != arr.length - 1) {
                    sum += arr[j + 1];
                }
                if (sum > result) {
                    result = sum;
                }
            }
        }
        return result;
    }
}
