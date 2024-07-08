package ExemploExcecaoAula22;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2
{
    public static void main (String[] args)
    {
        Scanner ler = new Scanner(System.in);
        boolean valido = true;

        do
        {
            try 
            {
                System.out.println("digite numero: ");
                int n = ler.nextInt();
                valido = true;
            } 
            
            catch(InputMismatchException e)
            {
                System.out.println("precisam ser valores validos!!");
                ler.next(); //p limpar o buffer do teclado
                valido = false;
            }
        } 
        
        while(!valido);
    }
}

