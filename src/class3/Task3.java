package class3;
/*
Create Java program to store 2 values for expected and actual hours. Your profram should check
- if actual hours are more than expected hours the program should print " You will love the course and you will succeed"
- other wisde " Course will be very hard for you!"
 */
public class Task3 {
    public static void main(String[] args) {
        int expected=20;
        int actual=25;
        if(actual>expected){
            System.out.println("You will love the course and you will succeed");
        }else {
            System.out.println("Course will be very hard for you!");
        }
    }
}
