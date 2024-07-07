package Exemplos;
import java.util.Scanner;

public class Exemplo_15 
{
    public static void main (String[] args)
    {
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Odometro no inicio do dia: ");
        int km1 = ler.nextInt();
        
        System.out.printf("Odometro no final do dia: ");
        int km2 = ler.nextInt();
        
        System.out.printf("Valor recebido: ");
        float dindin = ler.nextFloat();
        
        System.out.printf("Gastou de combustivel: ");
        float litros = ler.nextFloat();
        
        double mediaConsumo = (km2 - km1) / litros;
        
        double lucro = dindin-litros * 4.15;
        
        System.out.printf("Media do consumo: %.2f\nLucro liquido: %.2f", mediaConsumo, lucro);
    }
}
