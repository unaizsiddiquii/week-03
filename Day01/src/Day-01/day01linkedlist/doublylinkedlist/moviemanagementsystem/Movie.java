// Class with name Movie and its purpose is to contain Movie Title, Director, Year of Release, and Rating
public class Movie {
    // Attribute
    String title;
    String director;
    int yearOfRelease;
    double rating;
    // Constructor of Movie
    Movie(String title, String director, int yearOfRelease, double rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }
}