import java.util.Scanner;
class eje2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        int añoActual = 2026;
        int añoNacimiento = añoActual - edad;
        System.out.println("Su edad es: " + edad);
        System.err.println("Este es tu historial de cumpleaños:");
        for (int i =1; i <= edad; i++){
            int añoCumplido = añoNacimiento + i;
            System.out.println("Cumpliste " + i + " años en " + añoCumplido);
        }
        }
    }
}
