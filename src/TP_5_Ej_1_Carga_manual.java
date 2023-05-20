import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TP_5_Ej_1_Carga_manual {
    public static int MAX=6;

    public static void main (String []args){
        int [] arrint =new int [MAX];
        cargar_arreglo_manual(arrint);
        imprimir_arreglo_manual(arrint);
    }
    public static void cargar_arreglo_manual(int []arr){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            int numero;
            for(int i=0; i<MAX; i++) {
                System.out.println("Ingrese un numero entre 1 y 12");
                numero = Integer.valueOf(entrada.readLine());
                if (!(numero >= 1 && numero <= 12)) {
                    System.out.println("El numero ingresado no esta entre 1 y 12");
                    System.out.println("Ingrese un numero entre 1 y 12");
                    numero = Integer.valueOf(entrada.readLine());
                    arr[i] = numero;
                } else {
                    arr[i] = numero;
                }
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
    public static void imprimir_arreglo_manual (int []arr){
        for(int i=0; i<MAX; i++) {
            System.out.print(arr[i] + " | ");
        }
    }
}
