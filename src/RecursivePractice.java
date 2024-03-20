public class RecursivePractice {

    public static void main(String[] args) {
        System.out.println("Sum of odd numbers from 1 to 5: " + oddSum(5));

        System.out.println("Ackermann(3, 2): " + ack(3, 2));

        System.out.println("2^3: " + power(2, 3));

        int[] arr = {3, 8, 2, 5, 1, 9};
        System.out.println("Max in range 1 to 4: " + maxInRange(arr, 1, 4));
    }

    public static int oddSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + oddSum(n - 2);
        }
    }

    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return ack(m - 1, ack(m, n - 1));
        } else {
            return 0;
        }
    }

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return x * power(x, n - 1);
        } else {
            return 1 / power(x, -n);
        }
    }

    public static int maxInRange(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return arr[lowIndex];
        } else {
            int midIndex = (lowIndex + highIndex) / 2;
            int max1 = maxInRange(arr, lowIndex, midIndex);
            int max2 = maxInRange(arr, midIndex + 1, highIndex);
            return Math.max(max1, max2);
        }
    }
}
