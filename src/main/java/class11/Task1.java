package class11;

public class Task1 {
    public static void main(String[] args) {
        String original = "Sunday";
        String reversed = reverseString(original);

        System.out.println("reversed string: " + reversed);
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}