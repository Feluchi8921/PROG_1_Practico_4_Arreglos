//Implementar un programa que, dado un arreglo de enteros, incremente en 1 cada elemento de una
//secuencia, si la suma de los elementos de dicha secuencia es par.
import java.util.Random;
public class Ejercicio_extra_1 {
    public static int MAX=20, MINVALOR=-9, MAXVALOR=9;
    public static double probabilidad_numero=0.4;
    public static void main (String []args){
        int []arrint=new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arrint);
        imprimir_arreglo_secuencias_int(arrint);
        incrementar_sec_suma_par(arrint);
        imprimir_arreglo_secuencias_int(arrint);
    }
    public static void incrementar_sec_suma_par(int []arr){
        int inicio=0, fin=-1;
        while(inicio<MAX){
            inicio=obtener_inicio_sec(arr, fin+1);
            fin=obtener_fin_sec(arr, inicio);
            int suma=obtener_suma_sec(arr, inicio, fin);
            if(suma%2==0){
                incrementar_sec(arr, inicio, fin);
            }
            inicio++;
        }
    }
    public static int obtener_inicio_sec(int []arr, int i){
        while((i<MAX)&&(arr[i]==0)){
            i++;
        }
        return i;
    }
    public static int obtener_fin_sec(int []arr, int i){
        while((i<MAX)&&(arr[i]!=0)){
            i++;
        }
        return i-1;
    }
    public static int obtener_suma_sec(int []arr, int inicio, int fin){
        int suma=0;
        while(inicio<=fin){
            suma+=arr[inicio];
            inicio++;
        }
        return suma;
    }
    public static void incrementar_sec(int [] arr, int inicio, int fin){
        while(inicio<=fin){
            arr[inicio]=arr[inicio]+1;
            inicio++;
        }
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

