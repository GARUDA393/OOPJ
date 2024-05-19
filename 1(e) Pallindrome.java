import java.util.Scanner;

public class pal
 {
   public static void main (String[]args)
   {
     int num, reverse = 0, rem, temp;
     System.out.println("Enter a number: ");
     Scanner obj=new Scanner(System.in);
     num=obj.nextInt();
       temp = num;

     while (temp != 0)
       {
        rem = temp % 10;
        reverse = reverse * 10 + rem;
        temp /= 10;
       };
     if (num == reverse)
       System.out.println (num + " is Palindrome");
     else
       System.out.println (num + " is not Palindrome");
   }
 }