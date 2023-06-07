//Hacer un programa que dado el arreglo definido y precargado, imprima lo que suma el contenido de cada secuencia.
import java.util.Random;
public class Ejemplo_arreglo_sec_1 {
    public static int MAX=40, MINVALOR=1, MAXVALOR=9;
    public static double probabilidad_numero=0.4;
    public static void main (String []args){
        int [] arrint =new int [MAX];
        cargar_arreglo_aleatorio_secuencias_int(arrint);
        imprimir_arreglo_secuencias_int(arrint);
        imprimir_suma_cada_secuencia(arrint);
    }
    public static void imprimir_suma_cada_secuencia(int []arr){
        int inicio=0, fin=-1, suma=0;
        while(inicio<MAX) {
            inicio = obtener_inicio_sec(arr, fin+1);
            if(inicio<MAX) {
                fin = obtener_fin_sec(arr, inicio);
                suma=obtener_suma(arr, inicio, fin);
                System.out.println("El inicio es " + inicio + " y el fin " + fin);
                System.out.println("La suma es: " + suma);
            }
        }
    }
    public static int obtener_suma(int []arr, int inicio, int fin){
        int suma=0;
        while(inicio<=fin){
            suma+=arr[inicio];
            inicio++;
        }
        return suma;
    }
    public static int obtener_inicio_sec(int []arr, int inicio){
        while((inicio<MAX)&&(arr[inicio]==0)){
            inicio++;
        }
        return inicio;
    }
    public static int obtener_fin_sec(int []arr, int inicio){
        while((inicio<MAX)&&(arr[inicio]!=0)){
            inicio++;
        }
        return inicio-1;
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

