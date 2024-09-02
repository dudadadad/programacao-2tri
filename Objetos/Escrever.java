package Objetos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Escrever 
{
    public static void main(String[] args)
    {
        File arquivo = new File("C:/Users/User/OneDrive/Área de Trabalho/Programação/Aula22/pessoa.db");
        try
        {
            ObjectOutputStream escrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            Pessoa p1 = new Pessoa();
            p1.setNome("Eduarda");
            p1.setSobrenome("Oliveira");
            p1.setCpf("04793634044");
        
            escrita.writeObject(p1);
            System.out.println("Pessoa "+p1.getNome()+" salva com sucesso");
            escrita.close();
        }
        
        catch (IOException e)
        {
            System.out.println("Erro ao criar arquivo!!");
        }
    }
}
