        //  Vowel and Consonent program
//Vowel--------->a,e,i,o,u
//2.Except a,i,o,u-------->Consonent  
import java.util.*;
public class VowelCons {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the character");
       char ch= sc.next().charAt(0);
       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
          System.out.println("this  character is vowel ");
       }
       else{
        System.out.println("this character is consonent");
       }
        sc.close();
    }

}
