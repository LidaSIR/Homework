package oop.home_task.barista;

/**
 * Created by Lida on 05.08.2016.
 */
abstract class MakeDrink {

    public void boilWater() {
        System.out.println("Boiling water");
    }
    public void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }
    public void addLemon() {
        System.out.println("Adding Lemon");
    }

}
