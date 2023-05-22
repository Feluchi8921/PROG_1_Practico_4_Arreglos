import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TP_5_Ej_7_Corrimiento_derecha {
    public static int MAX=10;
    public static int MAXVALOR=10;
    public static int MINVALOR=1;
    public static void main (String []args){
        int []arrint=new int [MAX];
        cargar_arreglo_int_aleatorio(arrint);
        int pos=ingresar_posicion_consola();
        realizar_corrimiento_derecha(arrint, pos);
    }
    public static void cargar_arreglo_int_aleatorio(int []arr){
        Random r = new Random();
        for(int i=0; i<MAX; i++){
            arr[i]=r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR;
        }
        System.out.println("El arreglo cargado aleatorio es: ");
        imprimir_arreglo(arr);
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
    public static void realizar_corrimiento_derecha(int []arr, int pos){
        System.out.println(pos);
        int indice=MAX-1;
        while(indice>pos){
            arr[indice]=arr[indice-1];
            indice--;
        }
        System.out.println("\n"+"El arreglo con corriento a derecha a partir de la posicion "+pos+" es");
        imprimir_arreglo(arr);
    }
    public static void imprimir_arreglo(int []arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " | ");
        }
    }
}
