import java.util.Scanner;
public class arrOrden {
    public static void main (String[]args){
        int n,i,j,aux;
        int a[] = new int[10];
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Cantidad de elementos: ");
            n= sc.nextInt();
            for (i=0; i<n; i++){
                System.out.printf("a[%d] = ", i);
                a[i] = sc.nextInt();
            }

            for (i=0; i<a.length;i++){
                for (j=0;j<a.length-1-i;j++){
                    if (a[j] > a[j+1]){
                        aux = a[j];
                        a[j] = a[j+1];
                        a[j+1] = aux;
                    }
                }
            }
            System.out.println("Elementos ordenados ascendentemente: ");
            for (i=0; i<n; i++){
                System.out.printf("a[%d] = %d \n", i, a[i]);
            }

            for (i=0; i<a.length;i++){
                for (j=0;j<a.length-1-i;j++){
                    if (a[j] < a[j+1]){
                        aux = a[j];
                        a[j] = a[j+1];
                        a[j+1] = aux;
                    }
                }
            }
            System.out.println("Elementos ordenados descendentemente: ");
            for (i=0; i<n; i++){
                System.out.printf("a[%d] = %d \n", i, a[i]);
            }
        }
    }
}