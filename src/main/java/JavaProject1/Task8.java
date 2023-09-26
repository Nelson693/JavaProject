package JavaProject1;

public class Task8 {
    public static void main(String[] args) {

        int[] numbers = {33, 21 , 14, 39, 8, 41, 13};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];

            }
            if (numbers[i] < min) {
                min = numbers[i];

            }

        }
        System.out.println("The smallest number is "+min);
        System.out.println("The biggest number is "+max);
    }
}

