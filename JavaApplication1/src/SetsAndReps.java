/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Montana Kurahara
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

public class SetsAndReps{

    private Exercise ex;
    private HashMap<Integer,String> sr;
    private Random rand = new Random();
    public int sets;
    public int reps;

    public SetsAndReps(){
        ex = new Exercise();
    }

    public SetsAndReps(Exercise input){
        ex = input;
        sr = new HashMap<>();
        sr.put(1,"5,5");
        sr.put(2,"3,8");
        sr.put(3,"5,8");
        sr.put(4,"3,10");
        sr.put(5,"3,12");
        int n = rand.nextInt(5) + 1;
        String str = sr.get(n);
        String[] strList = str.split(",");
        sets = Integer.parseInt(strList[0]);
        reps = Integer.parseInt(strList[1]);
        ex.setSetsAndReps(sets, reps);
    }

    public int getSets(){
        return sets;
    }

    public int getReps(){
        return reps;
    }
}
