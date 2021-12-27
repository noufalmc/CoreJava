import  java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int NUM=sc.nextInt();
        if(NUM%2==0)
        {
            System.out.println(NUM+" Is Even");
        }
        else
        {
            System.out.println(NUM+" Is Odd");
        }
    }
}
