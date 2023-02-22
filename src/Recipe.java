import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime,ArrayList<String> ingredients ){
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredient) {
        this.ingredients.add(ingredient);
    }
}
