import java.util.*;
public class Fionacci {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numero,f1=1,f2=1,i;

        do{
            System.out.print("Introduce un numero: ");
            numero = sc.nextInt();
        }while(numero<=1);

        System.out.println("Los " + numero + " primeros numeros de la serie de Fibonacci son:");

        System.out.print(f1 + " ");
        for(i=2;i<=numero;i++){
            System.out.print(f2 + " ");
            f2 = f1 + f2;
            f1 = f2 - f1;
        }
    }
}