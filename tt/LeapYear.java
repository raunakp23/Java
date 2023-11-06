        // Leap Year Program
//1.Centuy (100%=0 and 400%=0)
// 2.yearly(100%!=0 and 4%=0) 

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int y = sc.nextInt();
        if (y % 100 == 0 && y % 400 == 0 || y % 100 != 0 && y % 4 == 0) {
            System.out.println("this year is leap year");
        } else {
            System.out.println("this is not leap year");
        }
        sc.close();

    }

}
