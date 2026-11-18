package ForLoopQues;
import java.sql.SQLOutput;
import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        int n = sc.nextInt();
        if(n%2==0){
            isPrime=false;
        }

        else {
            for (int i = 3; i * i <= n; i += 2) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Prime");
        }
        else{
            System.out.println(" Not Prime");
        }
    }
}
