import java.util.*;


public class Actor{
    private int ID;
    private String Name;
    private ArrayList<String> MoviesIn;

    public Actor(){
        this.Name = "";
        this.ID = 0;
        this.MoviesIn = new ArrayList<>();

    }

    public Actor(int ID, String Name, ArrayList<String> MoviesIn){
        this.ID = ID;
        this.Name = Name;
        this.MoviesIn = MoviesIn;
    }

    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    
    }
    
    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public ArrayList<String> getMoviesIn(){
        return MoviesIn;
    }

    public void setMoviesIn(ArrayList<String> MoviesIn){
        this.MoviesIn = MoviesIn;
    }
}
    
