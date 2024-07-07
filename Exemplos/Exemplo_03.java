package Exemplos;
import java.util.Scanner;

public class Exemplo_03 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = new Scanner(System.in).next();
        System.out.printf("Bem-vindo(a), %s\n", nome);

        scanner.nextLine(); // Limpa o buffer do teclado antes de ler o nome completo

        System.out.print("Insira seu nome completo: ");
        String nomeCompleto = new Scanner(System.in).nextLine();
        System.out.println("Bem-vindo(a), " + nomeCompleto);
    }
    
}
