package ForLoopQues;
import java.util.Scanner;
public class CountNuWithXDivisor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int count =0;
        for(int i =1;i<=n;i++){
            int divCount = 0;
            for(int j=1;j<=i;j++) {
                if (i % j == 0) {
                    divCount++;
                }
            }
                if(divCount==x) {
                    count++;

                }  }
        System.out.print(count);
    }}

