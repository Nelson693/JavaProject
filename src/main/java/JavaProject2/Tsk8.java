package JavaProject2;

public class Tsk8 {
    /*Write a Java Function that increments a string,
It should take the string of unknown length. Don't use regular
expressions.
Examples:
123 -> 124
53456 -> 53457
29 -> 30
Function signature:
string Increment (string str)
 */
        public static String Increment(String str){
            int num=Integer.valueOf(str);
            num++;

            return Integer.toString(num);
        }

        public static void main(String[] args) {
            String str1 = "123";
            String str2 = "53456";
            String str3 = "29";

            System.out.println("Incremented: " +Increment(str1));
            System.out.println("Incremented: " +Increment(str2));
            System.out.println("Incremented: " +Increment(str3));


        }
    }

