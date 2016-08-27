package oop.week_6_hashTable;

import java.util.Iterator;

/**
 * Created by Lida on 10.08.2016.
 */
public class Worker implements Iterable {

    private String name;
    private int age;
    private int salary;

    public Worker(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 17 + age;
        hash = hash * 31 + name.hashCode();
        hash = hash * 13 +  salary;

        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        if (age != worker.age) return false;
        if (salary != worker.salary) return false;
        return name != null ? name.equals(worker.name) : worker.name == null;

    }

    @Override
    public Iterator iterator() {
        return null;
    }
}

