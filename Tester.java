import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Tester{
/** 
 * This class tests the ability of the ExerciseReader class to use 
 * the Exercise class, and an input file named "workoutfile.txt" 
 * which holds a list of exercises, their descriptions, type of exercise, and difficulty of the exercise. 
 * When the main method is run, it will compile all the exercises and separate them 
 * into different ArrayLists based off of what type of exercise it is (Leg,Arm,Core).
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
        System.out.println("Leg Exercises: " + legEx + "\nCore Exercises: " + coreEx + "\nArm Exercises: " + armEx);
        System.out.println("Done.");
    }

}
