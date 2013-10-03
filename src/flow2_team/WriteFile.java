package flow2_team;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Flow 2 - "Team" Udarbejdet af: Andreas og Laura Torsdag 10.10.2013
 */
public class WriteFile
{

    public WriteFile()
    {
        //-- demo - write text file - catch Exception
        PrintWriter pw = null;
        try
        {
            pw = new PrintWriter("C:\\Users\\Andreas\\Documents\\NetBeansProjects\\Flow2\\build\\classes\\flow2\\names.txt");
        } catch (FileNotFoundException ex)
        {
            System.out.println("Error opening file");
        }
        //-- demo - write
        pw.println("text1, 1");
        pw.println("text2, 1, 2");
        pw.println("text3, 1, 2, 3");
        pw.close();
    }
}
