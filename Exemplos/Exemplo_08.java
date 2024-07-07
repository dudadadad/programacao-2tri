package Exemplos;
import java.util.Scanner;

public class Exemplo_08 
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        float altura;
        float peso;
        float imc;
        
        System.out.print("Insira a sua altura: ");
        altura= ler.nextFloat();
        System.out.print("Insira o peso: ");
        peso= ler.nextFloat();
        
        imc = peso /(altura * 2);
        System.out.printf("Seu IMC: %.2f", imc);
    }
}
