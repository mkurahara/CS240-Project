import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseReader{

  public ArrayList<Exercise>exercises;

  public ExerciseReader(){

  }

  public ExerciseReader(File filename){
    exercises = new ArrayList<Exercise>();
    File file = filename;

    try {

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
          String str = scanner.nextLine();
          List<String> ex = new ArrayList<String>(Arrays.asList(str.split(",")));
          int difficulty = Integer.parseInt(ex.get(2));
          int type = Integer.parseInt(ex.get(3));
          Exercise exercise = new Exercise(ex.get(0),ex.get(1),difficulty,type);
          exercises.add(exercise);
        }
        //System.out.println(exercises);
        scanner.close();
    }
    catch (FileNotFoundException e){
      e.printStackTrace();
    }
  }

  public ArrayList<Exercise> getList(){
    return exercises;
  }
}
