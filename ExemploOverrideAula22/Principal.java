package ExemploOverrideAula22;

public class Principal
{
    public static void main(String[] args)
    {
        Pessoa p1 = new Pessoa();
        p1.setNome("eduarda");
        p1.setSobrenome("oliveira");
        p1.setIdade(17);
        System.out.println(p1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("tyller");
        a1.setSobrenome("felau");
        a1.setIdade(19);
        a1.setMatricula(1234);
        System.out.println(a1.obterDados());
    }
}

