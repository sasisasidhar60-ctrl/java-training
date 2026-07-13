package day_2;
import java.util.*;
public class pass_or_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        if (a > 50) {
            System.out.println("pass");

        } else {
            System.out.println("fail");
        }
    }
}