//Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra precargado,
// solicite al usuario un número entero y elimine todas las ocurrencia de número en el arreglo.
// Mientras exista (en cada iteración tiene que buscar la posición dentro del arreglo)
// tendrá que usar la posición para realizar un corrimiento a izquierda (quedarán tantas copias de la última
//posición del arreglo como cantidad de ocurrencias del número).

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TP_5_Ej_11 {
    public static int MAX=10;
    public static int MINVALOR=1;
    public static int MAXVALOR=10;
    public static void main(String []args){
        int []arrint = new int [MAX];
        cargar_arreglo_aleatorio(arrint);
        imprimir_arreglo(arrint);
        int numero = solicitar_numero_consola();
        encontrar_numero(arrint, numero);
        imprimir_arreglo(arrint);
    }
    public static void cargar_arreglo_aleatorio(int []arr){
        Random r = new Random();
        for(int i=0; i<MAX; i++){
            arr[i]=r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR;
        }
    }
    public static int solicitar_numero_consola(){
        int numero=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("\n"+"Ingrese un numero");
            numero=Integer.valueOf(entrada.readLine());
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        return numero;
    }
    public static void encontrar_numero(int []arr, int numero){
        int i=0;
        while(i<MAX){
            if(arr[i]==numero){
                realizar_corrimiento_izquierda(arr, i);
            }
            else{
                i++;
            }
        }
    }
    public static void realizar_corrimiento_izquierda(int []arr, int i){
        while(i<MAX-1){
            arr[i]=arr[i+1];
            i++;
        }
    }
    public static void imprimir_arreglo(int []arr){
        for(int i=0; i<MAX; i++){
            System.out.print(arr[i]+" | ");
        }
    }
}
