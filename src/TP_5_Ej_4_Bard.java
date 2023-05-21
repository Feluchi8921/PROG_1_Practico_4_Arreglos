import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class TP_5_Ej_4_Bard {
    public static int MAX=10;
    public static void main(String[] args) {
        // Creo el arreglo de caracteres de tamaño 10
        char[] arrchar = new char[MAX];
        cargar_arreglo_caracteres_aleatorio(arrchar);
        imprimir_arreglo(arrchar);
        char caracter = solicitar_caracter_consola();
        buscar_posicion_caracter(caracter, arrchar);

    }
        public static void cargar_arreglo_caracteres_aleatorio(char []arr){
            // Creo el objeto random
            Random r = new Random();
            // Cargo el arreglo aleatorio de caracteres
            for (int i = 0; i < MAX; i++) {
                arr[i] = (char) (r.nextInt(26) + 'a');
            }
        }
        public static void imprimir_arreglo(char []arr) {
            for (int i = 0; i < MAX; i++) {
                System.out.print(arr[i] + " | ");
            }
        }
        public static char solicitar_caracter_consola(){
            // Pedir un elemento por consola
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            char caracter=' ';
            try{
                System.out.println("Ingrese un caracter:");
                caracter = entrada.readLine().charAt(0);
            }
            catch(Exception exc){
                System.out.println(exc);
            }
            return caracter;
        }
        public static void buscar_posicion_caracter(char caracter, char []arr) {
            // Busco el caracter en el arreglo
            int posicion = -1;
            for (int i = 0; i < MAX; i++) {
                if (arr[i] == caracter) {
                    posicion = i;
                    System.out.println(posicion + " y " + caracter);
                }
                else if((posicion==(MAX-1)) && (arr[MAX-1]==caracter)){
                    System.out.println("El caracter ingresado no se encuentra en el arreglo");
                }
            }
        }

    }
