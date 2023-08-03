package class4;

public class E2NestedIf {
    public static void main(String[] args) {
        boolean winter=true;
        String jacketColor="blue";
        if(winter==true){

            if(jacketColor.equals("Red")){
                System.out.println("Lets go with Red Nike shoes");
            }

        }else {
            System.out.println("No needs to wear jackets");

        }
    }
}
