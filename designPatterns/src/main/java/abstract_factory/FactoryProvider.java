package abstract_factory;

public class FactoryProvider {

    public static AbstractMovieFactory getFactory(String name) {
        if (name.equalsIgnoreCase("ukrainian"))
            return new UkrainianMovieFactory();
        else if (name.equalsIgnoreCase("hollywood"))
            return new HollywoodMovieFactory();
        else throw new IllegalArgumentException(name + " factory not found.");
    }
}
