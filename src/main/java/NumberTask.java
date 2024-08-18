import java.util.Scanner;

public class NumberTask {

    private final Scanner scanner = new Scanner(System.in);

    public void checkTheNumber(){
        System.out.println("Enter the number");
        int a = scanner.nextInt();
        if (a >7){
            System.out.println("Hello");
        }
    }
}
