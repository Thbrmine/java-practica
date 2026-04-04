import java.util.Scanner;
class eje11{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Introduzca una palabra: ");
        String palabra = sc.nextLine();

        int largo = palabra.length();
        System.out.println("La palabra tiene " + largo + " caracteres.");

        System.out.println("La palabra al revés es: " + new StringBuilder(palabra).reverse().toString());

        System.out.println("La palabra al revés es: (for) ");
        for (int i = largo -1; i >= 0; i--) {
            char letra = palabra.charAt(i);
            System.out.print(letra);
        }
        System.out.println(); 
        }

    }
}