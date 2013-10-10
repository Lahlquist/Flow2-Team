package flow2_team;

//Herunder ses de klasser vi har importeret fra Java-biblioteket:
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Flow 2 - "Team"
 * Udarbejdet af:
 * Andreas og Laura
 * Torsdag 10.10.2013
 */

//Denne klasse indeholder metoder til at skrive i tekstfiler.
public class WriteFile
{
    //Herunder ses konstruktøren "WriteFile":
    public WriteFile()
    {
        
    }

    public void saveFile(ArrayList<Person> liste)
    {
        PrintWriter pw;
        
        try
        {
            pw = new PrintWriter("person.txt");
            
            for (int i = 0; i < liste.size(); i++)
            {
                pw.println(liste.get(i).toSaveString());
            }
            
            pw.close(); 
        }
        
        catch (FileNotFoundException ex)
        {
            System.out.println("Fejl: " + ex.getMessage());
        }
    }
    
    public void saveTeam(ArrayList<Team> liste)
    {
        PrintWriter pw;
        
        try
        {
            pw = new PrintWriter("team.txt");
            
            for (int i = 0; i < liste.size(); i++)
            {
                pw.println(liste.get(i).toSaveString());
            }
            
            pw.close(); 
        }
        
        catch (FileNotFoundException ex)
        {
            System.out.println("Fejl: " + ex.getMessage());
        }
    }
}
