package Exemplos;
import java.util.Scanner;

public class Exemplo_06 
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
       
        System.out.printf("Insira o raio do circulo: ");
        float raio = ler.nextFloat();
        double area = Math.PI*Math.pow(raio, 2);
        
        System.out.printf("A area: %.2f", area);
        
    }
}
