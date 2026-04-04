class Break_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Siguiente"+ i + ":");

            for (int j= 0; j< 10; j++) {
                if (j==10) {
                    break; // Sale del ciclo interno cuando j es igual a 10
                }
                System.out.println("Siguiente"+ j + ":");
            }
            System.out.println();
        }

        System.out.println("Ciclo terminado con break.");

        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                continue; // Salta la iteración cuando j es igual a 5
            }
            System.out.println(j);
        }

        System.out.println("Ciclo terminado con continue.");
    }
}