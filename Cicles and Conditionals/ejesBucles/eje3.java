import java.util.Scanner;
class eje3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un numero entero positivo: ");
            int num = sc.nextInt();

            System.out.println("Estos son los numeros impares hasta " + num + ":");
            for (int i = 1; i <= num; i++) {
                if (i % 2 != 0) {
                    System.out.print( i);
                    if (i + 2 <= num) {
                        System.out.print(", ");
                    }
                }
            }

        }
    }
}