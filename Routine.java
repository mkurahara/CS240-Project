import java.util.ArrayList;

public class Routine{

    //instance variables
    private ArrayList<Excercise> routine = new ArrayList<Exercise>();

    //default constructor
    public Routine(){
        this.routine = null;
    }
    public Routine(ArrayList<Excercise> routine){
        this.routine = routine;
    }

    //public 

    // displays the routine window to the user
    public void display(){

    }

    public String toString(){
        return routine.toString();
    }


    
}