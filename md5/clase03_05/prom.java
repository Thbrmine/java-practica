import java.util.Scanner;
public class prom {
    public static void main(String[] args) {
        int n1, n2, n3;
        double prom;
       try (Scanner keyboard = new Scanner(System.in)) {
        System.out.println("Enter three grades (1-5)");
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        n3 = keyboard.nextInt();
        prom = (n1 + n2 + n3) / 3.0;
        System.out.println("The average is: " + prom);
        if (prom <= 7.0) {
            System.out.println("Failed");
        } else if (prom > 7.0 || prom < 9.0) {
            System.out.println("Passed with a regular grade");
        } else if (prom >= 9.0 || prom == 10.0) {
            System.out.println("Congrats!");
        }
       }
    }
}