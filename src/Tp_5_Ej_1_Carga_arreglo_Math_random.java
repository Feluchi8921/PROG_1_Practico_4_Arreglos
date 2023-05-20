public class Tp_5_Ej_1_Carga_arreglo_Math_random {
    public static int MAX=15;
    public static void main (String []args){
        int []arrint =new int [MAX];
        cargar_arreglo_aleatorio(arrint);
        imprimir_arreglo_aleatorio(arrint);
    }
    public static void cargar_arreglo_aleatorio(int [] arr){
        for(int i=0; i<MAX; i++){
            arr[i] = (int) (Math.random() * 10 + 1);
        }
    }
    public static void imprimir_arreglo_aleatorio(int []arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " | ");
        }
    }
}
