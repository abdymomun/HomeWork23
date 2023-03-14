import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
ArrayList<Cast>casts=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("menu" +
                "\nGet all movies" +
                "\nFind movie by name" +
                "\nFind movie by actor name" +
                "\nFind movie by year" +
                "\nFind movie by director" +
                "\nFind movie by description" +
                "\nFind movie by role");
        Movie movie = new Movie("Avatar", 2022, "Фантастический фильм",new  Director("Джеймс","Кэмерон", new Cast("James Cameron", "Сэм Уортингтон")));

        Movie movie1 = new Movie("Transformers",2007,"Фантастический фильм",new Director("gkdgd", "kfgsgg", new Cast("James Cameron", "Сэм Уортингтон")));

        Movie movie2 = new Movie("Great wall",2016,"Фантастический фильм",new Director("dgdg","dgd", new Cast("James Cameron", "Сэм Уортингтон")));



        Methods methods = new Methods();

        Movie [] movies = {movie,movie1,movie2};



        while (true) {
            String a = scanner.nextLine();
            switch (a) {
                case "Get all movies":
                    methods.getAllMovies(List.of(movies));
                    break;
                case "Find movie by name":
                    methods.findMovieByName(List.of(movies));
                    break;
                case "Find movie by actor name":
                    methods.findMovieByActorName(List.of(movies));
                    break;
                case "Find movie by year":
                    methods.findMovieByYear(List.of(movies));
                    break;
                case "Find movie by director":
                    methods.findMovieByDirector(List.of(movies));
                    break;
                case "Find movie by description":
                    methods.findMovieByDescription(List.of(movies));
                    break;
                case "Find movie by role":
                    methods.findMovieByRole(List.of(movies));
                    break;
                default:
                    System.out.println("такого Фильма нет ");
            }
        }
    }
    }
