import java.util.ArrayList;

public class TypeCreator{


    //instance variables
    public ArrayList<Exercise> exerciseList;
    public ArrayList<Exercise> legExercises;
    public ArrayList<Exercise> armExercises;
    public ArrayList<Exercise> coreExercises;


    //default constructor
    public TypeCreator(){
        exerciseList = new ArrayList<Exercise>();
        legExercises = new ArrayList<Exercise>();
        armExercises = new ArrayList<Exercise>();
        coreExercises = new ArrayList<Exercise>();

    }

    public TypeCreator(ArrayList<Exercise> list){
        exerciseList = list;
        legExercises = new ArrayList<Exercise>();
        armExercises = new ArrayList<Exercise>();
        coreExercises = new ArrayList<Exercise>();
    }

    public void createTypeLists(){
        for(int i=0; i < exerciseList.size(); i++){
            Exercise exer = exerciseList.get(i);
            if(exer.getType() == 1){
                legExercises.add(exer);
            } 
            else if(exer.getType() == 2){
                coreExercises.add(exer);
            }
            else {
                armExercises.add(exer);
            }
        }
    }

    public ArrayList<Exercise> getList(int type){
        if(type == 1){
            return legExercises;
        }
        else if(type == 2){
            return coreExercises;
        }
        else {
            return armExercises;
        }
    }
}