package Exemplos;
import java.util.Scanner;

public class Exemplo_12 
{
    public static void main(String[] args)
    {
       Scanner ler = new Scanner(System.in);
       float base;
       float altura;
       float area;
       
       System.out.print("Digite a base do triangulo: ");
       base = ler.nextFloat();
       System.out.print("Digite a altura do triangulo: ");
       altura = ler.nextFloat();
   
       area = (base * altura)/2;
       
       System.out.printf("Area do triangulo: %.2f", area);
    }
}
