package polymorphism;

public class Main {

    public static void main(String[] args) {
        Movie movie = new Movie("Star Wars");
        movie.watchMovie();

        Movie adventure = new Adventure("Star Wars");
        adventure.watchMovie();
    }
}
