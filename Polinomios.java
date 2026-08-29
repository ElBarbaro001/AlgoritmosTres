import java.util.Scanner;
public class Polinomios{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector:");
        int tam = teclado.nextInt();
        int valor = 0;
        int[] arrpolinomio = new int[tam];
        for(int i=0; i<tam; i++){
            System.out.println("Ingrese para la posicion [" + (i) + "]:");
            valor = teclado.nextInt();
            arrpolinomio[i] = valor;
        }
        System.out.println("Imprimir Arreglo:");
        for(int i=0; i<tam; i++){
            System.out.print(arrpolinomio[i] + " ");
        }
    }
}