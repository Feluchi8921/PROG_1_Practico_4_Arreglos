//Implementar un método que realice un corrimiento a izquierda en un arreglo ordenado de tamaño MAX=10
// a partir de una posición.
import java.util.Random;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class TP_5_Ej_8_Corrimiento_izquierda_arr_ordenado {
    public static int MAX=10;
    public static int MINVALOR=1;
    public static int MAXVALOR=10;
    public static void main (String []args){
        int [] arrint = new int[MAX];
        cargar_arreglo_aleatorio(arrint);
        ordenar_arreglo_burbujeo(arrint);
        imprimir_arreglo(arrint);
        int pos=ingresar_posicion_consola();
        realizar_corrimiento_izquierda(arrint, pos);
        imprimir_arreglo(arrint);
    }
    public static void cargar_arreglo_aleatorio(int []arr){
        Random r = new Random();
        for(int i=0; i<MAX; i++){
            arr[i]=r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR;
        }
    }
    public static void ordenar_arreglo_burbujeo(int []arr){
        int aux;
        for(int i=1;i<MAX;i++){
            for(int j=0; j<MAX-1;j++){
                if (arr[j]>arr[j+1]) {
                   aux = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=aux;
                }
            }
        }
    }
    public static int ingresar_posicion_consola(){
        int pos=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("\n"+"Ingrese una posicion menor a 10");
            pos = Integer.valueOf(entrada.readLine());
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        return pos;
    }
    public static void realizar_corrimiento_izquierda(int[]arr, int pos){
        while(pos<MAX-1){
            arr[pos]=arr[pos+1];
            pos++;
        }
        System.out.println("\n"+"El arreglo con corrimiento a izquierda es:");
    }
    public static void imprimir_arreglo(int []arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " | ");
        }
    }
}
