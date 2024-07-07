package Atividade11Contas;

 class ContaCorrente extends Conta
 {
    private float limite;

    public ContaCorrente(String titular, String senha, float limite)
    {
        super(titular, senha); // ta chama o construtor da classe pai (Conta)
        this.limite = limite;
    }

    public boolean sacar(float valor)
    {
        if (valor > 0 && valor <= (saldo + limite))
        {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo);
            return true;
        }
        
        else
        {
            System.out.println("Saldo insuficiente ou valor de saque invalido.");
            return false;
        }
    }

    public String verificaSaldo()
    {
        return "Saldo atual: R$ " + saldo + ", Limite disponível: R$ " + limite;
    }


}


    