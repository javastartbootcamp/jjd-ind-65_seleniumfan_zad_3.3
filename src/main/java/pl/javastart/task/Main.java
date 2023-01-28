package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int number = 8;
        double radius = 7.0;
        boolean isEven = calculator.isEven(number);
        System.out.printf("Is %s even? %b\n", number, isEven);

        boolean isOdd = calculator.isOdd(number);
        System.out.printf("Is %s odd? %b\n", number, isOdd);

        double circleArea = calculator.circleField(radius);
        System.out.printf("Circle field with radius = %.2f is: %.2f\n", radius, circleArea);

        int powerNumber = calculator.power(number);
        System.out.printf("Square of %d is %d", number, powerNumber);
    }
}
