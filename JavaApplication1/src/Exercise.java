/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Montana Kurahara
 */

public class Exercise{

    // instance variables
    private String name;        // name of the excercise
    private String description; // description of the excercise
    private String tutorial;    // description of how to do the excercise. For the reader to read.
    private int difficulty;     // number from 1 to 5 representing how advanced / difficult the exercise is.
    private int type;           // 0 means lower body excercise. 1 means core excercise. 2 means upper body excercise.
    private int weight;
    private int sets;
    private int reps;

    // default constructor
    public Exercise(){
        name = "";
        description = "";
        difficulty = 0;
        type = 0;
        weight = 0;
        reps = 0;
        sets = 0;
    }

    // primary constructor
    public Exercise(String name, String description, int difficulty, int type){
        this.name = name;
        this.description = description;
        this.difficulty = difficulty;
        weight = 0;
        reps = 0;
        sets = 0;
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
    
    public void setDifficulty(int difficulty){
        this.difficulty = difficulty;
    }

    public int getDifficulty(){
        return difficulty;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public int getWeight(){
        return weight;
    }

    public int getSets(){
        return sets;
    }

    public int getReps(){
        return reps;
    }
    
    public String getSetsAndReps(){
        String str = sets + " sets " + reps + " reps";
        return str;
    }

    public void setSetsAndReps(int inputSets, int inputReps){
        reps = inputReps;
        sets = inputSets;
    }

    public void setWeight(int inputWeight){
        weight = inputWeight;
    }

    public String toString(){
        return ("[Exercise: " + name + ", " + description + ", " + "Difficulty: " + difficulty + ", " + "Type: " + type + "]");
    }
}

