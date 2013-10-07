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

    ArrayList<Persons> liste;

    public WriteFile()
    {
        //-- demo - write text file - catch Exception
        PrintWriter pw = null;
        try
        {
            pw = new PrintWriter("C:\\Users\\Darkeonz\\Documents\\NetBeansProjects\\names.txt");
        } catch (FileNotFoundException ex)
        {
            System.out.println("");
        }
        for (int i = 1; i < liste.size(); i++)
        {
            pw.println(liste.get(i).getName());
        }

    }
}
