import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP_5_Ej_1_Bard {
public static final int MAX=15;
    public static void main(String[] args) {
        // Creo un arreglo de tamaño 15
        int[] arrint = new int[MAX];
        // Pido al usuario que ingrese 15 valores entre 1 y 12
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int i = 0; i < MAX; i++) {
                System.out.println("Ingrese un número entre 1 y 12: ");
                int numero = Integer.valueOf(entrada.readLine());
                // Chequeo si el numero esta entre 1 y 12
                while (numero < 1 || numero > 12) {
                    System.out.println("Numero invalido. Por favor ingrese un numero entre 1 y 12");
                    numero =Integer.valueOf(entrada.readLine());
                }
                // Almaceno el valor en el arreglo
                arrint[i] = numero;
            }

            // Print the array
            System.out.println("El arreglo cargado es: ");
            for (int i = 0; i < MAX; i++) {
                System.out.print(arrint[i] + " | ");
            }
        }
        catch (Exception exc){
        System.out.println(exc);
        }
    }
}
