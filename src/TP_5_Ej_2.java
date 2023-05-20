//Hacer un programa que dado un arreglo ya cargado con 10 enteros, calcule el promedio y lo muestre por la consola.
public class TP_5_Ej_2 {
    public static int MAX=15;
    public static void main (String []args){
        int []arrint =new int [MAX];
        cargar_arreglo_arrint(arrint);
        imprimir_arreglo_arrint(arrint);
        calcular_promedio_arrint(arrint);
    }
    public static void cargar_arreglo_arrint(int []arr){
        for(int i=0; i<MAX; i++){
            arr[i]=(int)(Math.random()*10+1);
        }
    }
    public static void imprimir_arreglo_arrint(int []arr){
        for(int i=0; i<MAX; i++){
            System.out.print(arr[i]+" | ");
        }
    }
    public static void calcular_promedio_arrint(int [] arr){
        int suma=0;
        int promedio;
        for(int i=0; i<MAX;i++){
            suma+=arr[i];
        }

        promedio=(suma/MAX);
        System.out.println("El promedio es: "+promedio);
    }

}
