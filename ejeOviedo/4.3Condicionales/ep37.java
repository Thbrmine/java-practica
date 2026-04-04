import java.util.Scanner;
public class ep37 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Se calcula el costo de un vuelo ida y vuelta");

            System.out.println("Ingrese la distancia a recorrer en avión (en kilómetros): ");
            double distancia = sc.nextDouble();

            sc.nextLine();

            System.out.print("Ingrese el número de días de estancia:");
            int diasEstancia = sc.nextInt();

            double precioKm = 89.50;

            double costoVuelo = (distancia*2 )* precioKm;

            if (distancia > 1000 && diasEstancia > 7) {
                double descuento = 0.30;
                costoVuelo *= (1 - descuento);
            }
            System.out.printf("El costo total del vuelo es: $%,.2f%n", costoVuelo);
        }
        
    }
}
