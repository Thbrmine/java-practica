class eje7 {
    public static void main(String[] args) {
        for (int i=1; i <= 10; i++) {
            System.out.println("Tabla del " + i);
            for (int j=1; j <= 10; j++) {
                int resultado = i * j;
                System.out.printf("%d * %d = %d\n", i, j, resultado);
            }
             System.out.println();
        }
    }
}