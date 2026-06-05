import java.util.Scanner;
public class arreglo {
    public static void main(String[] args){
        int numeros[] = new int[10];
        int sum=0;
        int mayor=Integer.MIN_VALUE;
        int menor=Integer.MAX_VALUE;
        int promedio;
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10; i++){
            System.out.println("Dame un numero");
            numeros[i]= sc.nextInt();
            sum = sum + numeros[i];
            if (numeros[i]>mayor){
                mayor= numeros[i];
            } 
            if (numeros[i]<menor){
                menor= numeros[i];
            }
        }
        promedio= sum/10;
        for (int y=0; y<10;y++){
        System.out.println("Numeros ingresados:"+ numeros[y]);
        }
        System.out.println("Mayor: "+mayor);
        System.out.println("Menor: "+menor);
        System.out.println("Promedio: "+promedio);
    }
}
