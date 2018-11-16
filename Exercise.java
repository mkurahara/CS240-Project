
public class Exercise{

    // instance variables
    String name;        // name of the excercise
    String description; // description of the excercise
    String tutorial;    // description of how to do the excercise. For the reader to read.
    int difficulty;     // number from 1 to 5 representing how advanced / difficult the exercise is.
    int type;           // 0 means lower body excercise. 1 means core excercise. 2 means upper body excercise.

    // default constructor
    public Exercise(){
        name = "";
        description = "";
        difficulty = 0;
        type = 0;
    }

    // primary constructor
    public Exercise(String name, String description, int difficulty, int type){
        this.name = name;
        this.description = description;
        this.difficulty = difficulty;
        try{
            if(type <= 3 && type > 0){
                this.type = type;
            }
        }
        finally {
                //throw new Exception();
        }

    }

    public int getType(){
        return type; 
    }

    public int getDifficulty(){
        return difficulty;
    }

    public String toString(){
        return ("[Exercise: " + name + ", " + description + ", " + "Difficulty: " + difficulty + ", " + "Type: " + type + "]");
    }
}
