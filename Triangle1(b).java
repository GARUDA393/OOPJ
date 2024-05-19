import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int side1, side2, side3;
        /* Input sides of a triangle */
        System.out.println("Enter three sides of the triangle: ");
        Scanner sc = new Scanner(System.in);
        side1 = sc.nextInt();
        side2 = sc.nextInt();
        side3 = sc.nextInt();

        /* If all sides are equal */
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral triangle.");
        }
        /* If any two sides are equal */
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles triangle.");
        }
        /* If no sides are equal */
        else {
            System.out.println("Scalene triangle.");
        }
    }
}