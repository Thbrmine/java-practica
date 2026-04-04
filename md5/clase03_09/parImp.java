import java.util.Scanner;
class parImp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        int r= numero%2;

        System.out.println("Switch:");
        switch (r) {
            case 0 -> System.out.println(numero + " es un número par.");
            case 1 -> System.out.println(numero + " es un número impar."); 
            default -> System.out.println("Error: número no válido."); 
        }

        System.out.println("If-else:");
        if (r == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }
        }
    }
}