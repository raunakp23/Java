import java.util.Scanner;

public class RectangleArea {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the height of the rectangle");
    int height= sc.nextInt();
    System.out.println("enter the width of the rectangle");
    int width=sc.nextInt();
    int result=height*width;
    System.out.println("enter the radious of the circle");
    float r=sc.nextInt();
    float circle=(3.14f*r*r);
    System.out.println("the area of rectangle is"+result);
    System.out.println("area of circle is:"+circle);

     sc.close();
   } 
}
