package review4;

public class E6Arrays {
    public static void main(String[] args) {
        int[] salaries={120000,150000,200000};
        System.out.println(salaries[1]); // if you run this you will get 150k
        salaries[1]=160000;// this is updating the value of 1 from 150 to 160.
        System.out.println(salaries[1]);
    }
}
