package class5;

import java.util.Scanner;
/*
Write a program that will print whether it is as weekend or a weekday.
If any day from 1-5 out put "It is a weekday"
Any day from 6-7 out put "It is a weekend"
Any other day "Invalid day"
 */
public class Ex3 {
    public static void main(String[] args) {
       int day=5;
       if (day>=1 && day<=5){
           System.out.println("It is a weekday");
       } else if (day==6 || day==7) {
           System.out.println("It is a weekend");
       }else {
           System.out.println("Invalid Day");
       }

    }
}
