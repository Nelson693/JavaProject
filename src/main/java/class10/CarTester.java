package class10;

public class CarTester {
    public static void main(String[] args) {
        Car toyotaObj=new Car();
        toyotaObj.make="Toyota";
        toyotaObj.model="4Runner";
        toyotaObj.price=50000;
        toyotaObj.rav();
        toyotaObj.race();


        Car bmwObj=new Car();
        bmwObj.make="BMW";
        bmwObj.model="X4";
        bmwObj.price=80000;
        toyotaObj.rav();
        toyotaObj.race();

        Car hondaObj=new Car();
        hondaObj.make="Honda";
        hondaObj.model="Accord";
        hondaObj.price=30000;
        toyotaObj.rav();
        toyotaObj.race();
}
}
