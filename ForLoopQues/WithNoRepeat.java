package ForLoopQues;
import java.util.Scanner;
public class WithNoRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                boolean IsPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        IsPrime = false;
                        break;
                    }
                }
                    if (IsPrime) {
                        System.out.print(i + " ");

                }
            }
        }
    }
}
