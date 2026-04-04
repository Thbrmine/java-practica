import java.util.Scanner;
public class ep31{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Ingrese un valor para A: ");
        int A = sc.nextInt();
        System.out.print("Ingrese un valor para B: ");
        int B = sc.nextInt();

        if (B <= ((2 * A )- 2 ) && B >= (A + 1) && A <= 20) {
            System.out.println("El punto esta dentro del área");
            } else {
            System.out.println("El punto no esta dentro del área");
            }
        }
    }
}
