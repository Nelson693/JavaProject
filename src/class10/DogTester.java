package class10;

public class DogTester {
    public static void main(String[] args) {
        //Creating an obj from the dog class
        Dog lunaObj=new Dog();
        // Assigning a value to name using lunasobj
        lunaObj.name="Luna";
        lunaObj.gender='F';
        lunaObj.breed="Shiba";
        lunaObj.weigh=10;
        lunaObj.age=25;
        System.out.println(lunaObj.name);
        System.out.println(lunaObj.age);
        System.out.println(lunaObj.breed);
        // We are calling the methong on lunasObj
        lunaObj.bark();
        lunaObj.eat();
        lunaObj.sleep();


    }
}
