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
    private ArrayList<Team> team = new ArrayList<>();

    public ArrayList<Team> getTeam()
    {
        return team;
    }
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
    public void addTeam(String name){
        Team t = new Team(name);
        team.add(t);
    }
    
    public void saveToFile()
    {
        wf.saveFile(people);
    }
    
    public void saveTeamToFile(){
        wf.saveTeam(team);
    }
}
