package class5;

import java.util.Scanner;
/*
Ask user to enter their country and capture it. Once values are captured print which language user speaks.
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Country");
        String country=scanner.next();

        switch (country) {
            case "USA":
                System.out.println("English");
                break;
            case "Argentina":
                System.out.println("Spanish");
                break;
            case "France":
                System.out.println("French");
                break;
            default:
                System.out.println("Country not supported");
        }
    }
}
