import java.util.Arrays;

public class PrefixAverage {
    // Approach 1
    public static double[] computePrefixAverageNaive(int[] x) {
        int n = x.length;
        double[] A = new double[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += x[j];
            }
            A[i] = (double) sum / (i + 1);
        }
        return A;
    }

    // Approach 2
    public static double[] computePrefixAverageEfficient(int[] x) {
        int n = x.length;
        double[] A = new double[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += x[i];
            A[i] = (double) sum / (i + 1);
        }
        return A;
    }

    // Main to test both approaches
    public static void main(String[] args) {
        int[] x = {2, 4, 6, 8, 10};

        double[] resultNaive = computePrefixAverageNaive(x);
        double[] resultEfficient = computePrefixAverageEfficient(x);

        System.out.println("Input array: " + Arrays.toString(x));
        System.out.println("Naive approach: " + Arrays.toString(resultNaive));
        System.out.println("Efficient approach: " + Arrays.toString(resultEfficient));
    }
}

