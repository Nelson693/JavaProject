package JavaProject1;

public class Task9 {
    public static void main(String[] args) {
        int tempVar;
        int array[] = {60, 35, 71, 22, 48};

        for(int i = 0; i<array.length; i++ ){  // previous number
            for(int j = i+1; j<array.length; j++){  // next number

                if(array[i]>array[j]){
                    // to swap the two numbers
                    tempVar = array[i];
                    array[i] = array[j];
                    array[j] = tempVar;
                }
            }
        }
        System.out.println(array[array.length-2]);

    }
}

