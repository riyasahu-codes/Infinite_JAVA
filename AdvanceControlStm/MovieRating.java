package AdvanceControlStm;
import java.util.Scanner;
public class MovieRating {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float rating = sc.nextFloat();
        if(rating>=0.0 && rating<=2.0){
            System.out.println("Flop");
        }else if(rating>=2.1 && rating<=3.4){
            System.out.println("Semi-Hit");
        }
        else if(rating>=3.5 && rating<=4.5){
            System.out.println("Hit");
        }
        else if(rating>=4.6 && rating<=5.0){
            System.out.println("SuperHit");
        }
        else{
            System.out.println("Invalid Rating");
        }
    }
}
