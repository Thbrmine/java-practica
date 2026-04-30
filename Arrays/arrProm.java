import java.util.Scanner;
public class arrProm{
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)){
        int n,i;
        int a[] = new int[10];

        System.out.print("Cantidad de Calificaciones: ");
		n = sc.nextInt();
		for (i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			a[i] = sc.nextInt();
		}
        int suma = 0;
		for( i = 0; i < n; i++ ){
			suma += a[i];
		}

		System.out.printf("Suma = %d \n", suma );
		System.out.printf("Tamaño = %d \n", n );
		
        double prom = (double) suma / n;
		System.out.printf("Promedio: %.2f \n", prom );
  
        }
    }

}