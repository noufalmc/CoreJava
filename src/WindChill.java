import java.util.Scanner;
import java.lang.Math;
public class WindChill {
    public static void main(String[] args)
    {
        double t,v;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Temperature In farenheat and Wind Speed");
        t=sc.nextDouble();
        v=sc.nextDouble();
        if(t>50 || v>120 || v<3)
        {

            System.out.println("The Values is not Valid");
        }
        else
        {
            double w=(35.74+0.62158*t+(.4275*t-35.75)*Math.pow(v,0.16));
            System.out.println("The Wind Chill is "+w);
        }
    }
}
