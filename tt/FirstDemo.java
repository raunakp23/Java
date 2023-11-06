import java.util.Scanner;

public class FirstDemo {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length of the rectangle");
   int a= sc.nextInt();
   System.out.println("enter the breath of the rectangle");
   int b=sc.nextInt();
   int area=a*b;
   System.out.println("area of then rectangle"+area);



    sc.close();
   } 
}
