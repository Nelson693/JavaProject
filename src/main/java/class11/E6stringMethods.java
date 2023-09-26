package class11;

public class E6stringMethods {
    public static void main(String[] args) {
        String str="lkjadhfafFFGHSA132154!@##$$%$#@";
        System.out.println(str.replaceAll("[A-Z]","="));
        System.out.println(str.replaceAll("[a-z]","="));
        System.out.println(str.replaceAll("[0-9]","="));

    }
}
