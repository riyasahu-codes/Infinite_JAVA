// Sum of Even And Odd Seprately;
package ForLoopQues;
import java.util.Scanner;
public class EvenOddSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int EvenSum =0;
        int OddSum =0;
        for(int i = start; i<=end; i++){
            if(i%2==0){
                EvenSum +=i;
            }else{
                OddSum+=i;
            }

        }
        System.out.println(EvenSum);
        System.out.println(OddSum);
    }

}
