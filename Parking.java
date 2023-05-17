public class Parking {

    private byte freePlaces; 
    private Car place1A;
    private Car place1B;
    private Car place1C;
    private Car place2A;
    private Car place2B;
    private Car place2C;


    public Parking() {}  

    public Parking(byte freePlaces) {
        setFreePlaces(freePlaces);
    }  

    public int getFreePlaces() { 
        return freePlaces;
    }

    public void setFreePlaces(byte freePlaces) {  //    adăugați un constructor in clasă astfel încât să seteze inițial numărul de spații libere egal cu - 6
        this.freePlaces = freePlaces;
    }

   

      

    
   // common setter and getter

    public Parking getParkedCar (String place){
        if (place.equals("1A")){
            return place1A;
        }else if (place.equals("2A")) {
            return place2A;
        }else if (place.equals("1B")) {
            return place1B;
        }else if (place.equals("2B")) {
            return place2B;
        } else if (place.equals("1C")) {
            return place1C;
        } else if (place.equals("2C")) {
            return place2C;
        } 
        return null;
    }

    public void parkCar(String place, Car c){  // adăugați metoda „parkCar(Car c,String place)”, care va parca mașina la locul specificat
        if (place.equals("1A")&& place1A == null){
            place1A = c;
        }else if (place.equals("2A")&& place2A == null) {
            place2A = c;
        }else if (place.equals("1B")&& place1B == null) {
            place1B= c;
        }else if (place.equals("2B")&& place2B == null) {
            place2B = c;
        } else if (place.equals("1C")&& place1C == null) {
            place1C = c;
       }else if (place.equals("2C")&& place2C == null)  {
            place2C = c;
       } 
    }

   // created a method witch show remaining free spaces


    // print Parking MAP

   public string toString(){
    String out;
    out = 
    
    "----------------------------\n"+
    "| "+place1A+"        | "+place2A+"         |\n"+
    "|             |            |\n"+
    "----------------------------\n"+
    "----------------------------\n"+
    "| "+place1B+"        | "+place2B+"        |\n"+
    "|             |            |\n"+
    "----------------------------\n"+
    "----------------------------\n"+
    "| "+place1C+"        | "+place2C+"          |\n"+
    "|             |            |\n"+
    "----------------------------" ;
    return out;
    return "Parking freePlaces: " + freePlaces;
   }

    
}