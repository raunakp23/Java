import java.util.Scanner;

public class AtmMachin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Balance=20000,Deposite,Withdraw,num;
        while(true){
        System.out.println("Welcome to atm machine");
        System.out.println("1.Withdraw");
        System.out.println("2.Deposite");
        System.out.println("3.Check Balance");
        System.out.println("4.exit");
        System.out.println("enter above option");
        num=sc.nextInt();
        switch(num){
        case 1:
          System.out.println("enter the amount to be Withdraw");
          Withdraw=sc.nextInt();
          if(Balance>=Withdraw){
          Balance=Balance-Withdraw;
          System.out.println("balance amount is"+Balance);
          System.out.println("please collcet money");
          }
         else{
            System.out.println("you have dont have enough amount");
           }
           System.out.println("");
           break;
           case 2:
            System.out.println("enter the amount to be deposite");
            Deposite=sc.nextInt();
            Balance=Deposite+Balance;
            System.out.println("balance amount is:"+Balance);
            System.out.println("your amount will be successful deposite ");
            System.out.println("");
            break;
            case 3:
            System.out.println("ypur amount is:"+Balance);
             System.out.println("");
             break;
             case 4:
             System.exit(0);
             break;
             default:
             System.out.println("please enter above option");

        } 








       sc.close();
        }
        
    }
}
