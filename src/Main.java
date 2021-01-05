import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter side 1: ");
        double side1 = input.nextDouble();
        System.out.println("Enter side 2: ");
        double side2 = input.nextDouble();
        System.out.println("Enter side 3: ");
        double side3 = input.nextDouble();
        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("Đây là tam giác");
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
