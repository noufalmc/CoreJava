import java.util.Scanner;
public class PrimeFactor {
    public  static void main(String[] args)
    {
        int NUM,PRIME;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        NUM=sc.nextInt();
        for (int i=2;i<=NUM;i++)
        {
            PRIME=0;
            for (int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    PRIME=1;
                    break;
                }
            }
            while (NUM%i==0)
            {
                System.out.println(" "+i);
                NUM=NUM/i;
            }

        }
    }
}
