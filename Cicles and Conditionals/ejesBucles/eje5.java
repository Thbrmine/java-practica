import java.util.Scanner;
class eje5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        
        System.out.println("Ingrese la cantidad a invertir $$: ");
        double num = sc.nextDouble();

        System.out.println("Ingrese el interés anual (en %): ");
        double interest = sc.nextDouble();

        System.out.println("Ingrese el periodo de inversión (en años): ");
        int years = sc.nextInt();

        System.out.println("Proyección capital invertido:");

        for (int i = 1; i <= years; i++) {
            num = num * (1 + interest / 100);
        System.out.printf("Año %d: Capital acumulado: %.2f\n", i, num);
        }
        }
    }
}