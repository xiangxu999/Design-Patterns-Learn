package design.builder_pattern;

/**
 * Description 建造者案例
 * Date 2022/3/14 9:19
 * Version 1.0.1
 *
 * @author Wen
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareDrink();
        System.out.println("Drink");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareBurger();
        System.out.println("\n\nBurger");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
