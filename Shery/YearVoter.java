package Shery;
import java.util.Scanner;
public class YearVoter {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Name:");
        String name = sc.nextLine();
        if(age < 0){
            System.out.println("Invalid Age.");
        }
        else if(age >= 18){
            System.out.println(name + " is a valid voter.");
        }
        else{
            int X = 18-age;
            if(X==1){
                System.out.println(name +" is not elegible."+name+" will be elegible in "+X+" Year.");
            }
            else{
                System.out.println(name+" is not elegible."+name+" will be elegible in "+X+" Years.");
            }
        }

    }
}
