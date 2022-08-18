import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MovieLinksBackend {
    private static HashMap<Integer, Actor> actors;
    private static HashMap<Integer, Movie> movies;
    private static int counter;
    public static void main(String[] args) throws FileNotFoundException {

        movies = new HashMap<>();
        actors = new HashMap<>();

        //Populating the Hashmaps
        //First Hashmap to be populated: Actors

        
        
        File actorsFile = new File("Actors.txt");
        Scanner scanningActorsFile = new Scanner(actorsFile);
        int numberOfActors = scanningActorsFile.nextInt(); //Amount of actors
        scanningActorsFile.nextLine();
        for (int i=0; i<numberOfActors;i++){
            Actor creatingActorObject = new Actor(); //Creating actor object
            creatingActorObject.setName(scanningActorsFile.nextLine()); //Setting the name on the Actor object
            creatingActorObject.setID(scanningActorsFile.nextInt()); //Setting the ID on the Actor object
            int moviesStarred = (scanningActorsFile.nextInt()); //Amount of movies starred     
            scanningActorsFile.nextLine();                                                                                                               
            for (int j=0;j<moviesStarred;j++){
                creatingActorObject.getMoviesIn().add(scanningActorsFile.nextLine()); //Populating the arraylist with said movies.
            }
            actors.put(creatingActorObject.getID(), creatingActorObject); //Allocating onto hashmap once actor has been created
        }

        scanningActorsFile.close();

        

        //Second Hashmap to be populated: movies 

        File moviesFile = new File("Movies.txt");
        Scanner scanningMoviesFile = new Scanner(moviesFile);
        int numberOfMovies = scanningMoviesFile.nextInt(); //Amount of movies
        scanningMoviesFile.nextLine();
        for (int i=0; i<numberOfMovies;i++){
            Movie creatingMovieObject = new Movie(); //Creating movie object
            creatingMovieObject.setName(scanningMoviesFile.nextLine()); //Setting the name on the Movie object
            creatingMovieObject.setID(scanningMoviesFile.nextInt()); //Setting the ID on the Movie object
            int actorsInMovie = scanningMoviesFile.nextInt(); //Amount of actors in said movie
            scanningMoviesFile.nextLine();
            for (int j=0;j<actorsInMovie;j++){
                creatingMovieObject.getActorsIn().add(scanningMoviesFile.nextLine()); //Populating the arraylist with said movies.
            }
            movies.put(creatingMovieObject.getID(), creatingMovieObject); //Allocating onto hashmap once actor has been created
        }

        scanningMoviesFile.close();

        

        //Selecting two people
        Integer MathRandom = (int) Math.round(Math.random()*10)+1;
        String firstActor = actors.get(MathRandom).getName(); //NOTE: this can obviously be done in a different manner
        Actor startingActor = actors.get(MathRandom);
        int MathRandom2 = (int) Math.round(Math.random()*10)+1;
        String secondActor = actors.get(MathRandom2).getName();
        Actor endingActor = actors.get(MathRandom2);

        System.out.println("Find a connection between " + firstActor + " and " + secondActor);
        //Setup is done, game is ready to be played.

        

        recursivePlay(startingActor, endingActor, actors, movies);
    }


    public static void recursivePlay(Actor startingActor, Actor endingActor, HashMap<Integer, Actor> actors, HashMap<Integer, Movie> movies){
        
        StdOut.println(startingActor.getName());
        for(int i=0; i< startingActor.getMoviesIn().size();i++){
            StdOut.println(i+1 + ". " + startingActor.getMoviesIn().get(i));
        }
        StdOut.print("Choose the movie => ");
        int movieChoice = Integer.parseInt(StdIn.readLine());     
        
        

       

    }
    
}
