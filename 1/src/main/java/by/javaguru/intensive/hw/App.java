package by.javaguru.intensive.hw;

import by.javaguru.intensive.hw.bean.Circle;
import by.javaguru.intensive.hw.service.CircleService;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5.5);

        CircleService circleService = new CircleService(circle);
        System.out.println("circleService.calculateArea() = " + circleService.calculateArea());

    }
}
