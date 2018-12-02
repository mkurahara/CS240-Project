/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workoutapp;

/**
 *
 * @author Montana Kurahara
 */
import java.util.ArrayList;
import java.util.Random;

public class Routine{

    public int sets;
    public int reps;
    public int weight;
    public int userWeight;
    public SetsAndReps setsAndReps;
    private Random rand = new Random();
    private ArrayList<String> srl = new ArrayList<>();
    public ArrayList<Integer> userMaxes;
    private ArrayList<Exercise> routineList;

    public Routine(){
        routineList = new ArrayList<>();
        setsAndReps = new SetsAndReps();
        weight = 0;
        userWeight = 0;
        userMaxes = new ArrayList<>();
        reps = 0;
        sets = 0;
    }
    public Routine(ArrayList<Exercise> routList){
        routineList = routList;
        userMaxes = new ArrayList<>();//getUserMaxes(); //need to implement
        userMaxes.add(300);
        userMaxes.add(0);
        userMaxes.add(200);
        for(int i=0; i < routineList.size(); i++){
            Exercise exercise = routineList.get(i);
            weight = getWeight(exercise);
            exercise.setWeight(weight);;
            setsAndReps = new SetsAndReps(exercise);
            reps = setsAndReps.getReps();
            sets = setsAndReps.getSets();
        }
        
    }
    
    public int getLength(){
        return routineList.size();
    }

    public String getSetsAndReps(){
        String setsRepsStr = "" + sets + " sets and " + reps + " reps.";
        return setsRepsStr;
    }

    private int getWeight(Exercise exercise){
        RepWeight setWeight = new RepWeight(exercise, reps, userMaxes);
        weight = setWeight.getWeight();
        return weight;
    }

    public ArrayList<Exercise> getRoutine() {
        return routineList;
    }
}
