package by.javaguru.intensive.hw.service;

import by.javaguru.intensive.hw.bean.Circle;
import junit.framework.TestCase;
import org.junit.Test;

public class CircleServiceTest extends TestCase {

    @Test
    public void testCalculateArea() {
        Circle circle = new Circle();
        circle.setRadius(5.5);

        CircleService circleService = new CircleService(circle);
        double expected = 34.54;
        double actual = circleService.calculateArea();

        assertEquals(expected, actual);
    }




}