import java.util.Scanner;
public class ep46 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el radio del círculo: ");
            double radio = sc.nextDouble();
            
            sc.nextLine(); 

            System.out.println("¿Cuántos puntos desea evaluar?");
            int num= sc.nextInt();

            int countInside=0;

            for (int i = 1; i <= num; i++) {
                System.out.println("Punto " + i);
                System.out.print("Ingrese la coordenada x: ");
                double x = sc.nextDouble();
                System.out.print("Ingrese la coordenada y: ");
                double y = sc.nextDouble();

                if (esDentroDelCuadranteI(x, y, radio)) {
                    System.out.println("El punto está dentro del I cuadrante del círculo.");
                    countInside++;
                } else {
                    System.out.println("El punto está fuera o no cumple.");
                }
            }
            System.out.println("Número de puntos dentro del I cuadrante del círculo: " + countInside);
        }   
    }
    // Booleano para determinar si el punto (x, y) está dentro del I cuadrante del círculo con el radio dado
    public static boolean esDentroDelCuadranteI(double x, double y, double radio) {
        return x > 0 && y > 0 && x * x + y * y < radio * radio;
    }
}
