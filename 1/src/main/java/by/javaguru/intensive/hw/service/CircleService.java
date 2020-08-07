package by.javaguru.intensive.hw.service;

import by.javaguru.intensive.hw.bean.Circle;

public class CircleService {
    private Circle circle;

    public CircleService(Circle circle) {
        this.circle = circle;
    }

    public double calculateArea() {
        return (circle.getRadius()*2)*3.14;
    }
}
