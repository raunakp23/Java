import java.util.Scanner;

public class TrafficSignal {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a traffic signal color (red, yellow, green):");
        String color = scanner.nextLine();
        
        switch (color.toLowerCase()) {
            case "red":
                System.out.println("Stop!");
                break;
            case "yellow":
                System.out.println("Prepare to stop.");
                break;
            case "green":
                System.out.println("Go!");
                break;
            default:
                System.out.println("Invalid color entered.");
        }
        
        scanner.close();
    }
}






    
    

