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
import java.io.File;
import java.util.ArrayList;

public class WorkOutApp{
/** 
 * This class tests the ability of the ExerciseReader class to use 
 * the Exercise class, and an input file named "workoutfile.txt" 
 * which holds a list of exercises, their descriptions, type of exercise, and difficulty of the exercise. 
 * When the main method is run, it will compile all the exercises and separate them 
 * into different ArrayLists based off of what type of exercise it is (Leg,Arm,Core).
     * @param args
 */
    public static void main(String[] args){
        //Scanner user = new Scanner(System.in);
        String inputFile;
        //System.out.println("Input file name: ");
        //inputFile = user.nextLine().trim();
        inputFile = "workoutfile.txt";
        File filename = new File(inputFile);
        ExerciseReader ex = new ExerciseReader(filename);
        TypeCreator type = new TypeCreator(ex.getList());
        type.createTypeLists();
        ArrayList<Exercise> legEx = type.getList(1);
        ArrayList<Exercise> coreEx = type.getList(2);
        ArrayList<Exercise> armEx = type.getList(3);
        //System.out.println("Leg Exercises: " + legEx + "\nCore Exercises: " + coreEx + "\nArm Exercises: " + armEx);
        DifficultySeparator legs = new DifficultySeparator(legEx);
        Routine legs1 = new Routine(legs.getList("Difficulty1"));
        Routine legs2 = new Routine(legs.getList("Difficulty2"));
        Routine legs3 = new Routine(legs.getList("Difficulty3"));
        DifficultySeparator core = new DifficultySeparator(coreEx);
        Routine core1 = new Routine(core.getList("Difficulty1"));
        Routine core2 = new Routine(core.getList("Difficulty2"));
        Routine core3 = new Routine(core.getList("Difficulty3"));
        DifficultySeparator arms = new DifficultySeparator(armEx);
        Routine arms1 = new Routine(arms.getList("Difficulty1"));
        Routine arms2 = new Routine(arms.getList("Difficulty2"));
        Routine arms3 = new Routine(arms.getList("Difficulty3"));
        System.out.println("LEGS SPLIT BY DIFFICULTY: \nDifficulty 1: " + legs.getList("difficulty1") + "\nDifficulty 2: " + legs.getList("difficulty2") + "\nDifficulty 3: " + legs.getList("difficulty3"));
        System.out.println("CORE SPLIT BY DIFFICULTY: \nDifficulty 1: " + core.getList("difficulty1") + "\nDIfficulty 2: " + core.getList("difficulty2") + "\nDifficulty 3: " + core.getList("difficulty3"));
        System.out.println("ARMS SPLIT BY DIFFICULTY: \nDifficulty 1: " + arms.getList("difficulty1") + "\nDifficulty 2: " + arms.getList("difficulty2") + "\nDifficulty 3: " + arms.getList("difficulty3"));
        System.out.println("Done.");
    }

}

    

