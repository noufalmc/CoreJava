import  java.util.Scanner;
public class HarmonicNumber
{
    public  static void main(String[] args)
    {
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Limit");
        N=sc.nextInt();
        double HARMONIC=0;
        if(N>0)
        {
            for (int i=1;i<=N;i++)
            {
            HARMONIC=HARMONIC+(1/(double)i);
            }
            System.out.println("Harmonic Value Is = "+HARMONIC);
        }
        else
        {
            System.out.println("The Limit Should Be Greater Than 0");
        }

    }
}
