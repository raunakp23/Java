import java.util.Scanner;

public class print {
    public static boolean is4Armstrong(int n) {
        int temp = n; 
        int digits = 0; 
        int sum = 0; 

        
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n; 
        while (temp > 0) {
            int digit = temp % 10; 
            sum += Math.pow(digit, digits); 
            temp /= 10; 
        }

        return sum == n; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int num = sc.nextInt(); 
        sc.close(); 

        if (isArmstrong(num)) { 
            System.out.println(num + " is an Armstrong number."); 
        } else {
            System.out.println(num + " is not an Armstrong number."); 
        }
    }
}
