import java.util.Random;
public class TP_5_Ej_1 {
    public static int MAX=15;
    public static int MINVALOR=1;
    public static int MAXVALOR=10;
    public static void main (String []args){
        int []arrint =new int [MAX];
        cargar_arreglo_arrint(arrint);
        imprimir_arreglo(arrint);
    }
    public static void cargar_arreglo_arrint(int [] arr){
        Random r=new Random();
        for(int i=0; i<MAX; i++){
            arr[i]=(r.nextInt(MAX-MINVALOR+1)+MINVALOR);
        }
    }
    public static void imprimir_arreglo(int []arr){
        for(int i=0; i<MAX; i++){
            System.out.print(arr[i] +" | ");
        }
    }

}
