import java.util.Scanner;
class eje8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese la altura del triángulo: ");
            int height = sc.nextInt();

        System.out.println("Triángulo de números impares:");
        for (int i = 1; i <= (height*2)-1; i+=2) {
            for (int j = i; j >= 1; j-= 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        }
    }
}