package Exemplos;
import java.util.Scanner;

public class Exemplo_13 
{
    public static void main(String[] args)
    {
       Scanner ler = new Scanner(System.in);
       float num01;
       float num02;
       
       System.out.print("Digite o primeiro numero: ");
       num01 = ler.nextFloat();
       System.out.print("Digite o segundo numero: ");
       num02 = ler.nextFloat();
       
       double letraA = Math.pow(num01, num02);
       System.out.printf("O resultado da potencia sera: %.1f\n", letraA);
       
       float letraB = num01 * num02;
       System.out.printf("O resultado da multiplicacao sera: %.1f\n", letraB);
       
       float letraC = (1/num01);
       System.out.printf("O resultado do numero inverso do primeiro valor sera: %.1f\n", letraC);
       
       float letraD = num02 + (num01/2);
       System.out.printf("O resultado da soma do segundo numero com a metade do primeiro numero sera: %.1f\n", letraD);
       
       float letraE = num02 - num01;
       System.out.printf("O resultado da diferenca do primeiro numero com o segundo sera: %.1f\n", letraE);
       
       float letraF = (num01 *(-1));
       System.out.printf("O resultado do numero oposto do primeiro valor sera: %.1f\n", letraF);
    }
}
