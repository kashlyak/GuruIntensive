package by.jrr.kashlyak.hw2.bean;

import junit.framework.TestCase;

public class DogTest extends TestCase {

    public void testGetAge() {
        Dog dog = new Dog();
        dog.setAge(3);
        int expected = 3;
        int actual = dog.getAge();
        assertEquals(expected, actual);


    }

    public void testGetColor() {
        Dog dog = new Dog();
        dog.setColor("Black");
        String expected = "Black";
        String actual = dog.getColor();
        assertEquals(expected, actual);

    }

    public void testTestGetName() {
        Dog dog = new Dog();
        dog.setName("Elli");
        String expected = "Elli";
        String actual = dog.getName();
        assertEquals(expected, actual);
    }

    public void testTestEquals() {
        Dog dog  = new Dog();
        dog.setAge(3);
        dog.setColor("Gray");
        dog.setName("Elli");
        Dog dog2  = new Dog();
        dog2.setAge(3);
        dog2.setColor("Gray");
        dog2.setName("Elli");
        boolean expected = true;
        boolean actual = dog.equals(dog2);
        assertEquals(expected,actual);
    }

    public void testTestHashCode() {
        Dog dog = new Dog();

        int expected = 29791;
        int actual = dog.hashCode();
        assertEquals(expected, actual);
    }

    public void testTestToString() {
        Dog dog = new Dog();

        String expected = "Dog{Age=0, color='null', name='null'}";
        String actual = dog.toString();
        assertEquals(expected, actual);
    }

    public void testSetAge() {
        Dog dog = new Dog();
        dog.setAge(3);
        int expected = 3;
        int actual = dog.getAge();
        assertEquals(expected, actual);
    }

    public void testSetColor() {
        Dog dog = new Dog();
        dog.setColor("Black");
        String expected = "Black";
        String actual = dog.getColor();
        assertEquals(expected, actual);
    }

    public void testTestSetName() {
        Dog dog = new Dog();
        dog.setName("Elli");
        String expected = "Elli";
        String actual = dog.getName();
        assertEquals(expected, actual);
    }

    public void testTestEquals1() {
        Dog dog  = new Dog();
        dog.setAge(3);
        dog.setColor("Gray");
        dog.setName("Elli");
        Dog dog2  = new Dog();
        dog2.setAge(3);
        dog2.setColor("Gray");
        dog2.setName("Elli");
        boolean expected = true;
        boolean actual = dog.getColor().equals(dog2.getColor());
        assertEquals(expected,actual);
    }
}