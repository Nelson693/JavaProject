package class5;

import java.util.Scanner;

public class Ex2 {
    /*
    Prompt the user to enter person heights in inches. Person should be classified as one of the following.
    short (Under 60in)
    medium (between 60-72in)
    tall (over 72in)
     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter you height in inches"); //PROMPT USER
        double height=scanner.nextInt(); //TO ENTER PERSON HEIGHT IN INCHES

        if (height<60){
            System.out.println("Short");
        } else if (height>=60 && height<=72){
            System.out.println("Medium");
        }else {
            System.out.println("Tall");
        }



    }
}
