import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;

public class Exercise{

    // instance variables
    String name;        // name of the excercise
    String description; // description of the excercise
    String tutorial;    // description of how to do the excercise. For the reader to read.
    int difficulty;     // number from 1 to 5 representing how advanced / difficult the exercise is.
    int type;           // 0 means lower body excercise. 1 means core excercise. 2 means upper body excercise.

    // default constructor
    public Excercise(){

    }

    // primary constructor
    public Excercise(String name, String description, int difficulty, int type){
        this.name = name;
        this.description = description;
        this.difficulty = difficulty;
        try{
            if(type < 3 && type > -1){
                this.type = type;
            }
            else{
                throw new Exception();
            }
        }
    }

    public String toString(){
        return "maybe the description?";
    }
}