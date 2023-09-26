package class6;
/*
Print from 1 - 10 but bypass 7
 */
public class E8whileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <=10) {

            if (i !=7){
                System.out.println(i);
            }
            i++;
        }
    }
}
