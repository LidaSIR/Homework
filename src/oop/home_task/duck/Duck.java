package oop.home_task.duck;

/**
 * Created by Lida on 05.08.2016.
 */
public class Duck implements Comparable<Duck>{

    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return name + " weighs " + weight;
    }

    @Override
    public int compareTo(Duck compareDuck) {
        int compare = compareDuck.getWeight();
        return this.weight - compare;
    }
}

