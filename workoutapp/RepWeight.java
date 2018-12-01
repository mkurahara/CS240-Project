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

public class RepWeight{

    private Exercise exercise;
    private String eName;
    private int reps;
    private ArrayList<Integer> userMaxes;
    private int eType;
    private int weight;
    private int time;
    private int userMax;


    public RepWeight(){
        exercise = null;
        reps = 0;
        userMaxes = new ArrayList<>();
        eType = 0;
        eName = "";
        weight = 0;
        time = 0;
    }

    public RepWeight(Exercise input, int numReps, ArrayList<Integer> maxes){
        exercise = input;
        reps = numReps;
        eType = exercise.getType();
        eName = exercise.getName();
        userMax = maxes.get(eType-1);
        weight = 0;
        time = 0;
    }

    public int getWeight(){
        String search = "dumbbell";
        if(eType == 1){
            if(reps < 10){
                double tempWeight = (userMax * (.75));
                weight = (int) (5*(Math.round(tempWeight/5)));
            } else {
                double tempWeight = (userMax * (.60));
                weight = (int) (5*(Math.round(tempWeight/5)));
            }
        } else if(eType == 3){
            if(eName.toLowerCase().indexOf(search.toLowerCase()) != -1){
                if (reps < 10){
                    double tempWeight = ((userMax * (.50))/2);
                    weight = (int) (5*(Math.round(tempWeight/5)));
                } else {
                    double tempWeight = ((userMax * (.40))/2);
                    weight = (int) (5*(Math.round(tempWeight/5)));
                }
            } else {
                if (reps < 10){
                    double tempWeight = (userMax * (.70));
                    weight = (int) (5*(Math.round(tempWeight/5)));
                } else {
                    double tempWeight = (userMax * (.60));
                    weight = (int) (5*(Math.round(tempWeight/5)));
                }
            }
        } else {
            time = 60;
        }
         
        return weight;
    }
}
