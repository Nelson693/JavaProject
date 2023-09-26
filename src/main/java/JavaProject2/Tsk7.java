package JavaProject2;


import java.util.ArrayList;

/*You have a list of strings and you want to keep only those that start
with “A” and you want to return them in lower case"
 */
public class Tsk7 {
    public static void main(String[] args) {


        ArrayList<String> words = new ArrayList<>();
        words.add("Andrea");
        words.add("John");
        words.add("Diedra");
        words.add("Anthony");
        words.add("Carla");
        words.add("Jorge");
        words.add("Amelia");


        for (String str : words) {
            if (str.startsWith("a")||str.startsWith("A")) {
                System.out.println(str.toLowerCase());
            }
        }
    }
}