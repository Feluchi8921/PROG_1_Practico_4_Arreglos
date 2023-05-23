//Hacer un programa que cargue un arreglo (sin orden) de tamaño MAX=10 con números enteros aleatorios entre 0 y 100.
// Finalmente imprima por pantalla el arreglo ordenado. Hacerlo para orden creciente y decreciente
import java.util.Random;
public class TP_5_Ejercicio_30_Orden_crec_dec {
    public static int MAX=10;
    public static int MINVALOR=1;
    public static int MAXVALOR=100;
    public static void main(String []args){
        int [] arrint = new int [MAX];
        cargar_arreglo_int_aleatorio(arrint);
        System.out.println("El arreglo original es:");
        imprimir_arreglo(arrint);
        ordenar_arreglo_creciente(arrint);
        System.out.println("\n"+"El arreglo ordenado de forma creciente es:");
        imprimir_arreglo(arrint);
        ordenar_arreglo_decreciente(arrint);
        System.out.println("\n"+"El arreglo ordenado de forma decreciente es:");
        imprimir_arreglo(arrint);
    }
    public static void cargar_arreglo_int_aleatorio(int []arr){
        Random r = new Random();
        for(int i=0; i<MAX; i++){
            arr[i]= r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR;
        }
    }
    public static void ordenar_arreglo_creciente(int []arr){
        int aux=0;
        for(int i=1; i<MAX; i++){
            for(int j=0; j<MAX-1;j++){
                if (arr[j]>arr[j+1]) {
                    aux=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=aux;
                }
            }
        }
    }
    public static void ordenar_arreglo_decreciente(int []arr){
        int aux=0;
        for(int i=1; i<MAX; i++){
            for(int j=0; j<MAX-1;j++){
                if (arr[j]<arr[j+1]) {
                    aux=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=aux;
                }
            }
        }
    }
    public static void imprimir_arreglo(int []arr){
        for(int i=0; i<MAX; i++){
            System.out.print(arr[i]+" | ");
        }
    }
}

