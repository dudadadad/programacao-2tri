package Exemplos;
import java.util.Scanner;

public class Exemplo_07 
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        float numHoras;
        float salario;
        float resultado;
        
        System.out.print("Insira o seu salario por hora: ");
        numHoras= ler.nextFloat();
        System.out.print("Insira o seu numero de horas trabalhadas por mes: ");
        salario= ler.nextFloat();
        
        resultado = salario * numHoras;
        System.out.printf("O total do seu salario no referido mes foi: %.2f", resultado);
    }
}
