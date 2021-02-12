class Vehicles{
 String catgo = "Bikes", catgo1 = "Auto", catgo2 = "Cars";
 
 void TwoWheeler(){
     System.out.println("Most Of the Two-Wheelers are : " +catgo);
 }
 
 void ThreeWheeler(){
     System.out.println("\n Most Of the Three-Wheelers are : " +catgo1);
 }
 
 
 void FourWheeler(){
     System.out.println("\n Most Of the Four-Wheelers are : " +catgo2);
 }
 
}


class Bikes extends Vehicles {
    String company = "Royal Enfield (RE)";
    
    void TwoWheeler(){
    System.out.println("The Company of the Two-Wheeler is: " +company);
    }
}

class Engine extends Bikes {
    String power = "Two Stoke Engine";
    
    void power(){
    System.out.println("The Performance of the Engine carry out with: " +power);
    }
}

class Cars extends Vehicles{
    String company = "Jaguar", power = "Four Stoke Engine";
    
    void FourWheelerCompany(){
        System.out.println("The Company of the Four-Wheeler is: " +company);
        System.out.println("The Performance of the " +company+ " is Based on the Engine it carryout with: " +power);
    }
}


class Hierarchical
{
    public static void main (String[] args) {
        Engine multiLevel = new Engine();
        multiLevel.TwoWheeler();
        multiLevel.power();
        
        Cars hierarchical = new Cars();
        hierarchical.FourWheeler();
        hierarchical.FourWheelerCompany();
        
    }   
}
