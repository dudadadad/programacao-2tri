package Exemplos;
import java.util.Scanner;

public class Exemplo_02 
{
    public static void main(String[] args)
    {
       Scanner ler = new Scanner(System.in);
       int numero;
       System.out.print("Digite um numero: ");
       numero = ler.nextInt();
       System.out.printf("O numero informado foi: %d\n", numero);
    }
}
