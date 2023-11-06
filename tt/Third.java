import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the student name");
     String name= sc.nextLine();
     System.out.println("enter your class");
  
      int a= sc.nextInt();
      System.out.println("enter your physics marks");
     int phy=sc.nextInt();
     System.out.println("enter your boilogy marks");
     int bio=sc.nextInt();
     System.out.println("enter your chemistry marks");
      int chem=sc.nextInt();
      System.out.println("enter yoyr math marks");

        int math=sc.nextInt();
        System.out.println("enter your english marks");
      int english=sc.nextInt();
      float aveg=(phy+bio+chem+math+english)/5;
      float persentage=(phy+bio+chem+math+english)*100/500;
      System.out.println(aveg);
      System.out.println(persentage);
      System.out.println("physics marks"+phy);
      System.out.println("bio marks"+bio);
      System.out.println("chemistry marks"+chem);
      System.out.println("math marks"+math);
      System.out.println("english marks"+english);
      
      sc.close();




    }
}
