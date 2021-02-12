package abstract_factory;

public class UkrainianMovieFactory extends AbstractMovieFactory {

    @Override
    IMovie getMovie(String criteria) {
        if (criteria.equalsIgnoreCase("historical"))
            return new UkrainianHistoricalMovie();
        else if (criteria.equalsIgnoreCase("action"))
            return new UkrainianActionMovie();
        else throw new IllegalArgumentException(criteria + " movie type not exists");
    }
}
