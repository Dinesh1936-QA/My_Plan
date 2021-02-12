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

    
class SingleInheritance
{
    public static void main (String[] args) {
        Bikes single = new Bikes() ;
        single.ThreeWheeler();
        single.TwoWheeler();
        single.FourWheeler();
        
    }   
}
