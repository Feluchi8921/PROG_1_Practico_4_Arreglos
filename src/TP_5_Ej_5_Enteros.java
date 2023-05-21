//Hacer un programa que dado un arreglo de caracteres de tamaño 10 que se encuentra cargado, invierta el orden del contenido.
// Este intercambio no se debe realizar de manera explícita,
// hay que hacer un método que incluya una iteración de intercambio.
import java.util.Random;
public class TP_5_Ej_5_Enteros {
    public static int MAX=10;
    public static int MAXVALOR=10;
    public static int MINVALOR=1;
    public static void main (String []args){
        int []arrint=new int [MAX];
        cargar_arreglo_int_aleatorio(arrint);
        invertir_orden_arreglo(arrint);
    }
    public static void cargar_arreglo_int_aleatorio(int []arr){
        Random r = new Random();
        for(int i=0; i<MAX; i++){
            arr[i]=r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR;
        }
        System.out.println("El arreglo cargado aleatorio es: ");
        imprimir_arreglo(arr);
    }
    public static void invertir_orden_arreglo(int []arr){
        for(int i=0; i<MAX/2;i++){
            int aux=arr[(MAX-1)-i];
            arr[(MAX-1)-i]=arr[0+i];
            arr[0+i]=aux;
        }
        System.out.println("El arreglo invertido es: ");
        imprimir_arreglo(arr);
    }
    public static void imprimir_arreglo(int []arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " | ");
        }
    }
}
