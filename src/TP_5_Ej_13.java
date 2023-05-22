//Hacer un programa que inserte un elemento en un arreglo (ordenado decrecientemente) de tamaño MAX=10.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class TP_5_Ej_13 {
    public static int MAX=10;
    public static int MINVALOR=1;
    public static int MAXVALOR=10;
    public static void main (String []args){
        int []arrint = new int [MAX];
        cargar_arreglo_aleatorio(arrint);
        imprimir_arreglo(arrint);
        ordenar_arreglo_decreciente(arrint);
        imprimir_arreglo(arrint);
        int numero=solicitar_numero_consola();
        insertar_numero(arrint, numero);
    }
    public static void cargar_arreglo_aleatorio(int []arr){
        Random r = new Random();
        for(int i=0; i<MAX; i++){
            arr[i]=r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR;
        }
    }
    public static void ordenar_arreglo_decreciente(int []arr){
            int aux;
            for(int i=1;i<MAX;i++){
                for(int j=0; j<MAX-1;j++){
                    if (arr[j]<arr[j+1]) {
                        aux = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=aux;
                    }
                }
            }
            System.out.println("\n"+"El arreglo ordenado decreciente es: ");
        }
    public static int solicitar_numero_consola(){
        int numero=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("\n"+"Ingrese un numero");
            numero=Integer.valueOf(entrada.readLine());
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        return numero;
    }
    public static void insertar_numero(int []arr, int numero){
        int i=0;
        while(i<MAX){
            if(arr[i]<numero){
                corrimiento_derecha(arr, i, numero);
                break;
            }
            else{
                i++;
            }
        }
    }
    public static void corrimiento_derecha(int []arr, int i, int numero){
        int indice=MAX-1;
        while(i<indice){
            arr[indice]=arr[indice-1];
            indice--;
        }
        arr[i]=numero;
        imprimir_arreglo(arr);
    }
    public static void imprimir_arreglo(int []arr){
        for(int i=0; i<MAX; i++){
            System.out.print(arr[i]+" | ");
        }
    }
    }
