//Implementar un programa que, dado un arreglo de enteros, elimine todas las secuencias que tienen al
//menos un múltiplo de 2 y cuyo tamaño es impar.
import java.util.Random;
public class Ejercicio_extra_2 {
    public static int MAX=20, MINVALOR=1, MAXVALOR=9;
    public static double probabilidad_numero=0.4;
    public static void main (String []args){
        int [] arrint = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arrint);
        imprimir_arreglo_secuencias_int(arrint);
        eliminar_sec_con_pares_y_tamanio_impar(arrint);
        imprimir_arreglo_secuencias_int(arrint);
    }
    public static void eliminar_sec_con_pares_y_tamanio_impar(int []arr){
        int inicio=0, fin=-1;
        while(inicio<MAX){
            inicio=obtener_inicio(arr, fin+1);
            fin=obtener_fin(arr, inicio);
            boolean verifica=verificar_si_cumple_condicion(arr, inicio, fin);
            if(verifica==true) {
                for(int i = inicio; i <=fin; i++){
                    corrimiento_izquierda(arr, inicio);
                }
            }
            inicio++;
        }
    }
    public static boolean verificar_si_cumple_condicion(int []arr, int inicio, int fin){
        int tamanio=0;
        boolean verifica=false;
        tamanio=(fin-inicio)+1;
        if(tamanio%2!=0){
        while(inicio<=fin) {
            if (arr[inicio]%2==0) {
                verifica=true;
            }
            inicio++;
        }
        }
        return verifica;
    }
    public static void corrimiento_izquierda (int []arr, int inicio){
        while(inicio<MAX-1){
            arr[inicio]=arr[inicio+1];
            inicio++;
        }
    }
    public static int obtener_inicio(int []arr, int i){
        while((i<MAX)&&(arr[i]==0)){
            i++;
        }
        return i;
    }
    public static int obtener_fin(int []arr, int i){
        while((i<MAX)&&(arr[i]!=0)){
            i++;
        }
        return i-1;
    }
    public static void cargar_arreglo_aleatorio_secuencias_int(int [] arr){
        Random r = new Random();
        arr[0] = 0;
        arr[MAX-1] = 0;
        for (int pos = 1; pos < MAX-1; pos++){
            if (r.nextDouble()>probabilidad_numero){
                arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
            }
            else{
                arr[pos]=0;
            }
        }
    }
    public static void imprimir_arreglo_secuencias_int(int [] arr){
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++){
            System.out.print(arr[pos]+"|");
        }
        System.out.print("\n");
    }
}
