package day_3;
import java.util.*;
public class ternarly_statement {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a= sc.nextInt();
        System.out.println((a % 2 == 0) ? "EVEN" : "ODD");
    }
}
