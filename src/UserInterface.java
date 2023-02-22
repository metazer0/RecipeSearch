import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private RecipeBook recipe;
    private FileReader fr;
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.fr = new FileReader();
        this.recipe = new RecipeBook();
    }

    public void menu(){
        System.out.print("File to read:");
        String file = this.scanner.nextLine();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        String command = "";
        while(!(command.equals("stop"))){
            System.out.print("Enter command:");
            command = this.scanner.nextLine();
            if(command.equals("list")){
                recipe = fr.readFile(file);
                recipe.listRecipe();
            }
            if(command.equals("find name")){
                System.out.println("Searched word:");
                String word = this.scanner.nextLine();
                recipe = fr.readFile(file);
                recipe.findByName(word);
            }
            if(command.equals("find cooking time")){
                System.out.println("Max Cooking time:");
                String time = this.scanner.nextLine();
                recipe = fr.readFile(file);
                recipe.findByTime(time);
            }
            if(command.equals("find ingredient")){
                System.out.println("Enter command:");
                String ingredient = this.scanner.nextLine();
                recipe = fr.readFile(file);
                recipe.findByIngredient(ingredient);
            }
        }
    }
}
