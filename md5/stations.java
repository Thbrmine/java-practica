import java.util.Scanner;

class stations {
    public static void main(String[] args) {
        try (Scanner numeroMes = new Scanner(System.in)) {

        System.out.print("Ingrese el número del mes: ");
        int mesNum = numeroMes.nextInt();

        // rule switch for season
        String estacion = switch (mesNum) {
            case 12, 1, 2   -> "Invierno";
            case 3, 4, 5    -> "Primavera";
            case 6, 7, 8    -> "Verano";
            case 9, 10, 11  -> "Otoño";
            default -> {
                System.out.println("Número de mes inválido");
                yield "";            // yield an empty string to signal error
            }
        };

        // separate rule switch for month name instead of an if‑chain
        String mes = switch (mesNum) {
            case 1  -> "Enero";
            case 2  -> "Febrero";
            case 3  -> "Marzo";
            case 4  -> "Abril";
            case 5  -> "Mayo";
            case 6  -> "Junio";
            case 7  -> "Julio";
            case 8  -> "Agosto";
            case 9  -> "Septiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            case 12 -> "Diciembre";
            default -> "";          // already handled above
        };

        if (!mes.isEmpty()) {          // only print when input was valid
            System.out.printf("Mes: %s%nEstación: %s%n", mes, estacion);
        }
        }
    }
}
