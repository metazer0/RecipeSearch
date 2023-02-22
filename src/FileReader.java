import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    private RecipeBook recipeList;
    public FileReader(){

    }

    public RecipeBook readFile(String filename){

        recipeList = new RecipeBook();
        int nameIndex= 0;
        int timeIndex = 1;

        try(Scanner reader = new Scanner(Paths.get(filename))){
            ArrayList<String> fileRows = new ArrayList<>();
            while(reader.hasNextLine()){
                String row = reader.nextLine();
                if(row.trim().isEmpty() || !(reader.hasNextLine())){
                    String name = fileRows.get(nameIndex);
                    int time = Integer.valueOf(fileRows.get(timeIndex));
                    ArrayList<String> ingredientList = new ArrayList<>();
                    for(int i = timeIndex+1 ; i < fileRows.size(); i++){
                        ingredientList.add(fileRows.get(i));
                    }
                    recipeList.addRecipe(new Recipe(name,time,ingredientList));
                    nameIndex = fileRows.size();
                    timeIndex = nameIndex + 1;
                }else{
                    fileRows.add(row);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        recipeList.listRecipe();
        return this.recipeList;
    }
}
