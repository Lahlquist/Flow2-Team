package flow2_team;

import java.util.ArrayList;

/**
 * Flow 2 - "Team"
 * Udarbejdet af:
 * Andreas og Laura
 * Torsdag 10.10.2013
 */

//Denne klasse indeholder bl.a. logikken bag vores ArrayList.
public class Control
{
    //
    private ReadFile rf;
    private WriteFile wf;
    
    private ArrayList<Person> people = new ArrayList<>();
    
    //Herunder ses konstruktøren "Control":
    public Control()
    {
        this.rf = new ReadFile();
        this.wf = new WriteFile();
        people = rf.getTxt(people);
    }
    
    public ArrayList<Person> getPeople()
    {
        return people;
    }
    
    public void addPerson(String name, int admin, int analyser, int creative, int finisher)
    {
        Person p = new Person(name, admin, analyser, creative, finisher);
        people.add(p);
    }
    
    public void saveToFile()
    {
        wf.saveFile(people);
    }
}
