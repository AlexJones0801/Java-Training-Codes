class Movie {
    String name;
    double rating;
    int releaseYear;
    
    Movie(String n,double rating,int ry) {
        this.name = n;
        this.rating = rating;
        this.releaseYear = ry;
    }
    
    void movieDetails() {
        System.out.println("Name: " + name);
        System.out.println("Rating: " + rating);
        System.out.println("Release Year: " + releaseYear);
    } 
}

public class Q8_Movie {
    
    public static void main(String[] args) {
        Movie[] movies = new Movie[5];
        movies[0] = new Movie("Inception",8.8,2010);
        movies[1] = new Movie("Spider-Man: No Way Home", 8.2, 2021);
        movies[2] = new Movie("The Batman", 7.8, 2022);
        movies[3] = new Movie("Interstellar", 8.7, 2014);
        movies[4] = new Movie("Vikram", 8.3, 2022);
        
        System.out.println("Movies released after 2020:\n");

        for (Movie m : movies) {
            if (m.releaseYear > 2020) {
                m.movieDetails();
                System.out.println();
            }
        }
    }
}