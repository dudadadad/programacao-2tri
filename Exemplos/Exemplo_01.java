package Exemplos;
import java.util.Scanner;

public class Exemplo_01 
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        System.out.print("Numero inteiro: ");
        numero = ler.nextInt();
        System.out.println("O numero " +numero);
        System.out.print("Numero real: ");
        float numeroReal = ler.nextFloat();
        System.out.println("Numero real: "+numeroReal);
        System.out.printf("Numero real: %.2f\n", numeroReal);
        
        float valorPi = (float)Math.PI;
        float base = 5;
        int expoente = 6;
        double resultado = Math.pow(base,expoente);
    }
}
