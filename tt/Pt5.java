public class Pt5 {
    public static void main(String[] args) {
        int size = 10;
         for(int i =1 ; i < size; i++){
            for (int j = 1; j < size-2; j++){
                if(i ==(size-1)/2 || j == (size-1)/2){
                    System.out.print("+ ");
                } 
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();   
        }
    }
    
}
