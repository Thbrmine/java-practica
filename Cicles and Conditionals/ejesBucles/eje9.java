import java.util.Scanner;
class eje9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        String password = "admin123";
        String tryPassword = "*";

        while (!password.equals(tryPassword)) {
            System.out.print("Introduce la contraseña: ");
            tryPassword = sc.nextLine();
            if (!password.equals(tryPassword)) {
                System.out.println("Contraseña incorrecta. Inténtalo de nuevo.");
            }
        }
        System.out.println("Acceso concedido.");
        }
    }
}