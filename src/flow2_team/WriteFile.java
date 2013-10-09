package flow2_team;

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

public class WriteFile
{
    public WriteFile()
    {
        
    }

    public void saveFile(ArrayList<Persons> liste)
    {
        //
        PrintWriter pw;
        
        try
        {
            pw = new PrintWriter("C:\\Users\\Andreas\\Documents\\NetBeansProjects\\Flow2\\build\\classes\\flow2\\names.txt");
            
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
