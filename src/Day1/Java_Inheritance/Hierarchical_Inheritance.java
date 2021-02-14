interface Cellulars{
    void OS();
    void keys();
    void pricing();
}

class AndroidPhones implements Cellulars {

    @Override
    public void OS() {
        System.out.println("Android having different types of OS like color OS, Stock Android, etc,..");
    }

    @Override
    public void keys() {
        System.out.println("Here we have Keypad and also touch keypad available");
    }

    @Override
    public void pricing() {
        System.out.println("Android Mobile pricing are normal range starting from 7k");
    }
}

class AppleIphones implements Cellulars{

    @Override
    public void OS() {
        System.out.println("Apple Iphones having only Mac OS");
    }

    @Override
    public void keys() {
        System.out.println("Here we have touch keypad available");
    }

    @Override
    public void pricing() {
        System.out.println("Apple Iphones pricing are much expensive String from 20K-25K");
    }
}


public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        AppleIphones ios = new AppleIphones();
        ios.OS();
        ios.keys();
        ios.pricing();

        System.out.println("\n ");

        AndroidPhones andro = new AndroidPhones();
        andro.OS();
        andro.keys();
        andro.pricing();
    }
}
