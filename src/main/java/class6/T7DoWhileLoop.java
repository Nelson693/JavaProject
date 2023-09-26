package class6;

public class T7DoWhileLoop {
    public static void main(String[] args) {
        int number = 2;

        System.out.println("Even numbers from 2 to 20:");

        do {
            System.out.print(number+ " ");
            number += 2; // Increment by 2 to get the next even number
        } while (number <= 20);
    }
}
