import java.util.Scanner;
public class notas {
    public static void main(String[] args) {
        int n;
       try (Scanner keyboard = new Scanner(System.in)) {
        System.out.println("Enter a grade (0-10)");
        n = keyboard.nextInt();
        switch (n) {
            case 0,1,2,3 -> System.out.println("Fail");
            case 4,5 -> System.out.println("Insufficient");
            case 6,7 -> System.out.println("Regular");
            case 8,9 -> System.out.println("Excellent");
            case 10 -> System.out.println("Perfect");
            default -> System.out.println("Invalid grade");
         
        }
       }
    }
} 
