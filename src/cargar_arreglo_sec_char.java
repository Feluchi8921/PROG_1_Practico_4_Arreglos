import java.util.Random;
public class cargar_arreglo_sec_char {
    public static final int MAX = 40, MAXVALOR = 9, MINVALOR = 1;
    public static final double probabilidad_letra = 0.4, probabilidad_numero = 0.4;
    public static void main(String[] args) {
        char [] arrchar= new char[MAX];
        int [] arrint = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_char(arrchar);
        imprimir_arreglo_secuencias_char(arrchar);
    }
    public static void cargar_arreglo_aleatorio_secuencias_char(char [] arr){
        Random r = new Random();
        arr[0] = ' ';
        arr[MAX-1] = ' ';
        for (int pos = 1; pos < MAX-1; pos++){
            if (r.nextDouble()>probabilidad_letra){
                arr[pos]=(char)(r.nextInt(26) + 'a');
            }
            else{
                arr[pos]=' ';
            }
        }
    }
    public static void imprimir_arreglo_secuencias_char(char []arr){
        for(int i=0; i<MAX; i++){
            System.out.print(arr[i]+"|");
        }
        System.out.print("\n");
    }
}
