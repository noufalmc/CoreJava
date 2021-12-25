
import java.util.*;
public class PowerN {
    public  static void main(String[] args)
    {
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit");
        N=sc.nextInt();
        int POW=1;
        if(N<31)
        {
            for (int i=1;i<=N;i++)
            {
                POW=POW*2;
                System.out.println("2^"+i+" = "+POW);
            }
        }
        else
        {
            System.out.println("Limit Should Be Lessthan 31");
        }

    }
}
