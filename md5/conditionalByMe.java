import java.util.Scanner;
class conditionalByMe {
    public static void main(String[] args) {

System.out.println("///////CONDITIONALS///////");
        //IF STATEMENT 
        int x = 10, y = 20;
        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is not greater than y");
        }
        // exp1 ? exp2 : exp3
    String res1= x > y ? "x is greater than y" : "x is not greater than y";
        System.out.println("Compared: " + res1);

        //SWITCH STATEMENT
        try (Scanner keyboard = new Scanner (System.in)) {
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