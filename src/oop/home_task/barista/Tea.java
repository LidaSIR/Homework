package oop.home_task.barista;

/**
 * Created by Lida on 05.08.2016.
 */
public class Tea extends Drink {

    void prepareRecipe() {
        boilWater();
        pourInCup();
        addLemon();
        steepTeaBag();
    }

    public  void steepTeaBag() {
        System.out.println("Steeping the tea");
    }
    public  void addLemon() {
        System.out.println("Adding Lemon");
    }
}
