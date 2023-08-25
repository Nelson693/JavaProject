package JavaProject1;

public class Task1 {
    public static void main(String[] args) {
        int [] temperature={75,77,82,80,92,87,91};

        int highestNum=temperature[0];
        int lowestNum=temperature[0];

        for (int i = 0; i < temperature.length ; i++) {
            if (temperature[i]>highestNum){
                highestNum=temperature[i];
            }
            if (temperature[i]<lowestNum){
                lowestNum=temperature[i];
            }

        }
        System.out.println("The highest temperature in the week is going to be "+highestNum);
        System.out.println("The Lowest temperature in the week is going to be "+lowestNum);



    }
}
