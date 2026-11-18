package AdvanceControlStm;
import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Units = sc.nextInt();
        float amount = 0;
        //Suppose units is 650
        if (Units > 400) {
            amount += (Units - 400) * 13;  //250 is used(650-400==250)
            Units = 400;
        }
        if (Units >= 2001 && Units <= 400) {
            amount += (Units - 200) * 8;  //200 used(400-200=200)
            Units = 200;
        }
        if (Units >= 101 && Units <= 200) {
            amount += (Units - 100) * 6;  //100 is used
            Units = 100;
        }
        amount += Units * 4.2;   //left unit is calculated
        System.out.println("Total Amt is: " + amount);
    }
}
