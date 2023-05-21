import java.util.Random;
public class TP_5_Ej_5_Caracteres {
    public static int MAX=10;
    public static int MAXVALOR=10;
    public static int MINVALOR=1;
    public static void main (String []args){
        char []arrchar=new char [MAX];
        cargar_arreglo_char_aleatorio(arrchar);
        invertir_orden_arreglo(arrchar);
    }
    public static void cargar_arreglo_char_aleatorio(char []arr){
        Random r = new Random();
        for(int i=0; i<MAX; i++){
            arr[i]=(char)(r.nextInt(26) + 'a');
        }
        System.out.println("El arreglo cargado aleatorio es: ");
        imprimir_arreglo(arr);
    }
    public static void invertir_orden_arreglo(char []arr){
        for(int i=0; i<MAX/2;i++){
            char aux=arr[(MAX-1)-i];
            arr[(MAX-1)-i]=arr[0+i];
            arr[0+i]=aux;
        }
        System.out.println("\n"+"El arreglo invertido es: ");
        imprimir_arreglo(arr);
    }
    public static void imprimir_arreglo(char []arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " | ");
        }
    }
}
