import java.util.Scanner;

/*
@Author:Noufal MC
@Date:30/12/2021
Quadratic Equation
* */
import java.lang.Math;
public class Quadratic {
   static Scanner sc=new Scanner(System.in);
    public  static void main(String[] args)
    {

        System.out.println("Enter coefficients a, b and c:");
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();
        double Delta=(Math.pow(B,2)-4*A*C);
        if(Delta>0)
        {
            double X1=(-B+Math.sqrt(Delta))/(2*A);
            double X2=(-B-Math.sqrt(Delta))/(2*A);
            System.out.println("Root1= "+X1+" Root2= "+X2);
        }
    }
}
