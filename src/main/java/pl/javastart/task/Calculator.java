package pl.javastart.task;

public class Calculator {
    boolean isEven(int number) {
        return number % 2 == 0;
    }

    boolean isOdd(int number) {
        return !isEven(number);
    }

    double circleField(double radius) {
        return Math.PI * radius * radius;
    }

    int power(int number) {
        return number * number;
    }
}
