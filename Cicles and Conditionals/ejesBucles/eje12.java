import java.util.Scanner;
class eje12{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();

        System.out.println("Introduzca la letra a contar: ");
        char letraContar = sc.nextLine().charAt(0);

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letraContar) {
                contador++;
            }
        }
        System.out.println("La letra '" + letraContar + "' aparece " + contador + " veces en la frase.");
        }
    }
}