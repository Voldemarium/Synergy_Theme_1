package theme_4_inheritance.lesson_33;

public class TooFewMoviesFoundException extends RandomMovieNotFoundException {
    public TooFewMoviesFoundException(int moviesFound) {
        super("too few movies found: " + moviesFound);
    }
}
