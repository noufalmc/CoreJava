/*
@AUTHOR:NOUFAL MC
@DATE:30/12/2021
Sum Of Three Integer Adds To ZERO
* */
import java.io.*;
import  java.util.Scanner;
public class SumofThree {
    public static void main(String[] args)
    {
        //Creates the Scanner object
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  length");
        int m=sc.nextInt();
        //Array Decleration
        int [] arr=new int[m];
        for (int i=0;i<m;i++)
        {

                arr[i]=sc.nextInt();

        }
        for (int i=0;i<m;i++)
        {
            for (int j=i+1;j<m;j++)
            {
                for (int k=j+1;k<m;k++)
                {
                    int sum=arr[i]+arr[j]+arr[k];
                    System.out.println(sum);
                    if(sum==0)
                    {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+"=0");
                    }
                }
            }
        }
    }
}
