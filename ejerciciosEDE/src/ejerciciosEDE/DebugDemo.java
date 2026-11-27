package ejerciciosEDE;

public class DebugDemo {

    public static void main(String[] args) {
        int[] numeros = {10, 25, 30, 45, 50};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];

            // Breakpoint aquí
            if (numero % 20 == 0) {
                System.out.println(numero + " es múltiplo de 20");
            }

            suma += numero;
        }

        System.out.println("La suma total es: " + suma);
    }
}