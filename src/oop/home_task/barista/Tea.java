package oop.home_task.barista;

/**
 * Created by Lida on 05.08.2016.
 */
public class Tea extends MakeDrink {
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }
}
