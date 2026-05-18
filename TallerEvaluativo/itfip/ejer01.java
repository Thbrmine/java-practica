public class ejer01 {
    public static void main (String[]args){
        System.out.println("Ejercicio 1");
        x a, b;
        a = new x();
        a.imprimir();
        b = new x(10);
        b.imprimir();
        System.out.println("class a.i " + a.i);
    }
}
class x {
    int  i;
    x(){
        //int i = 2;
        i = 5;
        this.i = 9;
    }
    x(int i){
        this.i = i;
    }
    void imprimir(){
        System.out.println("i: " + i);
    }
}