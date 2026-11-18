package Shery;
import java.util.Scanner;
public class AreaSphere {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double Area = 4*Math.PI*r*r;
        System.out.println(Area);
    }
}
