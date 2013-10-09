package flow2_team;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Flow 2 - "Team"
 * Udarbejdet af:
 * Andreas og Laura
 * Torsdag 10.10.2013
 */

public class ReadFile
{
    public ArrayList getTxt(ArrayList<Persons> personlist)
    {
        //Herunder ses referencen til den textfil, der indeholder vores person-data:
        String fileName = "C:\\Users\\Andreas\\Documents\\NetBeansProjects\\Flow2\\build\\classes\\flow2\\names.txt";

        //Dette vil læse én linie ad gangen:
        String line = null;

        try
        {
            //FileReader læser tekstfiler i standard encoding.
            FileReader fileReader = new FileReader(fileName);

            //Læser tekst fra en karakter-input stream, buffer tegn, så som at sørge for effektiv læsning af tegn, arrays og linjer.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null)
            {
                String[] part = line.split(",");
                String navn = part[0];
                int admin = Integer.parseInt(part[1]);
                int anlyser = Integer.parseInt(part[2]);
                int creative = Integer.parseInt(part[3]);
                int finisher = Integer.parseInt(part[4]);

                Persons p = new Persons(navn, admin, anlyser, creative, finisher);
                personlist.add(p);
            }

            // Lukker filen.
            bufferedReader.close();
        }
        
        catch (FileNotFoundException ex)
        {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        
        catch (IOException ex)
        {
            System.out.println("Error reading file '" + fileName + "'");
        }
        
        return personlist;
    }
}
