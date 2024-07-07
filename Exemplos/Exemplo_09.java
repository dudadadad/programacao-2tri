package Exemplos;
import java.util.Scanner;

public class Exemplo_09 
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        float tempF;
        float tempC;
    
        System.out.print("Insira a temperatura em graus Fahrenheit: ");
        tempF= ler.nextFloat();
        
        tempC = (5 * (tempF - 32) / 9);
        System.out.printf("Temperatura em graus Celsius: %.2f", tempC);
    }
}
