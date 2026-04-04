import java.util.Scanner;
class eje1 {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        String palabra;
        System.out.println("Escriba una palabra");
        palabra = sc.nextLine();

        System.out.println("La palabra que escribiste se repetirá 10 veces:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " " + palabra);
        }
       }
    }
}