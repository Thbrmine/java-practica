import java.util.Scanner;
class mlt {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
		 System.out.println("Imprimir hasta?");
		 int hasta = sc.nextInt();
		 
		 System.out.println("multiplos de ?");
		 int multiplo = sc.nextInt();
		 int contador = multiplo;
		 
		 System.out.println("Multiplos de ? (while)");

		 while( contador <= hasta ) {
			 System.out.println("numero " + contador );
			 contador += multiplo;
		 }

		 System.out.println("multiplos de ? (for)");
		 for( contador = multiplo; contador <= hasta ; contador += multiplo ){
			 System.out.println("numero " + contador );
		 }
	   }
    }
}