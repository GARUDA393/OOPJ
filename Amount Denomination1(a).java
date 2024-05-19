import java.util.Scanner;

public class amount_denomination {
    public static void main(String[] args) {
        int amount;
        int note2000, note500, note200, note100, note50, note20, note10, note5, note2, note1;


        note2000 = note500 = note200 = note100 = note50 = note20 = note10 = note5 = note2 = note1 = 0;

        System.out.print("Enter amount: ");
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();

        if (amount >= 2000) {
            note2000 = amount / 2000;
            amount -= note2000 * 2000;
        }
        if (amount >= 500) {
            note500 = amount / 500;
            amount -= note500 * 500;
        }
        if (amount >= 200) {
            note200 = amount / 200;
            amount -= note200 * 200;
        }
        if (amount >= 100) {
            note100 = amount / 100;
            amount -= note100 * 100;
        }
        if (amount >= 50) {
            note50 = amount / 50;
            amount -= note50 * 50;
        }
        if (amount >= 20) {
            note20 = amount / 20;
            amount -= note20 * 20;
        }
        if (amount >= 10) {
            note10 = amount / 10;
            amount -= note10 * 10;
        }
        if (amount >= 5) {
            note5 = amount / 5;
            amount -= note5 * 5;
        }
        if (amount >= 2) {
            note2 = amount / 2;
            amount -= note2 * 2;
        }
        if (amount >= 1) {
            note1 = amount;
        }

        System.out.println("Total number of notes:");
        System.out.println("2000 = " + note2000);
        System.out.println("500 = " + note500);
        System.out.println("200 = " + note200);
        System.out.println("100 = " + note100);
        System.out.println("50 = " + note50);
        System.out.println("20 = " + note20);
        System.out.println("10 = " + note10);
        System.out.println("5 = " + note5);
        System.out.println("2 = " + note2);
        System.out.println("1 = " + note1);
    }
}