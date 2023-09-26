package JavaProject1;

public class Task10 {
    public static void main(String[] args) {
        String [] names={"Mike","Joe","Jay","Mike","Adam","Joe","John","Dan"};

        for (int i = 0; i < names.length ; i++) {
            for (int j = i+1; j < names.length ; j++) {
                if (names[i].equals(names[j])){
                    System.out.println(names[j]);
                }
            }

        }

    }
}

