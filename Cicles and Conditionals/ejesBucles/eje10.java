import java.util.Scanner;
class eje10{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Ingrese un numero entero positivo: ");
        int num = sc.nextInt();

        if(num <= 1){
            System.out.println("El numero no es primo");
        }else{
            boolean esPrimo = true;
            for(int i = 2; i * i <= num; i++){
                if(num % i == 0){
                    esPrimo = false;
                    break;
                }
            }
            if(esPrimo){
                System.out.println("El numero es primo");
            }else{
                System.out.println("El numero no es primo");
            }
        }
        }

    }
}