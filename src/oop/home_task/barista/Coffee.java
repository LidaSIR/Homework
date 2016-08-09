package oop.home_task.barista;

/**
 * Created by Lida on 05.08.2016.
 */
public class Coffee extends MakeDrink {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

}
