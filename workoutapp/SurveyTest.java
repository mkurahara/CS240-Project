/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workoutapp;

/**
 *
 * @author hellothere
 */
import java.util.ArrayList;
/*
    This class has a main method which creates an example exercise, routine, and survey to be used with the
    user interface. The main method prints out the initial values of the variables needed to be stored, runs the 
    user interface, and then prints the new values stored by the variables. It checks that the values stored were
    correctly altered by the survey user interface.
*/
public class SurveyTest{
    
    public static void main(String[] args) {
    Exercise example1 = new Exercise("pullups", "EXAMPLE: description of how to do a pullup", 2, 3);
    ArrayList<Exercise> routine = new ArrayList<Exercise>();
    routine.add(example1);
    Routine testingRoutine = new Routine(routine);
    Survey exampleSurvey = new Survey("testing", testingRoutine);

    //print out the values currently stored
        System.out.println("old Exercise difficulty: " + example1.getDifficulty());
        int compare = 1;
        System.out.println("old maximum weights:");
        System.out.println("Bench Press: " + exampleSurvey.getBnchMx());
        System.out.println("Squat Press: " + exampleSurvey.getSqtMx());
        System.out.println("Clean: " + exampleSurvey.getClnMx());

        final SurveyGuiUI testGui = new SurveyGuiUI(exampleSurvey);
        testGui.setDescription(example1.getDescription());  //sets the first exercise description shown by the survey
        testGui.setVisible(true);                           //show the survey 
        
        while(testGui.isVisible()){
            //wait until the survey window has closed
            System.out.println("waiting...");
        }
        // display the new values stored after the survey was been submitted
        System.out.println("new Exercise difficulty: " + example1.getDifficulty());
        System.out.println("new maximum weights:");
        System.out.println("Bench Press: " + exampleSurvey.getBnchMx());
        System.out.println("Squat Press: " + exampleSurvey.getSqtMx());
        System.out.println("Clean: " + exampleSurvey.getClnMx());
        
        //  Check if the correct values were stored
        if(compare == example1.getDifficulty()){
            System.out.println("Values match. They have been saved correctly.");
        }

    }
}
