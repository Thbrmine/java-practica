import java.util.Scanner;

public class ep60 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String continuar;

            do {
                System.out.println(" Registro de Empleado ");
                
                System.out.print("Código: "); String codigo = sc.next();
                System.out.print("Nombres: "); sc.nextLine(); 
                String nombres = sc.nextLine();
                System.out.print("Número de hijos: "); int hijos = sc.nextInt();
                System.out.print("Salario por hora: "); double valorHora = sc.nextDouble();
                System.out.print("Horas trabajadas al mes: "); int horas = sc.nextInt();

                // 1. Calcular Devengado
                double devengado = valorHora * horas;

                // 2. Calcular Porcentaje de Retención
                double porcentajeRetencion = 0;
                if (devengado < 300000) {
                    if (hijos <= 6) {
                        porcentajeRetencion = (6.0 - hijos) / 2.0;
                    }
                } else { 
                    if (hijos < 3) {
                        porcentajeRetencion = 3.0;
                    } else {
                        porcentajeRetencion = 10.0 / hijos;
                    }
                }

                // 3. Calcular montos finales
                double montoRetencion = devengado * (porcentajeRetencion / 100.0);
                double subsidio = hijos * 1200.0;
                double totalAPagar = devengado - montoRetencion + subsidio;

                // 4. Mostrar Resultados
                System.out.println(" Volante de Pago ");
                System.out.printf("Código: %s | Nombre: %s%n", codigo, nombres);
                System.out.printf("Devengado: $%.2f%n", devengado);
                System.out.printf("Retención (%.2f%%): $%.2f%n", porcentajeRetencion, montoRetencion);
                System.out.printf("Subsidio por hijos: $%.2f%n", subsidio);
                System.out.printf("TOTAL A PAGAR: $%.2f%n", totalAPagar);

                System.out.print("\n¿Desea ingresar otro empleado? (s/n): ");
                continuar = sc.next();

            } while (continuar.equalsIgnoreCase("s"));

            System.out.println("Programa finalizado.");
         }
    }
}