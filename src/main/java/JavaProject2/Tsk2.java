package JavaProject2;

public class Tsk2 {

    /*
Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH".
 */
        public static void main(String[] args) {
            StringBuilder stringBuilder = new StringBuilder("Hello");
            String reversed = stringBuilder.reverse().toString();
            System.out.println("Input string: Hello");
            System.out.println("reversed string: " + reversed);


        }

    }

