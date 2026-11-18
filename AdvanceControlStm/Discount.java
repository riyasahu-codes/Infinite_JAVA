package AdvanceControlStm;
import java.util.Scanner;
public class Discount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int IntAmt = sc.nextInt();
        int dis = 0;
        if(IntAmt>=0 && IntAmt<=5000){
            dis=0;
        }
        else if(IntAmt>=5001 && IntAmt<=7000){
            dis=5;
        }
        else if(IntAmt>=7001 && IntAmt<=9000){
            dis = 10;
        }
        else if(IntAmt>9000){
            dis=20;
        }
        double DisAmt = (IntAmt*dis)/100;
        System.out.println((int) (IntAmt - DisAmt));

    }
}
