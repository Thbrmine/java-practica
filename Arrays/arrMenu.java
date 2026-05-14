public class arrMenu {
    static final int TAM = 10;
    static int pos = 0;
    static int a[] = new int[TAM];
    public static void main(String[] args) {
       varios v = new varios ();
       int op;
       do {
           String menu = """
                         Menu de Arreglos 
                         1. Agregar un numero 
                         2. Consultar n\u00famero de elementos 
                         3. Mostrar el arreglo 
                         4. Invertir arreglo 
                         5. Eliminar un n\u00famero 
                         0. Salir 
                         """;    
              op = v.leerEntero(menu); 
              switch (op){
                case 1 -> adicionar();
                case 2 -> consultar();
                case 3 -> mostrar();
                case 4 -> invertir();
                case 5 -> eliminar();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida");
              }
       } while (op != 0);
    }
    public static void adicionar(){
        varios v = new varios ();
        if (pos == TAM) {
            v.Mensaje("El arreglo está lleno, no se pueden agregar más números.");
        } else {
            int num = v.leerEntero("Ingrese un número para agregar al arreglo:");
            a[pos] = num;
            pos++;
        }

    }
    public static void consultar(){
        varios v = new varios ();
        v.Mensaje("El número de elementos en el arreglo es: " + pos);
    }
    public static void mostrar(){
        varios v = new varios ();
        v.Mensaje("Elementos en el arreglo:");
        for (int i = 0; i < pos; i++) {
            v.Mensaje("Elemento " + (i + 1) + ": " + a[i]);
        }
    }
    public static void invertir(){
        for (int i = 0; i < pos / 2; i++) {
            int temp = a[i];
            a[i] = a[pos - 1 - i];
            a[pos - 1 - i] = temp;
        }
    }
    public static void eliminar(){
        varios v = new varios ();
        if (pos == 0) {
            v.Mensaje("El arreglo está vacío, no se pueden eliminar elementos.");
        } else {
            int num = v.leerEntero("Ingrese el número a eliminar del arreglo:");
            boolean encontrado = false;
            for (int i = 0; i < pos; i++) {
                if (a[i] == num) {
                    encontrado = true;
                    for (int j = i; j < pos - 1; j++) {
                        a[j] = a[j + 1];
                    }
                    pos--;
                    break;
                }
            }
            if (!encontrado) {
                v.Mensaje("El número no se encuentra en el arreglo.");
            }
        }
    }

    public static int[] getA() {
        return a;
    }

    public static void setA(int[] a) {
        arrMenu.a = a;
    }
}
