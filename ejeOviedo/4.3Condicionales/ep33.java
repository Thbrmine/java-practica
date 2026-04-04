import java.util.Scanner;
public class ep33 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Responda SI o NO a las siguientes preguntas:");

        System.out.print("1. ¿Simón Bolívar libertó a Colombia? ");
        String R1 = sc.next();
        if (R1.equalsIgnoreCase("SI")) {
            System.out.println("¡Correcto! Siguiente pregunta.");

            System.out.print("2. ¿Camilo Torres Restrepo fue un guerrillero? ");
            String R2 = sc.next();
            if (R2.equalsIgnoreCase("SI")) {
                System.out.println("¡Correcto! Siguiente pregunta.");

                System.out.print("3. ¿El Binomio de Oro de América es un grupo de música vallenata? ");
                String R3 = sc.next();
                if (R3.equalsIgnoreCase("SI")){
                    System.out.println("Ha ganado el juego.");
                    } else {
                        System.out.println("Respuesta incorrecta. Fin del juego.");
                    }

                } else {
                System.out.println("Respuesta incorrecta. Fin del juego."); 
                }
                
            } else {
                System.out.println("Respuesta incorrecta. Fin del juego.");
            }
        }
    }
}

