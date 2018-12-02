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

public class DifficultySeparator {

    public ArrayList<Exercise> list;
    public ArrayList<Exercise> difficulty1;
    public ArrayList<Exercise> difficulty2;
    public ArrayList<Exercise> difficulty3;
    

    public DifficultySeparator(){
        list = new ArrayList<>();
    }

    public DifficultySeparator(ArrayList<Exercise> inputlist){
        list = inputlist;
        difficulty1 = new ArrayList<>();
        difficulty2 = new ArrayList<>();
        difficulty3 = new ArrayList<>();
        for( int i = 0; i < list.size(); i++ ){
            Exercise e = list.get(i);
            if (e.getDifficulty() == 1) {
                difficulty1.add(e);
            } else if ( e.getDifficulty() == 2){
                difficulty2.add(e);
            } else if ( e.getDifficulty() == 3) {
                difficulty3.add(e);
            }
        }
    }
    
    public ArrayList<Exercise> getList(String listname){
        ArrayList<Exercise> eList = null;
        if(listname == "difficulty1"){
            eList = difficulty1;
        } else if(listname == "difficulty2"){
            eList = difficulty2;
        } else if(listname == "difficulty3"){
            eList = difficulty3;
        }
        return eList;
    }
}