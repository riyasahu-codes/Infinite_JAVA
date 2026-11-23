package SwitchQue.java;
import java.util.Scanner;
public class AreaOfShape {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
         int a;
         int b;
         double calci = 0;
         switch(s){
             case "circle":{
                 a = sc.nextInt();
                 calci = Math.PI *a*a;
                 System.out.println(calci);
                 break;
             }
             case "rectangle":{
                 a = sc.nextInt();
                 b = sc.nextInt();
                 calci = a*b;
                 System.out.println(calci);
                 break;
             }
             case "triangle":{
                 a = sc.nextInt();
                 b = sc.nextInt();
                 calci = 0.5*a*b;
                 System.out.println(calci);
                 break;
             }
             default:{
                 System.out.println("Invalid Shape");
             }

         }
    }
}
