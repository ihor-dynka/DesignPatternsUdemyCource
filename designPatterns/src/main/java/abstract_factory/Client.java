package abstract_factory;

public class Client {

    public static void main(String[] args) {
        var ukrainianMovieFactory = FactoryProvider.getFactory("ukrainian");
        var hollywoodMovieFactory = FactoryProvider.getFactory("hollywood");

        var ukrainianHistoricalMovie = ukrainianMovieFactory.getMovie("historical");
        var ukrainianActionMovie = ukrainianMovieFactory.getMovie("action");

        var hollywoodHistoricalMovie = hollywoodMovieFactory.getMovie("historical");
        var hollywoodActionMovie = hollywoodMovieFactory.getMovie("action");

        System.out.println(ukrainianHistoricalMovie.getMovieName());
        System.out.println(ukrainianActionMovie.getMovieName());

        System.out.println(hollywoodHistoricalMovie.getMovieName());
        System.out.println(hollywoodActionMovie.getMovieName());
    }
}
