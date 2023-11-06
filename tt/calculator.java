import java.util.Scanner;

public class calculator {
    public static void main(String[] args)
     {
        Scanner  x = new Scanner (System.in);
        System.out.println("Enter the value ");
        int a =x.nextInt();
        int b =x.nextInt();

        System.out.println("enter the operator");
        char operator=x.next().charAt(0);


        switch (operator) {
            case '+':
                System.out.println("sum: " +(a+b));
                break;
            case '-':
                System.out.println("Min: " +(a-b) );
                break;
                case '/':
                System.out.println("div:"+(a/b) );
                break;
                case '*':
                System.out.println("mul:"+(a*b));
                break;
                default:
                System.out.println("my calculator is not addvance");

    }
    x.close();
}
}

