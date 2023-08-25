package class4;

/*
Create a Java program and store values of mortgage rate and mortgage price. LINE1
 First, program should check if rate is higher than 4.5 user will not buy a house, LINE2
  otherwise user will consider buying. LINE3   Once user decides to buy a house, LINE4
  if price of the house is larger than 50000 than user will take a loan,LINE4
  otherwise user will pay cash. LINE5
 */
public class Task2 {
    public static void main(String[] args) {
        double mortgageRate = 4.1; //LINE1
        double mortgagePrice = 40000; //LINE1

        if (mortgageRate > 4.5) { //LINE2
            System.out.println("User will not buy a house"); //LINE2
        } else { //LINE3
            System.out.println("user will consider buying"); //LINE3
            if (mortgagePrice > 50000) { //LINE4
                System.out.println("user will take a loan");//LINE4
            } else { //LINE5
                System.out.println("user will pay cash"); //LINE5
            }
        }

    }
}