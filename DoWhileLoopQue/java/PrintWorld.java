package DoWhileLoopQue.java;
import java.util.Scanner;
public class PrintWorld {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n=sc.nextInt();
            if(n==1)System.out.println("World");
        }while(n==1);

    }
}
