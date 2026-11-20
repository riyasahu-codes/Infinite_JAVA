package ForLoopQues;
import java.util.Scanner;
public class PRimeFActors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       for(int i =2;i<=Math.sqrt(n);i++){
           while(n%i==0){
               System.out.print(i+" ");
               n=n/i;
           }}
      if(n>1){
          System.out.println(n);

       }
    }
}
