import java.util.Scanner;
class diaSem {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {

        System.out.println("Ingrese un día de la semana:");
        String diaSemana= keyboard.nextLine();

        String tipoDia = switch (diaSemana.toLowerCase()) {
            case "lunes" -> "Inicio de semana";
            case "martes", "miercoles", "jueves" -> "Mediados de semana";
            case "viernes" -> "Inicio de fin de semana";
            case "sabado", "domingo" -> "Fin de semana";
            default -> {
                System.out.println("Invalid day");
                yield "";
            }
        };
        System.out.println(diaSemana + " es " + tipoDia);
        }
    }
}