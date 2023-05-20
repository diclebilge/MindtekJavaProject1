//*/
//        package movieHub;
//
//import wrappers.ArraysListIntro;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//    public class Main {
//        public static ArrayList<Movie> generateMovies() {
//            Movie m2 = new Movie("Inception", "Christopher Nolan", "Action, Adventure, Sci-Fi", 2010, 8.8, 148);
//            Movie m3 = new Movie("The Shawshank Redemption", "Frank Darabont", "Drama", 1994, 9.3, 142);
//            Movie m4 = new Movie("Pulp Fiction", "Quentin Tarantino", "Crime, Drama", 1994, 8.9, 154);
//            Movie m5 = new Movie("Forrest Gump", "Robert Zemeckis", "Drama, Romance", 1994, 8.8, 142);
//            Movie m6 = new Movie("The Godfather", "Francis Ford Coppola", "Crime, Drama", 1972, 9.2, 175);
//            Movie m7 = new Movie("The Dark Knight", "Christopher Nolan", "Action, Crime, Drama", 2008, 9.0, 152);
//            Movie m8 = new Movie("Schindler's List", "Steven Spielberg", "Biography, Drama, History", 1993, 8.9, 195);
//            Movie m9 = new Movie("The Matrix", "Lana Wachowski, Lilly Wachowski", "Action, Sci-Fi", 1999, 8.7, 136);
//            Movie m10 = new Movie("The Silence of the Lambs", "Jonathan Demme", "Crime, Drama, Thriller", 1991, 8.6, 118);
//            Movie m11 = new Movie("The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", "Action, Adventure, Drama", 2001, 8.8, 178);
//            Movie m12 = new Movie("The Lord of the Rings: The Two Towers", "Peter Jackson", "Action, Adventure, Drama", 2002, 8.7, 179);
//            Movie m13 = new Movie("The Lord of the Rings: The Return of the King", "Peter Jackson", "Action, Adventure, Drama", 2003, 8.9, 201);
//            Movie m14 = new Movie("Interstellar", "Christopher Nolan", "Adventure, Drama, Sci-Fi", 2014, 8.6, 169);
//            Movie m15 = new Movie("The Prestige", "Christopher Nolan", "Drama, Mystery, Sci-Fi", 2006, 8.5, 130);
//            Movie m16 = new Movie("Saving Private Ryan", "Steven Spielberg", "Drama, War", 1998, 8.6, 169);
//            Movie m17 = new Movie("Jurassic Park", "Steven Spielberg", "Adventure, Sci-Fi", 1993, 8.1, 127);
//            Movie m18 = new Movie("Avatar", "James Cameron", "Action, Adventure, Fantasy", 2009, 7.8, 162);
//            Movie m19 = new Movie("The Lion King", "Roger Allers, Rob Minkoff", "Animation, Adventure, Drama", 1994, 8.5, 88);
//            Movie m20 = new Movie("Titanic", "James Cameron", "Drama, Romance", 1997, 7.8, 194);
//            Movie m21 = new Movie("Inglourious Basterds", "Quentin Tarantino", "Adventure, Drama, War", 2009, 8.3, 153);
//            Movie m22 = new Movie("Django Unchained", "Quentin Tarantino", "Drama, Western", 2012, 8.4, 165);
//            Movie m23 = new Movie("Fight Club", "David Fincher", "Drama", 1999, 8.8, 139);
//            Movie m24 = new Movie("The Social Network", "David Fincher", "Biography, Drama", 2010, 7.7, 120);
//            Movie m25 = new Movie("The Godfather: Part II", "Francis Ford Coppola", "Crime, Drama", 1974, 9.0, 202);
//            Movie m26 = new Movie("The Revenant", "Alejandro G. Iñárritu", "Action, Adventure, Drama", 2015, 8.0, 156);
//            Movie m27 = new Movie("The Departed", "Martin Scorsese", "Crime, Drama, Thriller", 2006, 8.5, 151);
//            Movie m28 = new Movie("Goodfellas", "Martin Scorsese", "Biography, Crime, Drama", 1990, 8.7, 146);
//            Movie m29 = new Movie("The Wolf of Wall Street", "Martin Scorsese", "Biography, Crime, Drama", 2013, 8.2, 180);
//            Movie m31 = new Movie("The Matrix Revolutions", "Lana Wachowski, Lilly Wachowski", "Action, Sci-Fi", 2003, 6.8, 129);
//            Movie m32 = new Movie("The Dark Knight", "Christopher Nolan", "Action, Crime, Drama", 2008, 9.0, 152);
//            Movie m33 = new Movie("The Dark Knight Rises", "Christopher Nolan", "Action, Thriller", 2012, 8.4, 164);
//            Movie m34 = new Movie("Joker", "Todd Phillips", "Crime, Drama, Thriller", 2019, 8.4, 122);
//            Movie m35 = new Movie("Forrest Gump", "Robert Zemeckis", "Drama, Romance", 1994, 8.8, 142);
//            Movie m36 = new Movie("Schindler's List", "Steven Spielberg", "Biography, Drama, History", 1993, 8.9, 195);
//            Movie m37 = new Movie("The Shawshank Redemption", "Frank Darabont", "Drama", 1994, 9.3, 142);
//            Movie m38 = new Movie("Pulp Fiction", "Quentin Tarantino", "Crime, Drama", 1994, 8.9, 154);
//            Movie m39 = new Movie("The Silence of the Lambs", "Jonathan Demme", "Crime, Drama, Thriller", 1991, 8.6, 118);
//            Movie m40 = new Movie("The Green Mile", "Frank Darabont", "Crime, Drama, Fantasy", 1999, 8.6, 189);
//            Movie m41 = new Movie("The Avengers", "Joss Whedon", "Action, Adventure, Sci-Fi", 2012, 8.0, 143);
//            Movie m42 = new Movie("Avengers: Infinity War", "Anthony Russo, Joe Russo", "Action, Adventure, Sci-Fi", 2018, 8.4, 149);
//            Movie m43 = new Movie("Avengers: Endgame", "Anthony Russo, Joe Russo", "Action, Adventure, Drama", 2019, 8.4, 181);
//            Movie m44 = new Movie("Black Panther", "Ryan Coogler", "Action, Adventure, Sci-Fi", 2018, 7.3, 134);
//            Movie m45 = new Movie("The Lion King", "Jon Favreau", "Adventure, Animation, Drama", 2019, 6.9, 118);
//            Movie m46 = new Movie("Mulan", "Niki Caro", "Action, Adventure, Drama", 2020, 5.7, 115);
//            Movie m47 = new Movie("The Incredibles", "Brad Bird", "Animation, Action, Adventure", 2004, 8.0, 115);
//            Movie m48 = new Movie("Finding Nemo", "Andrew Stanton, Lee Unkrich", "Animation, Adventure, Comedy", 2003, 8.1, 100);
//            Movie m49 = new Movie("Toy Story", "John Lasseter", "Animation, Adventure, Comedy", 1995, 8.3, 81);
//
//            ArrayList<Movie> movies = new ArrayList<>(Arrays.asList(m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19, m20, m21, m22, m23, m24, m25, m26, m27, m28, m29, m31, m32, m33, m34, m35, m36, m37, m38, m39, m40, m41, m42, m43, m44, m45, m46, m47, m48, m49));
//
//            return movies;
//        }
//
//        public static void main(String[] args) {
//            ArrayList<Movie> movies = generateMovies();
//            // getMoviesInYear(movies, 2000 , 2010);
//            // getMoviesInGenre (movies, "romance"); // -> print all movies which have 'drama' as a genre
//             getMoviesByDirector(movies,"James Cameron");
//            //getMoviesInRate(movies, 5.5, 7.6);
//
//        }
//
//        // printMovies
//        public static void printMovies(ArrayList<Movie> moviesList) {
//
//            int number = 1;
//            for (Movie m : moviesList) {
//                System.out.println(number + ")" + m);
//                number++;
//
//            }
//        }
//
//        // get movies in a specific year
//        public static void getMoviesInYear(ArrayList<Movie> moviesList, int year) {
//            ArrayList<Movie> list = new ArrayList<>();
//            for (Movie m : moviesList) {
//                if (m.getYear() == year) list.add(m);
//            }
//            // print my list which hold movies with a given specific year
//            printMovies(list);
//        }
//
//        public static void getMoviesInYear(ArrayList<Movie> movieList, int year1, int year2) {
//            ArrayList<Movie> list = new ArrayList<>();
//            for (Movie m : movieList) {
//                if (m.getYear() >= year1 && m.getYear() <= year2) {
//                    list.add(m);
//
//                }
//            }
//            printMovies(list);
//        }
//
//        public static void getMoviesInGenre(ArrayList<Movie> moviesList, String genre) {
//            ArrayList<Movie> list = new ArrayList<>();
//            for (Movie m : moviesList) {
//                if (m.getGenre().toLowerCase().contains(genre)) {
//                    list.add(m);
//
//                }
//            }
//            printMovies(list);
//
//        }
//
////       public static void getMoviesByDirector(Arrays<Movie> moviesList, String director)
//
//      ArrayList<Movie> list = new ArrayList<>();
////  //          for(Movie m :moviesList)
////        if(m.getdirector().toLowerCase(). trim().contains(director.toLowerCase()))
////         list.add(m);
////
////
////         }
////    }
//
//  //      printMovies(list);
//  //          }
//
//        public static void getMoviesInRate(ArrayList<Movie> movies, double rate1, double rate2) {
//            ArrayList<Movie> list = new ArrayList<>();
//            for (Movie m : movies) {
//                if (m.getImdbRate() >= rate1 && m.getImdbRate() <= rate2) {
//                    list.add(m);
//
//                }
//            }
//            printMovies(list);
////        }