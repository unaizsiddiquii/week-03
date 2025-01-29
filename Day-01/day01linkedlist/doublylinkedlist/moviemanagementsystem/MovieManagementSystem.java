package day01linkedlist.doublylinkedlist.moviemanagementsystem;
// Main class for MovieManagementSystem
public class MovieManagementSystem {
    public static void main(String[] args) {
        // Create object of MovieList class
        MovieList movieList = new MovieList();

        // Add some movies
        movieList.addLast(new Movie("Inception", "Christopher Nolan", 2010, 8.8));
        movieList.addLast(new Movie("Interstellar", "Christopher Nolan", 2014, 8.6));
        movieList.addFirst(new Movie("The Dark Knight", "Christopher Nolan", 2008, 9.0));
        movieList.addAtPosition(new Movie("The Matrix", "The Wachowskis", 1999, 8.7), 1);

        // Display movies forward
        System.out.println("Movies (Forward Order):");
        movieList.displayForward();

        // Display movies backward
        System.out.println("Movies (Reverse Order):");
        movieList.displayBackward();

        // Search for a movie by director
        System.out.println("Searching movies by director :");
        movieList.searchByDirector("Christopher Nolan");

        // Search for a movie by rating
        System.out.println("Searching movies with rating 8.8:");
        movieList.searchByRating(8.8);

        // Update movie rating
        movieList.updateRatingByTitle("Inception", 9.0);

        // Remove a movie by title
        movieList.removeByTitle("The Matrix");

        // Display movies after removal
        System.out.println("Movies after removal:");
        movieList.displayForward();
    }
}