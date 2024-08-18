import java.util.Scanner;

public class NameTask {

   private final Scanner scanner = new Scanner(System.in);

    public void checkTheName(){
       System.out.println("Enter the name");
        String name = scanner.nextLine();
       if (name.equals("John")){
           System.out.println("Hello, John");
       } else {
           System.out.println("There is no such name");
       }
   }

}
