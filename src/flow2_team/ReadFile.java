package flow2_team;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Flow 2 - "Team" Udarbejdet af: Andreas og Laura Torsdag 10.10.2013
 */
public class ReadFile
{

    ArrayList personlist = new ArrayList();

    public ArrayList getTxt()
    {
        //Herunder ses referencen til den textfil, der indeholder vores person-data:

        String fileName = "C:\\Users\\Andreas\\Documents\\NetBeansProjects\\Flow2\\build\\classes\\flow2\\names.txt";

        // This will reference one line at a time
        String line = null;



        try
        {
            // FileReader læser tekstfiler i standard encoding.
            FileReader fileReader = new FileReader(fileName);

            // Læser tekst fra en karakter-input stream, buffer tegn, så som at sørge for effektiv læsning af tegn, arrays og linjer.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null)
            {
                personlist.add(line);
            }

            // Lukker filen.
            bufferedReader.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex)
        {
            System.out.println("Error reading file '" + fileName + "'");



        }
        return personlist;
    }
}
