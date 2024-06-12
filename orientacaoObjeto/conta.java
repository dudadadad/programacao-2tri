package orientacaoObjeto;

public class conta
{
    String titular;
    String identificador;
    String senha; 
    float saldo;

    public conta(String titular, String identificador, String senha, float saldoInicial)
    {
        this.titular = titular;
        this.identificador = identificador;
        this.senha = senha;
        this.saldo = saldoInicial;
    }

    public void depositar(float valor)
    {
        if (valor > 0)
        {
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo);
        }
        
        else 
        {
            System.out.println("Valor de deposito invalido.");
        }
    }

    public boolean sacar(float valor)
    {
        if (valor > 0 && valor <= saldo)
        {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo);
            return true;
        }
        
        else
        {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
            return false;
        }
    }

    public float consultarSaldo()
    {
        return saldo;
    }

    public boolean verificarSenha(String senhaDigitada)
    {
        return senha.equals(senhaDigitada);
    }
}