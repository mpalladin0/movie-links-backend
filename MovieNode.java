import java.util.HashSet;
import java.util.UUID;

public class MovieNode {
    private UUID uuid = UUID.randomUUID();
    private String name;
    private HashSet<ActorNode> actors = new HashSet<ActorNode>();

    public MovieNode(String name) {
        this.name = name;
        this.actors = findActorsInMovieFromImdb(name);
    }

    public UUID getUUID() {
        return this.uuid;
    }

    public String getName() {
        return this.name;
    }

    public HashSet<ActorNode> getActors() {
        return this.actors;
    }

    /**
     * Ping IMDB for the actors in this movie then:
     * 1. Create an ActorNode for each of them
     * 2. Place each ActorNode in the actors HashSet
     * 
     * @return HashSet<ActorNode>
     */
    private HashSet<ActorNode> findActorsInMovieFromImdb(String movieName) {
        HashSet<ActorNode> actors = new HashSet<ActorNode>();

        // mock right now, will be replaced with an API call to IMDB database later
        actors.add(new ActorNode("Johnny Depp"));
        actors.add(new ActorNode("Harrison Ford"));

        return actors;
    }

}
