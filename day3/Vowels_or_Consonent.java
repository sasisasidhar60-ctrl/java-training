package day_3;

import java.util.Scanner;

public class Vowels_or_Consonent {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number b/w 65-90 and 97-122:");
        int a = sc.nextInt();
        int b = (char)a;
        switch (a)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
               System.out.println("vowels:");
               break;
            default:
                System.out.println("Consonent");
        }
    }
    }