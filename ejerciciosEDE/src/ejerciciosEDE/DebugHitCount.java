package ejerciciosEDE;

public class DebugHitCount {

    public static void main(String[] args) {
        int[] temperaturas = {15, 20, 22, 20, 25, 20, 30};
        int contador20 = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            int temp = temperaturas[i];

            // Breakpoint aquí
            if (temp == 20) {
                contador20++;
                System.out.println("Temperatura 20 encontrada en índice: " + i);
            }
        }

        System.out.println("Veces que apareció 20: " + contador20);
    }
}
