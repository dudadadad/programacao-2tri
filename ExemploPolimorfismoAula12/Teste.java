package ExemploPolimorfismoAula12;

public class Teste 
{
    public static void main(String[] args)
    {
        Operacoes op = new Operacoes();
        System.out.println("somando dois numeros: "+op.soma(5,3));
        System.out.println("somando duas string: "+op.soma("palavra","teste"));
        System.out.println("somando 3 numeros: "+op.soma(5,3, 2));
    }
}

