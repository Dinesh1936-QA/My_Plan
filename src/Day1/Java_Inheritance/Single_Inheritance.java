// Parent class
abstract  class foodVariety {
    public void IndianCategorie(){
        System.out.println("TamilNadu Food Item");
    }

    abstract void TamilFoodItems();

}

// sub-Class extends from parent class
class SpicyFoodItems extends foodVariety{

    @Override
    void TamilFoodItems() {
        System.out.println("Karuvaattu Karakozhambu");
    }
}

class Single_Inheritance{
    public static void main(String[] args) {
        SpicyFoodItems tfs = new SpicyFoodItems();

        tfs.IndianCategorie();
        tfs.TamilFoodItems();
    }
}

