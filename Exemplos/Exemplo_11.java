package Exemplos;
import java.util.Scanner;

public class Exemplo_11 
{
    public static void main(String[] args)
    {
       Scanner ler = new Scanner(System.in);
       float lado;
       float area;
       float perimetro;
       
       System.out.print("Digite o lado do quadrado: ");
       lado = ler.nextFloat();
   
       area = lado * lado;
       perimetro = lado * 4;
       
       System.out.printf("Area do quadrado: %.1f\nPerimetro do quadrado: %.1f ", area, perimetro);
    
    }
}
