package ForLoopQues;
import java.util.Scanner;
public class ISPrimeOPTM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("Not Prime");
        }
       else if(n==2) {
           System.out.println("Not Prime");
        }
        else if(n%2==0){
            System.out.println("Not Prime");
        }
        else{
            boolean IsPrime = true;

            for(int i=3; i<=Math.sqrt(n);i+=2) {
                if (n % i == 0)
                    IsPrime = false;
            }
            System.out.println(IsPrime?"Prime":"Not Prime");
        }

}}
