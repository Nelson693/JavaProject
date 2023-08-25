package review5;

public class ArrayReview {
    public static void main(String[] args) {

        int a=10;

        int[] array={10,11,12,13,55,34,24};

        int numberOfElements= array.length;
        System.out.println(numberOfElements); //Gives you how many numbers in total in the array

        System.out.println(array[3]); // give me 13 because we selected the number of the position in the array

        /*
        When to use Loops = When we want to repeat a block of code
        While or Do While = When we do not know the exact number of iterations
        For loop = When we know how many times we want to repeat or iterate the code
         */

        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+"  ");
        }


    }


}
