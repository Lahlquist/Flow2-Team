package flow2_team;

import java.util.ArrayList;

/**
 * Flow 2 - "Team" Udarbejdet af: Andreas og Laura Torsdag 10.10.2013
 */
//Denne klasse indeholder bl.a. logikken bag vores ArrayList.
public class Control {

    ReadFile rf;
    WriteFile wf;
    ArrayList<Persons> people;

    public Control() {
        this.rf = new ReadFile();
        this.wf = new WriteFile();
        people = rf.getTxt();
        
    }
    public void addPerson(String name, int age, String køn){
        Persons p = new Persons(name, age, køn);
    }
            
    
}
