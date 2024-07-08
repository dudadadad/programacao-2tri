package ObjetosAula22;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

public class Leitura
{
    public static void main(String[] args)
    {
        File arquivo = new File("C:\\Users\\noted\\OneDrive\\Documentos\\NetBeansProjects\\prog_atividades\\src\\ObjetosAula22\\pessoa");
        
        try
        {
            ObjectInputStream leitura = new ObjectInputStream(new FileInputStream(arquivo.getAbsoluteFile()));
        }
        
        catch (FileNotFoundException e)
        {
            System.out.println("o arquivo nao existe.");
        }
        
        catch (IOException e) 
        {
            System.out.println("erro ao ler as informacoes.");
        }
    }
}

