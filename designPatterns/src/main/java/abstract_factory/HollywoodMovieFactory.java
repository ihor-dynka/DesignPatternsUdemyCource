package abstract_factory;

public class HollywoodMovieFactory extends AbstractMovieFactory {

    @Override
    IMovie getMovie(String criteria) {
        if (criteria.equalsIgnoreCase("historical"))
            return new HollywoodHistoricalMovie();
        else if (criteria.equalsIgnoreCase("action"))
            return new HollywoodActionMovie();
        else throw new IllegalArgumentException(criteria + " movie type not exists");
    }
}
