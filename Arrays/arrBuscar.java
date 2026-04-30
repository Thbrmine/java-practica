import java.util.Scanner;

public class arrBuscar {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n, i, b;
		int a[] = new int[10];

		System.out.print("Cuantos Elementos = ");
		n = teclado.nextInt();

		for (i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = teclado.nextInt();
		}

        while (true){
            System.out.print("Elemento a buscar = ");
		b = teclado.nextInt();

            for (i = 0; i < n; i++) {
                if (a[i] == b)
                    break;
            }

            if (i == n)
                System.out.println("Elemento NO se encuentra");
            else
                System.out.println("Elemento se encontro en la posicion = " + i);
        System.out.println("Desea continuar? 0: No, Otro numero: Sí= ");
		b = teclado.nextInt();
        if (b == 0)
            break;
        }
        System.out.println("Fin del programa");
	}

}
