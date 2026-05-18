import java.util.Scanner;
public class ep29{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Ingrese un valor para X: ");
        int X = sc.nextInt();
        System.out.print("Ingrese un valor para Y: ");
        int Y = sc.nextInt();

        int Y1 = 3 * X + 5;
             if (Y == Y1) {
            System.out.printf("El punto (%d, %d) pertenece a la función Y = 3X + 5%n", X, Y);
            } else {
            System.out.printf("El punto (%d, %d) no pertenece a la función Y = 3X + 5%n", X, Y);
            }
        }
    }
}
