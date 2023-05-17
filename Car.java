public class Car{

    private String model;
    

    public Car(String model){
        this.model= model;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        if(model.equals("Mercedes")||model.equals("Fiat")|| model.equals("BMW")) {
                this.model=model;
        }else{
            System.err.println("This parking lots are for BMW, Mercedes, Fiat cars only");
        }
        
        
    }

    public String toString(){
        return model;    //adaugati metoda print() care imprimă modelul mașinii in consolă 
    }


}