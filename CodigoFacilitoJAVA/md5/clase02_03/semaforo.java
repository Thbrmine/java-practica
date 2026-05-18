import java.util.Scanner;
class semaforo {
    public static void main(String[] args) {
        //SWITCH STATEMENT
       try ( Scanner keyboard = new Scanner (System.in)) {
        System.out.println("Enter a color (red, yellow, green): ");
        String colorLuz = keyboard.nextLine();
        switch (colorLuz) {
            case "red" -> System.out.println("Stop");
            case "yellow" -> System.out.println("Caution");
            case "green" -> System.out.println("Go");
            default -> System.out.println("Invalid color");
        }
       }
    }
}