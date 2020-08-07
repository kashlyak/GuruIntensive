package by.javaguru.intensive.hw.bean;

import junit.framework.TestCase;

public class CircleTest extends TestCase {

    public void testTestEquals() {
        Circle circle = new Circle();
        circle.setRadius(5.5);
        Circle circle2 = new Circle();
        circle2.setRadius(5.5);

        boolean expected = true;
        boolean actual = circle.equals(circle2);
        assertEquals(expected,actual);

    }

    public void testTestHashCode() {
        Circle circle = new Circle();
        circle.setRadius(5.5);

        int expected = 1075183647;
        int actual =circle.hashCode();
        assertEquals(expected,actual);
    }

    public void testTestToString() {
        Circle circle = new Circle();
        circle.setRadius(5.5);

        String expected = "Circle{radius=5.5}";
        String actual = circle.toString();
        assertEquals(expected,actual);
    }
}