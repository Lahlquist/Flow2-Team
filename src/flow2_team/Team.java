
package flow2_team;

//Herunder ses de klasser vi har importeret fra Java-biblioteket:
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Flow 2 - "Team"
 * Udarbejdet af:
 * Andreas og Laura
 * Torsdag 10.10.2013
 */

public class Team
{
    private String teamname;
    ArrayList<Person> teammembers;

    public Team(String name)
    {
        this.teamname = name;
    }
    
    public void addPerson(Person p)
    {
        teammembers.add(p);
    }
    
    public String toString()
    {
        return teamname;
    }
    
    public String toSaveString()
    {
        return teamname;
    }
}
