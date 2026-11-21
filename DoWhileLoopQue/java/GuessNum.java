package DoWhileLoopQue.java;
import java.util.Scanner;
public class GuessNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //rang of the iterration  //10
        int picknum = sc.nextInt();  //6
        int low = 1;
        int high = n;
        int mid ;
        int ans = -1;  // we can use 0 insted if -1(it show the num is not found)
        do{
            mid = (low+high)/2; // find the mid of num(5)(6)
            if(mid==picknum){     //no(6==6)
                ans = mid;        //ans = 6
                break;
            }
            if(mid<picknum){  //5<6
                low = mid+1;  //5+1=6
            }
            else{
                high = mid-1;
            }
        }while(low<=high);
        System.out.println(ans);

    }
}
