import java.util.Scanner;
public class arrParImp{
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)){
        int n,i;
        int a[] = new int[10];

        System.out.print("Cantidad de elementos: ");
		n = sc.nextInt();
		for (i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			a[i] = sc.nextInt();
		}
        int par = 0;
		int impar = 0;
		for(  i = 0; i < n; i++ ){
			if( a[i] % 2 == 0 )
				par++;
			else
				impar++;
		}
		
		System.out.printf("Pares = %d \n", par );
		System.out.printf("Impares = %d \n", impar );

  
        }
    }

}