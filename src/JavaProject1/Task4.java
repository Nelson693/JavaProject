package JavaProject1;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        int evenSum = 0;
        int oddSum = 0;

        for (int[] a : array) {
            for (int b : a) {
                if (b % 2 == 0) {
                    evenSum = b+ + evenSum;

                } else if (b % 2 != 0) {
                    oddSum = b + oddSum;
                }
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
