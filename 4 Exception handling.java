public class Predefined_Exception_Eg {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 0, x, y;
        // code that may raise exception
        try {
            x = a / (b - c);
        } catch (ArithmeticException e) {
            System.out.println("Divide BY ZERO\n" + e);
        }
        // rest code of the program
        y = (a / b + c);
        System.out.println("y=" + y);
    }
}