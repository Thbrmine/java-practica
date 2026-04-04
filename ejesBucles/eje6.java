import java.util.Scanner;
class eje6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Ingrese la altura del triángulo: ");
        int height = sc.nextInt();

        System.out.println("Triángulo de asteriscos:");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }
}