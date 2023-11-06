import java.util.*;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Fahrenheit");
        System.out.println("2.Celsious");
        System.out.println("enter the above option");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("enter the celcious");
                int c = sc.nextInt();
               float fe=((9/5)*c+32);

                System.out.println("In celcious is"+fe );
                break;
            case 2:
                System.out.println("enter the fahrenheit");
                float f = sc.nextInt();
            
                float ce=((f-32)*5/9);


        

                System.out.println("In fahrenheite is"+ce);
                break;
        }
        sc.close();

    }
}
