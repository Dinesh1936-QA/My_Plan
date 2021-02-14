abstract class Dancer{
    String dancer = "Mikhail baryshnikov Michael Jackson";
    void MasterOfDancing(){
        System.out.println("The World Number ONE dancer: Mr. "+dancer);
    }

    abstract void MJ_Dance();
}

interface DancingStyle1{

    void nameOfDancing();

    void movement();

    void music();
}

interface DancingStyle2{

    void nameOfDancing1();
    void movement1();
    void music1();
}

class TheBestDancer extends Dancer implements DancingStyle1,DancingStyle2{

    @Override
    void MJ_Dance() {
        System.out.println("MJ having his own dancing style");
    }

    @Override
    public void nameOfDancing1() {
        System.out.println("MJ knows Freak-style");
    }

    @Override
    public void movement1() {
        System.out.println("The Freak-style Dance having Heavy movement");
    }

    @Override
    public void music1() {
        System.out.println("The Music for the dance is : Fusion songs");
    }

    @Override
    public void nameOfDancing() {
        System.out.println("MJ knows Jazz dancing style");
    }

    @Override
    public void movement() {
        System.out.println("The Jazz dancing is having : Lite and Risky movement");
    }

    @Override
    public void music() {
        System.out.println("The Music for the dance is : Romantic Music");
    }
}

public class Multiple_Inheritance {

    public static void main(String[] args) {

        TheBestDancer bd = new TheBestDancer();
        bd.MasterOfDancing();
        bd.MJ_Dance();
        bd.nameOfDancing();
        bd.movement();
        bd.music();
    }
}