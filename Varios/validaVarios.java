//import java.util.Scanner;
public class validaVarios {
    public static void main(String[] args) {
        //try (Scanner sc = new Scanner(System.in)){

        varios v = new varios();
        int n;
        double d;
        String s;

        v.Mensaje("Hola Mundo");
        //System.out.println("Numero ? ");
        //n=sc.nextInt();

        n = v.leerEntero("Numero ? ");
		v.Mensaje("Numero leido es: " + n );
		System.out.println("Numero leido es: " + n );

        d = v.leerDecimal("Numero ? ");
		v.Mensaje("Numero leido es: " + d );
		System.out.println("Numero leido es: " + d );

        s = v.leerCadena("Nombre ? ");
		v.Mensaje("Cadena leida es: " + s );
		System.out.println("Cadena leida es: " + s );
        //}
    }
}