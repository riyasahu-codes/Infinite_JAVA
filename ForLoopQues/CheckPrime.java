package ForLoopQues;
import java.util.Scanner;
class CheckPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        else if (n == 2) return true;
        else if (n % 2 == 0) return false;
        else {
            for (int i = 3; i * i <= n; i += 2) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }}
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for(int i=1;i<=T;i++){
                int n = sc.nextInt();
                System.out.println(isPrime(n)?"Prime":"Not Prime");


        }
    }

}
