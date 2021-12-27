import java.util.Scanner;
public class QuotientReminder {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int NUM=sc.nextInt();
        System.out.println("Which number to be want divide?");
        int DIV=sc.nextInt();
        System.out.println("Quotient ="+NUM/DIV);
        System.out.println("Reminder ="+NUM%DIV);
    }
}
