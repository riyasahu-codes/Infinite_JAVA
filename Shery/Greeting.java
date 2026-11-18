package Shery;
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if (a==77 || a==109){
            System.out.println("Hello Sir");
        }
        else if(a==70 || a==102){
            System.out.println("Hello Ma'am");
        }
        else{
            System.out.println("Hello Guest");
        }
    }
}
