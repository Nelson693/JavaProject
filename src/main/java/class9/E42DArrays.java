package class9;

public class E42DArrays {
    public static void main(String[] args) {

        int [][] numbers={
                {10,20,30,40},
                {15,30,35,45},
                {400,500,600,700}};

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(numbers[row][col]+" ");

            }
            System.out.println();

        }
    }
}
