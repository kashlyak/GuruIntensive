package by.jrr.kashlyak.hw2.bean;

import java.util.Objects;

public class Dog {
    int age;
    String color;
    String name;

    public Dog() {
        //default method
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                Objects.equals(color, dog.color) &&
                Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color, name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
