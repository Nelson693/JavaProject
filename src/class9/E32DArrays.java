package class9;

public class E32DArrays {
    public static void main(String[] args) {

        int [][] numbers={
                {10,20,30,40},
                {100,200,300},
                {400,500,600,700}};
        int []row=numbers[0]; // this returns us a complete 1D array WHOLE LINE
        int number=numbers[0][1]; // this return us ONE single element
        System.out.println(numbers[0][1]);
    }
}
