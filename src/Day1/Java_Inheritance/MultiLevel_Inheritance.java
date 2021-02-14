abstract class IndianCarCompany{
    abstract void Branding();

    abstract void Power();

    abstract void SeatingCapacity();

}

abstract class IndianBrands extends IndianCarCompany{
    void Branding(){
        System.out.println("TATA MOTORS");
    }

    void Power() {
        System.out.println("The Best Horsepower because of the Four stoke High power Engine");
    }

    void SeatingCapacity() {
        System.out.println("Five members can be seated in the Car");
    }

   abstract void Model();
}

class CarModel extends IndianBrands{
    void Model(){
        System.out.println("TATA NEXON EV");
    }

    void Pricing(){
        System.out.println("The Price of the Car is : 13.55L to 15.99L");
    }
}

public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        CarModel ind = new CarModel();

        ind.Branding();
        ind.SeatingCapacity();
        ind.Power();
        ind.Model();
        ind.Pricing();
    }
}