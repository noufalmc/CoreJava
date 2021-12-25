import java.util.Scanner;

public class LeapYear {
    public static void  main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year");
        int YEAR=sc.nextInt();
        if(YEAR%400==0)
        {
            System.out.println(YEAR+" Is LEAP YEAR ");
        }
        else if(YEAR%100!=0 && YEAR%4==0)
        {
            System.out.println(YEAR+"YEAR Is LEAP YEAR ");
        }
        else
        {
            System.out.println(YEAR+" IS NOT LEAP YEAR ");
        }
    }
}
