public class User{  // represents a User

    //instance variables
    private String userName;
    private int iD;
    private boolean hasRoutine;
    private int experience;
    private int benchWt;
    private int squatWt;
    private Routine currentRoutine;

    // default constructor
    public User(){
        this.userName = null;
        this.iD = 0;
        this.hasRoutine = false;
    }

    //primary constructor
    public User(String userName, int iD){
        this.userName = userName;
        this.iD = iD;
        this.hasRoutine = false;
    }
    //more detailed constructor
    public User(String userName, int iD, int experience, int benchWt, int sqautWt){
        this.userName = userName;
        this.iD = iD;
        this.hasRoutine = false;
        this.experience = experience;
        this.benchWt = benchWt;
        this.squatWt = squatWt;
    }

    public String getUserName(){
        return this.userName;
    }
    public String getID(){
        return this.iD;
    }

    public int getExp(){
        return this.experience;
    }
    public int getBenchWt(){
        return this.benchWt;
    }
    public int getSquatWt(){
        return this.squatWt;
    }

    public Routine getRoutine(){
        return currentRoutine;
    }

}