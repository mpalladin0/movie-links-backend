import java.util.*;

public class MovieLinksBackend {
    private static HashMap<Integer, Actor> actors;
    private static HashMap<Integer, Movie> movies;
    private static int counter;
    public static void main(String[] args) {

        movies = new HashMap<>();
        actors = new HashMap<>();

        //Populating the Hashmaps
        //First Hashmap to be populated: Actors

        StdIn.setFile("Actors.txt");
        int numberOfActors = StdIn.readInt(); //Amount of actors
        for (int i=0; i<numberOfActors;i++){
            Actor creatingActorObject = new Actor(); //Creating actor object
            creatingActorObject.setName(StdIn.readString()); //Setting the name on the Actor object
            creatingActorObject.setID(StdIn.readInt()); //Setting the ID on the Actor object
            int moviesStarred = StdIn.readInt(); //Amount of movies starred                                                                                                                    
            for (int j=0;j<moviesStarred;j++){
                creatingActorObject.getMoviesIn().add(StdIn.readString()); //Populating the arraylist with said movies.
            }
            actors.put(creatingActorObject.getID(), creatingActorObject); //Allocating onto hashmap once actor has been created
        }

        //Second Hashmap to be populated: movies 

        StdIn.setFile("Movies.txt");
        int numberOfMovies = StdIn.readInt(); //Amount of movies
        for (int i=0; i<numberOfMovies;i++){
            Movie creatingMovieObject = new Movie(); //Creating movie object
            creatingMovieObject.setName(StdIn.readString()); //Setting the name on the Movie object
            creatingMovieObject.setID(StdIn.readInt()); //Setting the ID on the Movie object
            int actorsInMovie = StdIn.readInt(); //Amount of actors in said movie
            for (int j=0;j<actorsInMovie;j++){
                creatingMovieObject.getActorsIn().add(StdIn.readString()); //Populating the arraylist with said movies.
            }
            movies.put(creatingMovieObject.getID(), creatingMovieObject); //Allocating onto hashmap once actor has been created
        }

        //Selecting two people
        int MathRandom = (int)Math.random()*10;
        String firstActor = actors.get(MathRandom).getName(); //NOTE: this can obviously be done in a different manner
        int MathRandom2 = (int)Math.random()*10;
        String secondActor = actors.get(MathRandom2).getName();

        //Setup is done, game is ready to be played.
       
        

        
        

        //Random algo selects 2 people
        //CLI shows the 1st author and the list of movies they are in
        //Enter number=> 
        // Number entered
        //3 statements: if it equals the desired actor, if its an actor selection or movie selection, then continue.
    }
    
}
