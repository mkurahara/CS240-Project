public class Survey{
    
    //instance variables
    private String userName;
    private Routine previousRoutine;
    private Routine newRoutine;
    private int exp;
    private int focus;
    private int SqtMx;
    private int BnchMx;
    private int ClnMx;
    
    //default constructor
    public Survey(){

    }
    //primary constructor
    public Survey(User user){
        this.previousRoutine = user.getRoutine();
    }

    // displays the Survey to the user
    public void displaySurvey(){
        //GUI WORK
    }
    // exits the Survey, hiding it from the user
    public void closeSurvey(){
        //GUI WORK
    }
    // hides the Survey from the user. Attempts to save data.
    public void hideSurvey(){
        //GUI WORK
    }

    public void getExperience(){
        
    }
    public void getfocus(){
        
    }
    public void getSqtMx(){
        
    }
    public void getBnchMx(){
        
    }
    public void getClnMx(){
        
    }
    public void sendData(){
        // sends stored data to the database
    }
    // acquires the user's current routine
    public Routine generateRoutine(Routine previousRoutine){
        // edit Routine
        return previousRoutine;
    }
    //
    public void selectExercisesCompleted(){
        //GUIWORK
    }
    // sets the user's routine as the newly constructed one
    public void setRoutine(Routine newRoutine){
        this.newRoutine = newRoutine;
    }

    public void setUserComfort(int comfort){

    }
    public String toString(){
        return "yet to do toString";


    }
}