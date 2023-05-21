//Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra cargado,
// obtenga la cantidad de números pares que tiene y la imprima.
import java.util.Random;
public class TP_5_Ej_6 {
    public static int MAX=10;
    public static int MINVALOR=1;
    public static int MAXVALOR=10;
    public static void main(String []args){
        int []arrint=new int[MAX];
        cargar_arreglo_int_aleatorio(arrint);
        imprimir_arreglo(arrint);
        obtener_cant_pares(arrint);
    }
    public static void cargar_arreglo_int_aleatorio(int []arr) {
        Random r = new Random();
        for (int i = 0; i < MAX; i++) {
            arr[i] = r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR;
        }
    }
    public static void imprimir_arreglo(int []arr){
        for(int i=0; i<MAX; i++) {
            System.out.print(arr[i] + " | ");
        }
    }
    public static void obtener_cant_pares(int []arr){
        int contador=0;
        for(int i=0; i<MAX;i++){
            if(arr[i]%2==0){
                contador++;
            }
        }
        System.out.println("La cantidad de numeros pares es: "+contador);
    }
}
