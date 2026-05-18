import java.util.Scanner;
public class ep35 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            sc.useLocale(java.util.Locale.US);
            
            System.out.print("Ingresar 1 para indicar que es de Pregrado. Ingresar 2 para indicar que es de Posgrado: ");
            int tipo = sc.nextInt();

            sc.nextLine(); 

            System.out.println("Ingrese el promedio del estudiante: ");
            double promedio = sc.nextDouble();

            int creditos = 0;
            double descuento = 0.0;
  

            switch (tipo) {
                case 1 ->   {
                    int valorCredito = 50000;

                    if (promedio >= 4.5) {
                        creditos = 28;
                        descuento = 0.25;
                    } else if (promedio >= 4.0) {
                        creditos = 25;
                        descuento = 0.10;
                    } else if (promedio > 3.5) {
                        creditos = 20;
                        descuento = 0.0;
                    } else if (promedio >= 2.5) {
                        creditos = 15;
                        descuento = 0.0;
                    } else {
                        System.out.println("El estudiante no se puede matricular.");
                    }

                if (creditos > 0) {
                    double valorMatricula = creditos * valorCredito * (1 - descuento);
                    System.out.printf ("Creditos registrados: %d%n", creditos);
                    System.out.printf("Valor a pagar por la matrícula Pregrado: $%,.2f%n", valorMatricula);
                    }       
                }

                case 2 ->   {
                    int valorCredito= 300000;

                    if (promedio >= 4.5) {
                        creditos = 20;
                        descuento = 0.20;
                    } else {
                        creditos = 10;
                        descuento = 0.0;
                        }      
                    
                if (creditos > 0) {
                        double valorMatricula = creditos * valorCredito * (1 - descuento);
                        System.out.printf ("Creditos registrados: %d%n", creditos);
                        System.out.printf("Valor a pagar por la matrícula Posgrado: $%,.2f%n", valorMatricula);
                    }
                }
            default -> System.out.println("Tipo de estudiante no válido.");
            }
        }
    }
}

