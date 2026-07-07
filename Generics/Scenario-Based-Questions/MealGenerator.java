interface MealPlan{
    String getMealName();
}

class VegetarianMeal implements MealPlan{
    public String getMealName(){
        return "Vegetarian Meal";
    }
}

class VeganMeal implements MealPlan{
    public String getMealName(){
        return "Vegan Meal";
    }
}

class KetoMeal implements MealPlan{
    public String getMealName(){
        return "Keto Meal";
    }
}

class HighProteinMeal implements MealPlan{
    public String getMealName(){
        return "High Protein Meal";
    }
}

class Meal<T extends MealPlan>{
    private T meal;

    public Meal(T meal){
        this.meal=meal;
    }

    public T getMeal(){
        return meal;
    }
}

public class MealGenerator{
    public static <T extends MealPlan> void generateMeal(Meal<T> meal){
        System.out.println("Generated : " + meal.getMeal().getMealName());
    }

    public static void main(String[] args){
        Meal<VegetarianMeal> veg= new Meal<>(new VegetarianMeal());
        Meal<KetoMeal> keto= new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> hp= new Meal<>(new HighProteinMeal());

        generateMeal(veg);
        generateMeal(keto);
        generateMeal(hp);
    }
}