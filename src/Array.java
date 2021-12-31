import java.io.*;
import  java.util.Scanner;
public class Array{

    public static void main(String[] args)
    {
        //Declare the Array

        //call the scanner class
        Scanner sc=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        System.out.println("enter the rows length");
        int m=sc.nextInt();
        System.out.println("enter the columns length");
        int n= sc.nextInt();
        int [][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    pw.flush();
    }
}

