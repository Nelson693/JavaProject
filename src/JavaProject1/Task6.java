package JavaProject1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scanner.nextInt();

        if (number %2==0){
            System.out.println("This number is not a prime number");
        }else{
            System.out.println("This number is a prime number");
        }
    }
}

