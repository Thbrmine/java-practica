import java.util.Scanner;
class eje13{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        System.out.println("Modo ECO activo");
        System.out.println("Escribe algo (o 'salir' para terminar): ");

        while(true){
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("salir")){
                System.out.println("Modo ECO desactivado");
                break;
            }else{
                System.out.println("ECO: " + input);
            }
        } 
        }   
    }
}