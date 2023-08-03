package class3;

public class E10ElseIfStatements {
    public static void main(String[] args) {

        String fruit="Apple";  //You use .equals when you want to compare objects that has no value

        if(fruit.equals("Mango")){
            System.out.println("Price is 5$");
        }else if(fruit.equals("Orange")){
            System.out.println("Price is $4");
        } else if(fruit .equals("Apple")) {
            System.out.println("Price is $1000");
        }else if(fruit.equals("Kiwi")){
            System.out.println("Price is $6");
        }
    }
}
