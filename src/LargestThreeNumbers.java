import java.util.Scanner;
public class LargestThreeNumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int MAX=a;
        if(MAX<b)
        {
            MAX=b;
        }
        if(MAX<c)
        {
            MAX=c;
        }
        System.out.println("Largest Number is "+MAX);
    }
}
