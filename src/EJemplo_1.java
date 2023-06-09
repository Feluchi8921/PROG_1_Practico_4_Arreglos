//Determinar el inicio y fin de la secuencia que más números pares tiene (si hay más de una, quedarse con la
//primera)
import java.util.Random;
public class EJemplo_1 {
    public static int MAX=20, MINVALOR=1, MAXVALOR=9, SEPARADOR=0;
    public static double probabilidad_numero=0.4;
    public static void main (String[] args){
        int [] arrint = new int [MAX];
        cargar_arreglo_aleatorio_secuencias_int(arrint);
        imprimir_arreglo_secuencias_int(arrint);
        obtener_inicio_fin_sec_mayor_cant_pares(arrint);
    }
    public static void obtener_inicio_fin_sec_mayor_cant_pares(int []arr){
        int inicio=0, fin=-1, mayor_cant_pares=0, inicio_mayor_sec_pares=0, fin_mayor_sec_pares=0;
        while(inicio<MAX) {
            inicio = obtener_inicio_sec(arr, fin + 1);
                fin = obtener_fin_sec(arr, inicio);
                int par = obtener_cant_numeros_pares_sec(arr, inicio, fin);
                if(par>mayor_cant_pares){ //le pongo mayor estricto para que se quede con la primera
                    mayor_cant_pares=par;
                    inicio_mayor_sec_pares=inicio;
                    fin_mayor_sec_pares=fin;
                }
            inicio++;
        }
        System.out.println("El inicio de la secuencua con mayor cant de pares es: "+inicio_mayor_sec_pares+" y el fin "+
                fin_mayor_sec_pares+ ". La cantidad de pares es: "+mayor_cant_pares);
    }
    public static int obtener_cant_numeros_pares_sec(int []arr, int inicio, int fin){
        int contador=0;
        for(int i=inicio; i<=fin; i++){
            if(arr[inicio]%2==0){
                contador++;
            }
        }
        return contador;
    }
    public static int obtener_inicio_sec(int []arr, int i){
        while((i<MAX)&&(arr[i]==SEPARADOR)){
            i++;
        }
        return i;
    }
    public static int obtener_fin_sec(int []arr, int i){
        while((i<MAX)&&(arr[i]!=SEPARADOR)){
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
