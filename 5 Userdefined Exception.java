class InvalidAgeException extends Exception {
    private int input;

    InvalidAgeException(int a) {
        input = a;
    }

    public String toString() {
        return "InvalidAgeException[" + input + "]";
    }
}

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        try {
            int age = 12; // int age = 21;
            if (age < 18)
                throw new InvalidAgeException(age);
            System.out.println("No Exception Occurred!\n Welcome To Vote Years=" + age);
        } catch (InvalidAgeException ex) {
            System.out.println("Exception Occurred & Caught\n" + ex);
        }
    }
}