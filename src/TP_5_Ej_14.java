//Hacer un programa que elimine los valores pares en un arreglo de tamaño MAX=10.
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TP_5_Ej_14 {
    public static int MAX=10;
    public static int MINVALOR=1;
    public static int MAXVALOR=10;
    public static void main (String []args){
        int [] arrint = new int [MAX];
        cargar_arreglo(arrint);
        imprimir_arreglo(arrint);
        eliminar_numeros_pares(arrint);
        System.out.println("\n"+"El arreglo luego de eliminar todos los numeros pares es:");
        imprimir_arreglo(arrint);
    }
    public static void cargar_arreglo(int []arr){
        Random r = new Random();
        for(int i=0; i<MAX; i++){
            arr[i]= r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR;
        }
    }
    public static void eliminar_numeros_pares(int []arr){
        int i=0;
       while(i<MAX) {
           if (arr[i]%2==0) {
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
        for(int i=0; i<MAX;i++){
            System.out.print(arr[i]+" | ");
        }
    }
}
