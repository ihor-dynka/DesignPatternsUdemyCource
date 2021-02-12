package factory_method;

public class AnimalFactory {

    public Animal getAnimalType(String animal) {

        switch (animal.toLowerCase()) {
            case "tiger":
                return new Tiger();
            case "duck":
                return new Duck();
            default:
                throw new IllegalArgumentException(animal + " animal type does not exist.");
        }
    }
}
