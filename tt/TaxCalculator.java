import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       double salary, tax;
        System.out.println("enter the salary");
       salary=sc.nextInt();
        if (salary < 10000) {
            tax = 0;
        }
            else
            {
               if(salary<20000){
                tax=salary*0.1;
               }
               else{
                if(salary<30000)
                {
                    tax=salary*0.15;
                }
                else
                {
                   tax=salary*0.25; 
                }

               }

            }

            System.out.println("tax is:"+tax);
            sc.close();
        }
    }


