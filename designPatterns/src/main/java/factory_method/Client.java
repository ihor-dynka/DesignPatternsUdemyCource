package factory_method;

public class Client {

    public static void main(String[] args) {
        var animalFactory = new AnimalFactory();
        Animal tiger = animalFactory.getAnimalType("tiger");
        tiger.eat();

        Animal duck = animalFactory.getAnimalType("duck");
        duck.eat();
    }
}
