package class9;

public class Task1 {
    public static void main(String[] args) {
        // Create a 2D array of car brands
        String[][] cars = {
                {"American", "Ford", "Chevrolet", "Dodge"},
                {"German", "BMW", "Mercedes-Benz", "Audi"},
                {"Korean", "Hyundai", "Kia", "Genesis"},
                {"Italian", "Ferrari", "Lamborghini", "Maserati"}
        };

        // Retrieve and print values using nested for-each loop
        System.out.println("Using nested for-each loop:");
        for (String[] countryCars : cars) {
            for (String car : countryCars) {
                System.out.print(car + " ");
            }
            System.out.println();
        }

        // Retrieve and print values using traditional for loop
        System.out.println("\nUsing traditional for loop:");
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
    }
}
