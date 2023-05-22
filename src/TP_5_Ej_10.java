
//Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra precargado,
// solicite al usuario un número entero y elimine la primera ocurrencia del número
// (un número igual) en el arreglo (si existe). Para ello tendrá que buscar la posición y si está,
// realizar un corrimiento a izquierda (queda una copia de la última posición del arreglo en la anteúltima posición).
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TP_5_Ej_10 {
    public static int MAX = 10;
    public static int MAXVALOR = 10;
    public static int MINVALOR = 1;

    public static void main(String[] args) {
        int[] arrint = new int[MAX];
        cargar_arreglo_int(arrint);
        imprimir_arreglo(arrint);
        int numero = solicitar_numero_consola();
        encontrar_posicion(arrint, numero);
        imprimir_arreglo(arrint);
    }

    public static void cargar_arreglo_int(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < MAX; i++) {
            arr[i] = r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR;
        }
    }

    public static void imprimir_arreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " | ");
        }
    }

    public static int solicitar_numero_consola() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("\n"+"Ingrese un numero entero");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }

    public static void encontrar_posicion(int[] arr, int numero) {
        int pos = 0;
        while(pos<MAX-1) {
            if(arr[pos]==numero){
                realizar_corrimiento_izquierda(arr, pos);
                break;
            }
            else {
                pos++;
                }
        }
    }
        public static void realizar_corrimiento_izquierda ( int[] arr, int pos){
            while (pos < MAX - 1) {
                arr[pos] = arr[pos + 1];
                pos++;
            }
        }
}