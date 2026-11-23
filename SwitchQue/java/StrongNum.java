package SwitchQue.java;
import java.util.Scanner;
public class StrongNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum =0;
        while(n!=0){
            int dig = n%10;
            n/=10;
            int fac = 1;
            for(int j=1;j<=dig;j++){
                fac *=j;
            }
            sum+=fac;
        }
       if(sum==temp){
           System.out.println("Strong Num");
       }else{
           System.out.println("Not Strong");
       }
    }
}
