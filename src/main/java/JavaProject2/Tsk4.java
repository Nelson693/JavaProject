package JavaProject2;

public class Tsk4 {

    /*Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.
 */
        public static void main(String[] args) {
            int count =countWords("Hello Syntax");
            System.out.println(count);
        }

        public static int countWords(String sentence){
            String[] s = sentence.split(" ");

            return s.length;
        }

    }

