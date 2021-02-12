class Vehicles{
 String catgo = "Bikes", catgo1 = "Auto", catgo2 = "Cars";
 
 void TwoWheeler(){
     System.out.println(catgo);
 }
 
 void ThreeWheeler(){
     System.out.println(catgo1);
 }
 
 void FourWheeler(){
     System.out.println(catgo2);
     }
}


class Bikes extends Vehicles {
    String company = "Royal Enfield (RE)";
    
    void TwoWheeler(){
    System.out.println(company);
    }
}

class Engine extends Bikes{
    String power = "Two Stoke Engines";
    
    void power(){
    System.out.println("The Performance of the Engine carry out with: " +power);
    }
}

    
class MultiLevel
{
    public static void main (String[] args) {
        Engine multiLevel = new Engine() ;
        multiLevel.TwoWheeler();
        multiLevel.power();
        
    }   
}
