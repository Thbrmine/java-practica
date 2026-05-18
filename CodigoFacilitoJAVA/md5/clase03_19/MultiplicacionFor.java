import java.util.Scanner;
class MultiplicacionFor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Tabla de Multiplicar de: ?");
            int tabla = sc.nextInt();

            //Ciclo for 
            // for (inicialización; condición; iteración) {
            
            for (int i = 1; i <= 10; i++) {
                int resultado = tabla * i;
                System.out.println(tabla + " * " + i + " = " + resultado);
            }
            
            System.out.println("Lo mismo pero logica distinta");
            int i = 1;
            for (; i<= 10;) {
                int resultado = tabla * i;
                System.out.println(tabla + " * " + i + " = " + resultado);
                i++;
            }

            System.out.println("Otra logica");
             for (int j=1, resultado = 0; j <= 10; resultado = tabla * j, j++) {
                System.out.println(tabla + " * " + j + " = " + resultado);
            }
        } 
    }
}