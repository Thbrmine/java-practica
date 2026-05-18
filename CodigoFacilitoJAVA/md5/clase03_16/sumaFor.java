import java.util.Scanner;
class sumaFor {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
		 int i = 0;
		 
		 System.out.println("Cuantos numeros?");
		 int total = sc.nextInt();
	
		 for( int contador = 1;  contador <= total ;  contador++ ){
			 System.out.println("numero " + contador);
			 int numero = sc.nextInt();
			 i += numero;
		 }
		 System.out.println("La suma es " + i );
		}
    }
}