package Shery;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int len = sc.nextInt();
        int wid = sc.nextInt();
        System.out.println("Area of Rectangle "+ (len * wid));
        System.out.println("Parameter of Rectangle "+ (2 *(len + wid)));
    }
}
