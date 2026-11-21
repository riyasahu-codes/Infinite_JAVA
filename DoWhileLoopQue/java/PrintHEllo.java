package DoWhileLoopQue.java;
import java.util.Scanner;
public class PrintHEllo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("HEllo");
            n = sc.nextInt();
        }while(n==1);

    }
}
