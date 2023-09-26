package JavaProject1;

public class Task7 {
    public static void main(String[] args) {
        int firNum = 0;
        int secNum = 1;
        int n = 10;

        for (int i = 1; i <= n; ++i) {
            System.out.print(firNum + "  ");

            int nextNum = firNum + secNum;
            firNum = secNum;
            secNum = nextNum;

        }
    }
}

