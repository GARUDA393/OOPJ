import java.util.Scanner;

public class SquareRoot {
    public static double computeSqrt(int number) {
        double temp;
        double sr = number / 2;
        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        } while (Math.abs(temp - sr) > 0.00001);
        return sr;
    }

    public static void main(String[] args) {
        System.out.print("Enter a positive number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Square root of " + num + " is " + computeSqrt(num));
    }
}