/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flow2_team;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Andreas
 */
public class Team
{
    private String teamname;
    ArrayList<Person> teammembers;

    public Team(String name)
    {
        this.teamname = name;
    }
    
    
    public void addPerson(Person p) {
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
