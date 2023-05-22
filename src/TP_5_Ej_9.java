//Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra cargado,
// solicite al usuario un número entero y lo agregue al principio del arreglo (posición 0).
// Para ello tendrá que realizar un corrimiento a derecha (se pierde el último valor del arreglo)
// y colocar el número en el arreglo en la posición indicada.
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP_5_Ej_9 {
    public static int MAX=10;
    public static int MINVALOR=1;
    public static int MAXVALOR=10;
    public static void main (String []args){
        int [] arrint = new int [MAX];
        cargar_arrelo_int_aleatorio(arrint);
        imprimir_arreglo(arrint);
        int numero=solicitar_int_consola();
        realizar_corrimiento_derecha(arrint, numero);
    }
    public static void cargar_arrelo_int_aleatorio(int []arr){
        Random r = new Random();
        for(int i=0; i<MAX; i++){
            arr[i]=r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR;
        }
        System.out.println("El arreglo es: ");
    }
    public static int solicitar_int_consola(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero=0;
        try{
            System.out.println("\n"+"Ingrese un numero entero");
            numero=Integer.valueOf(entrada.readLine());
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        return numero;
    }
    public static void realizar_corrimiento_derecha(int []arr, int numero){
        int indice=MAX-1;
        while(indice>0){
            arr[indice]=arr[indice-1];
            indice--;
        }
        System.out.println("\n"+"El arreglo luego del corrimiento es: ");
        imprimir_arreglo(arr);
        arr[0]=numero;
        System.out.println("\n"+"El arreglo luego insertar el numero ingresado en la posicion 0 es: ");
        imprimir_arreglo(arr);
    }
    public static void imprimir_arreglo(int []arr){
        for(int i=0; i<MAX; i++){
            System.out.print(arr[i]+" | ");
        }
    }
}
