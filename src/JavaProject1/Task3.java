package JavaProject1;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 3, 7, 4},
                {2, 9, 6, 8},
                {11, 15, 19, 24},
                {27, 33, 37, 40}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                }

            }
            System.out.println();

        }
    }
}
