package class4;

/*
Write a program to store a value whether user has degree or not. LINE1
If user has a degree, you should say congratulations and after that LINE 2
check  If gpa score is higher or equals to 3.5 → output should say LINE 3
“You are eligible for scholarship”, LINE4 otherwise → “You should have studied harder” . //LINE5
if user does not have a degree print you should get a degree //LINE6
 */
public class Task1 {
    public static void main(String[] args) {
        boolean degree=true; //Line1
        double gpa=3.6; // Line3

        if(degree==true){  //Line2
            System.out.println("Congratulation");
            if(gpa>=3.5){ //Line4
                System.out.println("You are eligible for scholarship");
            }else { //Line5

                System.out.println("you should have studied harder");
            }


        }else { //Line6
            System.out.println("You should get a degree");
        }



    }
}
