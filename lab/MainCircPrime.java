package lab;
import java.util.Scanner;

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

class PrimeChecker {

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true;
    }
}

class MainCircPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Circle Calculations ---");
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle myCircle = new Circle(radius);
        
        System.out.println("Area of the circle: " + myCircle.getArea());
        System.out.println("Circumference of the circle: " + myCircle.getCircumference());

        System.out.println("\n--- Prime Number Checker ---");
        System.out.print("Enter an integer to check if it is prime: ");
        int number = scanner.nextInt();

        PrimeChecker checker = new PrimeChecker();

        if (checker.isPrime(number)) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is not a Prime number.");
        }

        scanner.close();
    }
}