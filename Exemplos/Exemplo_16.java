package Exemplos;
import java.util.Scanner;

public class Exemplo_16 
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe o comprimento da pista (em metros): ");
        double comprimentoPista = ler.nextDouble();

        System.out.printf("Informe o numero total de voltas a serem percorridas: ");
        int numeroVoltasTotal = ler.nextInt();

        System.out.printf("Informe o numero de reabastecimentos desejados: ");
        int numeroReabastecimentos = ler.nextInt();

        System.out.printf("Informe o consumo de combustivel do carro (em Km/L): ");
        double consumoCombustivel = ler.nextDouble();

        double distanciaTotal = comprimentoPista * numeroVoltasTotal / 1000.0; // Convertendo metros para quilômetros

        int numeroVoltasEntreReabastecimentos = numeroVoltasTotal / (numeroReabastecimentos + 1);

        double distanciaAteReabastecimento = comprimentoPista * numeroVoltasEntreReabastecimentos / 1000.0; // Convertendo metros para quilômetros

        double litrosNecessarios = distanciaAteReabastecimento / consumoCombustivel;

        System.out.println("O numero minimo de litros necessarios para percorrer ate o primeiro reabastecimento sera: " + litrosNecessarios + " litros.");

        ler.close();
    }

}
