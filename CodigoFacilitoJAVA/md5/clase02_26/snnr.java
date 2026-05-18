import java.util.Scanner;
class snnr {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.println("Hello, " + name + "!");
        }
    }
}
