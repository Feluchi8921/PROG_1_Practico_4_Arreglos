import java.util.Random;
public class Ejercicio_tipo_parcial_1{
    public static int MAX=21, MAX_PATRON=3, MINVALOR=1, MAXVALOR=9, SEPARADOR=-1;
    public static double probabilidad_numero=0.4;
    public static void main (String []args){
        int[] arrint = {-1,23,34,55,-1,3,34,55,-1,23,34,55,-1,23,34,55,-1,23,34,55,-1};
        imprimir_arreglo(arrint);
        int[] arr_patron = {23,34,55};
        eliminar_patron_repetido(arrint, arr_patron);
    }
    public static void eliminar_patron_repetido(int[]arr, int []patron){
        int inicio=0, fin=-1;
        int contador=0;
        while(inicio<MAX){
            inicio=obtener_inicio_sec(arr, fin+1);
            fin=obtener_fin_sec(arr, inicio);
            buscar_segunda_repeticion_patron(arr, inicio, fin, patron);
            if(contador>=2) {
                for (int i = inicio; i <= fin; i++) {
                    corrimiento_izquierda(arr, inicio);
                }
            }
            inicio++;
        }
        imprimir_arreglo(arr);
    }
    public static int buscar_segunda_repeticion_patron(int [] arr, int inicio, int fin, int [] arr_patron){
        int contador=1;
        for(int i=inicio; i<fin; i++){
            for(int j=0; j<MAX_PATRON; j++){
                if(arr[i]==arr_patron[j]){
                    contador++;
                }
                j++;
            }
            i++;
        }
        System.out.println("EL contador va en "+contador);
        return contador;
    }
    public static void corrimiento_izquierda(int []arr, int inicio){
        while(inicio<MAX-1){
            arr[inicio]=arr[inicio+1];
            inicio++;
        }
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
    public static void imprimir_arreglo(int []arr){
        for(int i=0; i<MAX; i++){
            System.out.print(arr[i]+" | ");
        }
        System.out.println("----------");
    }
}
