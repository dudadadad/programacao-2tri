package Exemplos;
import java.util.Scanner;

public class Exemplo_05 
{
    public static void main(String[] args)
    {
       Scanner ler = new Scanner(System.in);
       float metro;
       float resultado;
       
       System.out.print("Digite um valor de metro qualquer: ");
       metro = ler.nextFloat();
       resultado = metro * 100;
      
       System.out.printf("Sua conversao foi: " +resultado);
    
    }
}
