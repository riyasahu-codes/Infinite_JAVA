package Shery;
import java.util.Scanner;
public class ValidVoter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age:");
        int age = sc.nextInt();
        System.out.println("Enter the voter name");
        sc.nextLine();
        String name = sc.nextLine();
        if(age < 0){
            System.out.println("Invalid Age");
        }
       else if(age >= 18){
            System.out.println(name + " is a valid Voter");
        }else{
            System.out.println(name+ " is not a valid voter");
        }
    }
}
