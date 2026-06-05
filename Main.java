import java.util.Scanner;
public class Main{
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);  
    int numero;
    int sum=0;
    int promedio;
    int mayor=Integer.MIN_VALUE;
    for (int i=0 ; i<10 ; i++){
    System.out.println("Dame un numero");
    numero = sc.nextInt();
    sum = sum + numero;
    if (numero>mayor){
        mayor=numero;
    }
    }
    promedio = sum/10;
    System.out.println("El numero promedio de tus numero es="+ promedio +"y numero mayor de los que pusiste es ="+  mayor );
}
}