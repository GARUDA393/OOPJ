import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        boolean isVowel = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                isVowel = true;
                break;
        }
        if (isVowel) {
            System.out.println(ch + " is a vowel");
        } else {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                System.out.println(ch + " is a Consonant");
            } else {
                System.out.println("Input is not an alphabet");
            }
        }
    }
}