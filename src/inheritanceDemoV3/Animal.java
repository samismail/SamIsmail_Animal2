package inheritanceDemoV3;
//version 3
public class Animal {

    protected boolean beingDangerous = false;
    protected int numberOfLegs = 4;
    protected String diet = "omnivore";

    //this is a default constructor that sets the default values for the fields
    //this is added to this version 3. By adding this, we can now create an object of the Animal class without passing any parameters
    /*public Animal(){
        this.beingDangerous = true;
        this.numberOfLegs = 4;
        this.diet = "Carnivore";
    }

    public Animal(boolean beingDangerous, int numberOfLegs, String diet){
        this.beingDangerous = beingDangerous;
        this.numberOfLegs = numberOfLegs;
        this.diet = diet;
    }*/

    public boolean isBeingDangerous() {
        return beingDangerous;
    }

    public void setBeingDangerous(boolean beingDangerous) {
        this.beingDangerous = beingDangerous;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public void makeNoise(){
        System.out.print("Animal Class: Make noise -  ");
    }

    public void eat(){
        System.out.print("Animal class: Eating -  ");
    }

    @Override
    public String toString() {
        return "Animal: " + '\n' +
                "Is it Dangerous: " + beingDangerous + '\n' +
                "Number Of Legs: " + numberOfLegs + '\n' +
                "Diet: " + diet;
    }
}
