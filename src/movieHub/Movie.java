package movieHub;

public class Movie {
   private String name;
   private String director;
   private String genre;
   private int year;
   private double imdbRate;
   private int duration;


    public Movie(String name, String director, String genre, int year, double imdbRate, int duration) {
        this.name = name;
        this.director = director;
        this.genre = genre;
        this.year = year;
        this.imdbRate = imdbRate;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                ", imdbRate=" + imdbRate +
                ", duration=" + duration +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getImdbRate() {
        return imdbRate;
    }

    public void setImdbRate(double imdbRate) {
        this.imdbRate = imdbRate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

