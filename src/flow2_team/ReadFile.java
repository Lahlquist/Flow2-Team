/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flow2_team;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Andreas
 */
public class ReadFile
{
    // The name of the file to open.

    String fileName = "C:\\Users\\Andreas\\Documents\\NetBeansProjects\\Flow2\\build\\classes\\flow2\\Names.txt";
    // This will reference one line at a time
    String line = null;

    
    {
        try
        {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }

            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println(
                    "Unable to open file '"
                    + fileName + "'");
        } catch (IOException ex)
        {
            System.out.println(
                    "Error reading file '"
                    + fileName + "'");
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}
