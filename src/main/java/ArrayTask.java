import java.util.Scanner;

public class ArrayTask {

   private Scanner scanner = new Scanner(System.in);
   int[]array;

   public void checkTheArray(){
       System.out.println("Enter the length of the array");
       int length = scanner.nextInt();
       array = new int[length];
       for (int i =0; i<length;i++){
           System.out.println("Enter the value");
           array[i]= scanner.nextInt();
       }
       for (int i = 0;i<array.length;i++){
           if (array[i]%3==0){
               System.out.println(array[i]);
           }
       }
   }
}
