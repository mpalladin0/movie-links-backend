import java.util.*;
public class Movie {
    private int ID;
    private String Name;
    private ArrayList<String> ActorsIn;
    private boolean Counted;

    public Movie(){
        this.Name = "";
        this.ID = 0;
        this.ActorsIn = new ArrayList<>();
        this.Counted = false;
    }

    public Movie(int ID, String Name, ArrayList<String> ActorsIn){
        this.ID = ID;
        this.Name = Name;
        this.ActorsIn = ActorsIn;
        this.Counted = false;
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

    public ArrayList<String> getActorsIn(){
        return ActorsIn;
    }

    public void setActorsIn(ArrayList<String> ActorsIn){
        this.ActorsIn = ActorsIn;
    }
    public void setCounted(){
        this.Counted = true;
    }

    public boolean getCounted(){
        return Counted;
    }
}
