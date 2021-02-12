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
    
 // here i done with override concept for--> TwoWheeler
    void TwoWheeler(){
    System.out.println(company);
    }
}

    
class Single
{
    public static void main (String[] args) {
        Bikes single = new Bikes() ;
        single.ThreeWheeler();
        single.TwoWheeler();
        single.FourWheeler();
        
    }   
}
