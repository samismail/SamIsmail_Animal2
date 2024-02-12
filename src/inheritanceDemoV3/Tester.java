package inheritanceDemoV3;

public class Tester {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Mammal manmal = new Mammal();

        System.out.println(manmal);

        manmal.beingDangerous(true);
        manmal.setNumberOfLegs(2);
        manmal.setDiet("herbivore");
        System.out.println(manmal);

        Reptile reptile = new Reptile();
        System.out.println();
    }
}
