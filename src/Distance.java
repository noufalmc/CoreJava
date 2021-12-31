import java.util.Scanner;

/*
@Author:Noufal MC
@Date:30/12/2021
Eucliden Distance Formula
* */
import java.lang.Math;
public class Distance {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The X and Y Coordinates");
        int X=sc.nextInt();
        int Y=sc.nextInt();
        double Distance=(Math.sqrt((Math.pow(X,2)+Math.pow(Y,2))));
        System.out.println("Eucliden Distance is "+Distance);
    }
}
