package class9;

import java.util.Arrays;

public class E22DArrays {
    public static void main(String[] args) {
        String [] [] names=
                       {       {"Hind", "Mik", "Ismael","Ahmed"},
                               {"John", "Bob", "Adam","Tamin"},
                               {"Earl", "Dude", "Germ","Paula"},
                               {"Ana", "Ceci", "Rob","Ahmed"}

                       };
        String[] row = names[2];
       // System.out.println(Arrays.toString(row));
        for (String name:row){
            System.out.println(name);
        }
    }
}
