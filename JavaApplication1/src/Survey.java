/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Tobi Butler
 */
public class Survey{
    
    //instance variables
    //private String username;
    private Routine previousRoutine;
    private Routine newRoutine;
    private int totalComfort;
    //private int focus;
    private int sqtMx;
    private int bnchMx;
    private int clnMx;
    private int exp;
    //private SurveyGuiUI gui;
    
    //default constructor
    public Survey(){

    }
    //primary constructor
    public Survey(String username, Routine routine){
        //this.previousRoutine = user.getRoutine();
        this.totalComfort = 0;
        this.previousRoutine = routine;
    }

    public int getExp(){
        return this.exp;
    }
    public void getfocus(){
        
    }
    public int getBnchMx(){
        return this.bnchMx;
    }
    public void setBnchMx(int bnchMx){
        this.bnchMx = bnchMx;
    }
    public int getSqtMx(){
        return this.sqtMx;
    }
    public void setSqtMx(int sqtMx){
        this.sqtMx = sqtMx;
    }
    public int getClnMx(){
        return this.clnMx;
    }
    public void setClnMx(int clnMx){
        this.clnMx = clnMx;
    }
    public void sendData(){
        // sends stored data to the database
    }
    // acquires the user's current routine
    public Routine generateRoutine(Routine previousRoutine){
        // edit Routine
        return newRoutine;
    }
    public Routine getPreviousRoutine(){
        return previousRoutine;
    }
    // sets the user's routine as the newly constructed one
    public void setRoutine(Routine newRoutine){
        this.newRoutine = newRoutine;
    }

    public void setExp(){
        this.exp = totalComfort / previousRoutine.getLength();
    }

    public int getTotalComfort(){
        return this.totalComfort;
    }
    public void setTotalComfort(int comfort){
        this.totalComfort = comfort;
    }
    public String toString(){
        return "yet to do toString";


    }
}
