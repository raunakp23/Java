import java.util.Scanner;

public class Weakday {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("1.monday");
     System.out.println("2.tuesday");  
     System.out.println("3.wednesday");
     System.out.println("4.thirsday");
      System.out.println("5.firday");
      System.out.println("6.sataurday");
     System.out.println("7.sunday");
   System.out.println("enter the above option");
    int choise=sc.nextInt();
    switch(choise){
       case 1:
       System.out.println("weekday");
       break;
       case 2:
       System.out.println("weekday");
       break;
       case 3:
       System.out.println("weekday");
       break;
       
     case 4:
       System.out.println("weekday");
       break;
       case 5:
       System.out.println("weekday");
       break;
       
case 6:
       System.out.println("weekend");
       break;
       
case 7:
       System.out.println("weekend");
       break;
       default:{
        System.out.println("invalid input");
       }


    }

    sc.close();

    }
}
