package Exemplos;
import java.util.Scanner;

public class Exemplo_10 
{
    public static void main(String[] args)
    {
       Scanner ler = new Scanner(System.in);
       float num01;
       float num02;
       float soma;
       float multiplicacao;
       
       System.out.print("Digite o primeiro numero: ");
       num01 = ler.nextFloat();
       System.out.print("Digite o segundo numero: ");
       num02 = ler.nextFloat();
   
       soma = num01 + num02;
       multiplicacao = num01 * num02;
       
       System.out.printf("Resultado da soma: %.1f\nResultado da multiplicacao: %.1f ", soma, multiplicacao);
 
    }
}
