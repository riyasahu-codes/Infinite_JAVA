package WhileLoopQues;
import java.util.Scanner;
public class ISBNnum10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long temp = n;
        int count = 0;
        long sum =0;
       while(n!=0){
               count++;
               n/=10;
           }
       if(count==10) {
           int j = 10;
           while (temp != 0) {
               sum = sum + ((temp % 10) * j);
               temp /= 10;
           }
           if (sum % 11 == 0) {
               System.out.println("True");
           } else System.out.println("False");
       } else{
           System.out.println("False");
       }



    }
}
