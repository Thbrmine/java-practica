import java.util.Scanner;
class eje4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un numero entero positivo: ");
            int num = sc.nextInt();

        System.out.println("Cuenta regresiva desde " + num + " hasta 0:");
        for (int i = num; i >= 0; i--) {
            String separator = (i == 0) ? "" : ",";
            System.out.print(i + separator + " ");
        }
        }
    }
}