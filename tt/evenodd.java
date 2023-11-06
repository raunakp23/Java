import java.util.Scanner;

public class evenodd{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask the user to enter the lower and upper bound of the range
        System.out.println("Enter the lower bound of the range:");
        int lower = sc.nextInt();
        System.out.println("Enter the upper bound of the range:");
        int upper = sc.nextInt();

        // close the scanner object
        sc.close();

        // print the even and odd numbers in the range
        System.out.println("The even numbers in the range are:");
        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) { // check if i is divisible by 2
                System.out.print(i + " "); // print i with a space
            }
        }
        System.out.println(); // print a new line
        System.out.println("The odd numbers in the range are:");
        for (int i = lower; i <= upper; i++) {
            if (i % 2 != 0) { // check if i is not divisible by 2
                System.out.print(i + " "); // print i with a space
            }
        }
    }
}
