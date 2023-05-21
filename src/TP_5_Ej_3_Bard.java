import java.util.Random;
public class TP_5_Ej_3_Bard {
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
        //Imprimo el arreglo
        System.out.println("El arreglo cargado es: ");
        for (int i = 0; i <MAX; i++) {
            System.out.print(arrint[i] + " | ");
        }
        // Calculo el promedio
        int suma = 0;
        for (int i = 0; i < MAX; i++) {
            suma += arrint[i];
        }
        double promedio = (suma/MAX);

        // Imprimo el promedio
        System.out.println("EL promedio es: " + promedio);

        // Cuento la cantidad de numeros que superar al valor promedio
        int contador = 0;
        for(int i = 0; i < MAX; i++) {
            if (arrint[i] > promedio) {
                contador++;
            }
        }

        //Imprimo la cantidad de numeros que superan el promedio
        System.out.println("La cantidad de numeros del arreglo que superan al valor promedio es: " + contador);
    }
}
