package class3;
/*
Create a Java program and name it temperature check. Create variable to store temp.
Your program should check if temperature is below 32 then it should print
"Water will freeze with temperature_", otherwise "Water will not freeze with temperature__".
 */

public class Task2 {
    public static void main(String[] args) {
        double temperature=25;
        if(temperature<32){
            System.out.println("water will freeze with temperature "+temperature);
        } else {
            System.out.println("Water will not freeze with temperature "+temperature);
        }

    }
}
