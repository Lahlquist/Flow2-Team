package flow2_team;

import java.util.ArrayList;

/**
 * Flow 2 - "Team" Udarbejdet af: Andreas og Laura Torsdag 10.10.2013
 */
//Denne klasse indeholder bl.a. logikken bag vores ArrayList.
public class Control
{
    //

    private ReadFile rf;
    private WriteFile wf;
    private ArrayList<Persons> people = new ArrayList<>();
    
    public Control()
    {
        this.rf = new ReadFile();
        this.wf = new WriteFile();
        people = rf.getTxt(people);
        
    }
    
    public ArrayList<Persons> getPeople()
    {
        return people;
    }
    
    public void addPerson(String name, int admin, int analyser, int creative, int finisher)
    {
        Persons p = new Persons(name, admin, analyser, creative, finisher);
        people.add(p);
    }
    
    public void saveToFile()
    {
        wf.saveFile(people);
    }
}
