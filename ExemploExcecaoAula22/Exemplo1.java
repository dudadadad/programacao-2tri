package ExemploExcecaoAula22;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);

        int i = 0;
        do
        {
            try
            {
                System.out.println("digite um numero: ");
                int v1 = ler.nextInt();

                System.out.println("digite outro numero: ");
                int v2 = ler.nextInt();
                int resultado = v1 / v2;
                System.out.println(resultado);
            } 
            
            catch (InputMismatchException erro)
            {
                System.out.println("n1 e n2 precisam ser numeros");
            }
            
            catch (ArithmeticException e)
            {
                System.out.println("nao da para dividir por zero!");
                i = 1;
            }
            
            finally
            {
                System.out.println("sempre sera executado...");
            }
//            catch (Exception e) {
//                System.out.println("Algo deu errado hohoho");
//                i = 1;
//                //e.printStackTrace(); para lançar a pilha do erro
//            }
        } while (i != 0);
    }
}

