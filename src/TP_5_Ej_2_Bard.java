import java.util.Random;

public class TP_5_Ej_2_Bard {
    public static int MAX=10;
    public static int MINVALOR=1;
    public static void main(String[] args) {
        // Creo el objeto random
        Random r = new Random();
        // Creo un arrreglo de tamaño 10
        int[] arrint = new int[MAX];

        // Lleno el arreglo con número aleatorios entre 1 y 10
        for (int i = 0; i < MAX; i++) {
            arrint[i] = (r.nextInt(MAX - MINVALOR + 1) + MINVALOR);
        }

        // Calculo el promedio
        int suma = 0;
        for (int i = 0; i < MAX; i++) {
            suma += arrint[i];
        }
        double promedio = (suma / MAX);

        // Imprimo el promedio
        System.out.println("EL promedio es: " + promedio);
    }
}
