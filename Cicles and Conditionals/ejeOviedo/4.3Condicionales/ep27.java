import java.util.Scanner;

public class ep27 {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {

        System.out.print("Ingrese un número octal de 5 digitos: ");
        String digitOctal = sc.nextLine();

        double decimal = 0;
        int d0 = Character.getNumericValue(digitOctal.charAt(0));
        decimal = decimal + d0 * Math.pow(8, 4);

        int d1 = Character.getNumericValue(digitOctal.charAt(1));
        decimal = decimal + d1 * Math.pow(8, 3);

        int d2 = Character.getNumericValue(digitOctal.charAt(2));
        decimal = decimal + d2 * Math.pow(8, 2);

        int d3 = Character.getNumericValue(digitOctal.charAt(3));
        decimal = decimal + d3 * Math.pow(8, 1);

        int d4 = Character.getNumericValue(digitOctal.charAt(4));
        decimal = decimal + d4 * Math.pow(8, 0);

        System.out.println("El número octal " + digitOctal + " en decimal es: " + decimal);
        }
    }
}
