public class App {

    public static void main(String[] args) {

       Parking mallParking = new Parking((byte)6);
       
       Car sUVCar = new Car("Mercedes");

       System.out.println(mallParking.getFreePlaces(6));

    }
}