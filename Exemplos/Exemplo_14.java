package Exemplos;
import java.util.Scanner;

public class Exemplo_14 
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite as dimensoes da cozinha: ");
        System.out.printf("Comprimento (em metros): ");
        int comprimento = (int) ler.nextDouble();

        System.out.printf("Largura (em metros): ");
        int largura = (int) ler.nextDouble();

        System.out.printf("Altura (em metros): ");
        int altura = (int) ler.nextDouble();

        System.out.printf("Digite a area das janelas e portas (em metros quadrados): ");
        int areaJanelasPortas = (int) ler.nextDouble();

        int areaTotalParedes = 2 * altura * (comprimento + largura);

        int areaParedesComDesconto = areaTotalParedes - areaJanelasPortas;

        int quantidadeCaixasAzulejos = (int) (areaParedesComDesconto / 1.5);

        System.out.println("A quantidade de caixas de azulejos necessarias sera: " + quantidadeCaixasAzulejos);

        ler.close();
    }
}
