import java.util.ArrayList;

public class RecipeBook {
    private ArrayList<Recipe> recipes;

    public RecipeBook(){
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe){
        this.recipes.add(recipe);
    }

    public void listRecipe(){
        System.out.println("Recipes");
        for (Recipe recipe : recipes) {
            System.out.println(recipe.getName()+", cooking time:"+recipe.getCookingTime());
        }
    }

    public void findByName(String name){
        System.out.println("Recipes");
        for (Recipe recipe : recipes) {
            if(recipe.getName().contains(name)){
                System.out.println(recipe.getName()+", cooking time:"+recipe.getCookingTime());
            }
        }
    }

    public void findByTime(String time){
        int cookingTime = Integer.valueOf(time);
        for (Recipe recipe : recipes) {
            if(recipe.getCookingTime() <= cookingTime){
                System.out.println(recipe.getName()+", cooking time:"+recipe.getCookingTime());
            }
        }
    }

    public void findByIngredient(String ingredient){
        for (Recipe recipe : recipes) {
            ArrayList<String> ingredients = recipe.getIngredients();
            for (String s : ingredients) {
                if(ingredient.equals(s)){
                    System.out.println(recipe.getName()+", cooking time:"+recipe.getCookingTime());
                }
            }
        }
    }
}
