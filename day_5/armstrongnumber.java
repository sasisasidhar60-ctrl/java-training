package day_5;

import javax.swing.*;
import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number;");
        int a = sc.nextInt();
        int arg=a;
        int sum=0;
        while(a!=0)
        {
            int pop = a%10;
            sum+=pop*pop*pop;
            a/=10;
        }
        if(sum==arg)
        {
            System.out.print("Armstrong number");
        }
        else
        {
            System.out.println("Not a Armstrong");
        }
    }
}
