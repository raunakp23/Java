public class Switch {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        final int PIZZA = 1;
        final int BURGER = 2;
        final int DRINKS = 3;
        
        System.out.println("Enter the 1 for pizza");
        System.out.println("Enter the 1 for burger");
        System.out.println("Enter the 1 for drinks");

        int choice = scan.nextInt();

        switch (choice) {
  case 1:
    System.out.println("Enter the 1 for pizza"); 
    break;
  case 2:
    System.out.println("Enter the 1 for burger");
    break;

case 3:
    System.out.println("Enter the 1 for drinks");
    break;
  default:
    // code block for default case
    // this is optional and executed when no case matches
}

    }
}