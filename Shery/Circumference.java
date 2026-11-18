package Shery;
import java.util.Scanner;
public class Circumference {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextFloat();
        double Area = Math.PI*r*r;
        double Cir = 2*Math.PI*r;
        System.out.printf("%.2f %n" , Area);
        System.out.println(Cir);
    }
}
