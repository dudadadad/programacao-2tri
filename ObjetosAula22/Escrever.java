package ObjetosAula22;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Escrever
{
    public static void main(String[] args)
    {
        File arquivo = new File("C:\\Users\\noted\\OneDrive\\Documentos\\NetBeansProjects\\prog_atividades\\src\\ObjetosAula22\\pessoa");
        
        try
        {
            ObjectOutputStream escrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            
            //criando objeto pra escrever no arquivo
            Pessoa p1 = new Pessoa();
            p1.setNome("eduarda");
            p1.setSobrenome("oliveira");
            p1.setCpf("04764015004");
            
            //escrever objeto no arquivo
            escrita.writeObject(p1);
            System.out.println("pessoa "+p1.getNome()+" salva com sucesso!");
            escrita.close();
        }
        
        catch (IOException e)
        {
            System.out.println("error ao create arquivo!!");
        }
    }
}

