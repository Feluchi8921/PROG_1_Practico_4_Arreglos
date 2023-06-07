//Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra precargado,
// solicite al usuario el ingreso de dos números enteros (posiciones del arreglo)
// y ordene de forma creciente el arreglo entre dos posiciones correspondientes a los números ingresados.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class TP_5_Ejercicio_29 {
    public static int MAX=10;
    public static int MINVALOR=1;
    public static int MAXVALOR=10;
    public static void main(String []args){
        int []arrint = new int [MAX];
        cargar_arreglo_int_aleatorio(arrint);
        imprimir_arreglo(arrint);
        int pos1=pedir_numero_imt();
        int pos2=pedir_numero_imt();
        ordenar_arreglo_crec_pos1_pos2(arrint, pos1, pos2);
        imprimir_arreglo(arrint);
    }
    public static void cargar_arreglo_int_aleatorio(int []arr){
        Random r = new Random();
        for(int i=0; i<MAX; i++){
            arr[i]= r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR;
        }
    }
    public static int pedir_numero_imt(){
        int numero=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("\n"+"Ingrese un numero entre 0 y 9");
            numero=Integer.valueOf(entrada.readLine());
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        return numero;
    }
    public static void ordenar_arreglo_crec_pos1_pos2(int []arr, int pos1, int pos2) {
        int aux = 0, inicio = 0, fin = 0;
        if (pos1 < pos2) {
            inicio = pos1;
            fin = pos2;
        } else {
            inicio = pos2;
            fin = pos1;
        }
            for (int j=inicio; j < fin; j++) {
                if (arr[j]>arr[j+1]) {
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    public static void imprimir_arreglo(int []arr){
        for(int i=0; i<MAX; i++){
            System.out.print(arr[i]+" | ");
        }
    }
}
