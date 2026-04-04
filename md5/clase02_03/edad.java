import java.util.Scanner;
class edad {
    public static void main(String[] args) {
      try (Scanner keyboard = new Scanner(System.in)) {
       System.out.println("Enter your age: ");
         int age = keyboard.nextInt();  
           if (age >= 0 && age <= 12) {
            System.out.println("You are a child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a teenager.");
        } else if (age >= 20 && age <= 64) {
            System.out.println("You are an adult.");
        } else if (age >= 65) {
            System.out.println("You are a senior.");
        } else {
            System.out.println("Invalid age.");
        }
      }
    }
}   