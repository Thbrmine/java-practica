import java.util.Scanner;
public class sem {
    public static void main(String[] args) {
        int n;
      try (Scanner keyboard = new Scanner(System.in)) {
        System.out.println("Enter day of the week (1-7): ");
        n = keyboard.nextInt();
        switch (n) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day of the week");
        }
      }
    }
}   