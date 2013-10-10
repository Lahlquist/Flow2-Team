package flow2_team;

//Herunder ses den klasse vi har importeret fra Java-biblioteket:
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
    //Herunder ses attributterne:
    private ReadFile rf;
    private WriteFile wf;
    
    //Herunder ses to instantieringer:
    private ArrayList<Person> people = new ArrayList<>();
    private ArrayList<Team> team = new ArrayList<>();

    //Herunder ses metoden "getTeam":
    public ArrayList<Team> getTeam()
    {
        return team;
    }
    
    //Herunder ses metoden "getPeople":
    public ArrayList<Person> getPeople()
    {
        return people;
    }
    
    //Herunder ses konstruktøren "Control":
    public Control()
    {
        this.rf = new ReadFile();
        this.wf = new WriteFile();
        people = rf.getTxt(people);
    }
    
    //Herunder ses metoden "addPerson":
    public void addPerson(String name, int admin, int analyser, int creative, int finisher)
    {
        Person p = new Person(name, admin, analyser, creative, finisher);
        people.add(p);
    }
    
    //Herunder ses metoden "addTeam":
    public void addTeam(String name)
    {
        Team t = new Team(name);
        team.add(t);
    }
    
    //Herunder ses metoden "saveToFile":
    public void saveToFile()
    {
        wf.saveFile(people);
    }
    
    //Herunder ses metoden "saveTeamToFile":
    public void saveTeamToFile()
    {
        wf.saveTeam(team);
    }
}
