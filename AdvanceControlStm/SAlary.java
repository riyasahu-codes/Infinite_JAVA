package AdvanceControlStm;
import java.util.Scanner;
public class SAlary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char gender = sc.next().charAt(0);
        int year = sc.nextInt();
        char Qualification = sc.next().charAt(0);
        int salary = 0;
        if (gender == 'M') {
            if (year >= 10) {
                salary = (Qualification == 'P') ? 15000 : 1000;
            } else {
                salary = (Qualification == 'P') ? 10000 : 7000;
            }
        } else if (gender == 'F') {
            if (year >= 10) {
                salary = (Qualification == 'P') ? 12000 : 9000;
            } else {
                salary = (Qualification == 'P') ? 10000 : 6000;
            }
        }

        System.out.println(salary);
        sc.close();    // for closing Scanner object for a good prog.. practice.
    }
}
