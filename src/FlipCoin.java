
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.lang.*;
public class FlipCoin
{
   public static void  main(String[] args)
   {
       int LIMIT;
       double COIN;
       Scanner sc=new Scanner(System.in);
       Random  ra=new Random();
       System.out.println("No of Times to be want");
       LIMIT=sc.nextInt();
       int TAIL=0;
       int HEAD=0;
       if(LIMIT<0)
       {
           System.out.println("LIMIT Should Be Greater Than 0 ");
       }
       for(int i=0;i<LIMIT;++i)
       {
            COIN=ra.nextDouble(1);
            if(COIN>0.5)
            {
                ++TAIL;
            }
            else
            {
                ++HEAD;
            }

       }
       double HEAD_PERCENTAGE = HEAD /(double)
               LIMIT*100;
       double TAIL_PERCENTAGE=((TAIL/(double)LIMIT)*100);
       System.out.println("NO Of Head VS Tail "+HEAD+' '+TAIL);
       System.out.println("PERCENTAGE Of Head VS Tail"+Math.round(HEAD_PERCENTAGE)+' '+Math.round(TAIL_PERCENTAGE));

   }
}
