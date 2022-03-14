package design.builder_pattern;

/**
 * Description 食物构建者
 * Date 2022/3/14 9:17
 * Version 1.0.1
 *
 * @author Wen
 */
public class MealBuilder {

    /**
     * 准备饮料
     * @return
     */
    public Meal prepareDrink() {
        Meal meal = new Meal();
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 准备汉堡
     * @return
     */
    public Meal prepareBurger() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        return meal;
    }
}
