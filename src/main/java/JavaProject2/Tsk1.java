package JavaProject2;

public class Tsk1 {

    /*
Write a program to swap 2 String without a temporary variable?
 */
        public static void main(String[] args) {
            String color1 = "Black";
            String color2 = "White";

            System.out.println("Before Swapping =");
            System.out.println("First String is: " + color1);
            System.out.println("Second String is: " +color2);
            System.out.println("========================");
            color1 = color1 + color2;
            color2 = color1.substring(0,color1.length()-color2.length());
            color1 = color1.substring(color2.length());
            System.out.println("After Swapping =");
            System.out.println("First String is: " + color1);
            System.out.println("Second String is: " +color2);

        }
    }

