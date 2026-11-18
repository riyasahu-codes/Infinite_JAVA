package ForLoopQues;
import java.util.Scanner;
public class swapNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        if(start>end){
            int temp = end;
            end =start;
            start =temp;
        }
        System.out.println(start);
        System.out.println(end);

    }
}
