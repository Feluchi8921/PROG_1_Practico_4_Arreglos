public class TP_5_Ej_3 {
    public static int MAX=15;
    public static void main (String []args){
        int []arrint =new int [MAX];
        cargar_arreglo_arrint(arrint);
        imprimir_arreglo_arrint(arrint);
        int promedio=calcular_promedio_arrint(arrint);
        contar_cantidad_numeros_mayores_promedio(arrint, promedio);
        informar_numeros_mayores_promedio(arrint, promedio);
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
    public static int calcular_promedio_arrint(int [] arr){
        int suma=0;
        int promedio;
        for(int i=0; i<MAX;i++){
            suma+=arr[i];
        }

        promedio=(suma/MAX);
        System.out.println("El promedio es: "+promedio);
        return promedio;
    }
    public static void contar_cantidad_numeros_mayores_promedio(int []arr, int promedio){
        int contador=0;
        for(int i=0; i<MAX; i++){
            if(arr[i]>promedio){
                contador++;
            }
        }
        System.out.println("La cantidad de numeros que superan al valor promedio son:"+contador);
    }
    public static void informar_numeros_mayores_promedio(int []arr, int promedio){
        for(int i=0; i<MAX; i++){
            if(arr[i]>promedio){
                System.out.println("["+i+"]="+arr[i]+" > "+promedio);
            }
        }
}
}