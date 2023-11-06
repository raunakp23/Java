import java.util.Scanner;

public class Greastest {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int p=(a>b)?a:b;
    int q=(p>c)?p:c;
    System.out.println(q);
    sc.close();
  }  
}
 