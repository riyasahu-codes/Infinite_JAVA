package Shery;

import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        double R = sc.nextDouble();
        int T = sc.nextInt();
        int n = sc.nextInt();
        double A = P * Math.pow((1 + R / n), (n * T));
        double CI = (A - P);
        System.out.printf("%.2f", CI);

    }
}
