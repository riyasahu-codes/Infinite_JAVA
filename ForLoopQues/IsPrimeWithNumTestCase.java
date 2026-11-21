package ForLoopQues;
import java.util.Scanner;
public class IsPrimeWithNumTestCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=1;i<=T;i++) {
            int n = sc.nextInt();

            if(n<=1)System.out.println("Not Prime");
           else if(n==2)System.out.println(" Prime");
           else if(n%2==0)System.out.println("Not Prime");
           else {
                boolean IsPrime = true;
                for (int j = 3; j * j <= n; j += 2) {
                    if (n % i == 0) {
                        IsPrime = false;
                        break;
                    }
                }
                System.out.println((IsPrime) ? "Prime" : "Not Prime");
            }
        }
    }
}
