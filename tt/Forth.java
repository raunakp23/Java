import java.util.Scanner;

public class Forth {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the celcious");
      float c = sc.nextInt();
      float f = (c * 9) / 5 + 32;
      System.out.println(f);

      sc.close();

   }
}
