package class12;

import java.util.Scanner;

public class Calculator {
    void add(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1=scanner.nextInt();
        System.out.println("Please enter the second number");
        int num2=scanner.nextInt();
        int sum=num1=num2;
        System.out.println("Sum of these numbers is"+sum);
    }
void multiply(int num1,int num2){
       // int num1=10;
        //int num2=20;
        int result=num1*num2;
    System.out.println(result);
}

}
