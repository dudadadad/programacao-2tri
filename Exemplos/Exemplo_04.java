package Exemplos;
import java.util.Scanner;

public class Exemplo_04 
{
    public static void main(String[] args)
    {
       Scanner ler = new Scanner(System.in);
       float nota01;
       float nota02;
       float nota03;
       float nota04;
       float media;
       
       System.out.print("Digite a sua primeira nota do bimestre: ");
       nota01 = ler.nextFloat();
       System.out.print("Digite a sua segunda nota do bimestre: ");
       nota02 = ler.nextFloat();
       System.out.print("Digite a sua terceira nota do bimestre: ");
       nota03 = ler.nextFloat();
       System.out.print("Digite a sua quarta nota do bimestre: ");
       nota04 = ler.nextFloat();
   
       media = (nota01 + nota02 + nota03 + nota04) / 4;
       System.out.println("A sua media do trimestre foi " +media);
    }
}
