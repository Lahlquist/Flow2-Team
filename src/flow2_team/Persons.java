package flow2_team;

/**
 * Flow 2 - "Team" Udarbejdet af: Andreas og Laura Torsdag 10.10.2013
 */
//Denne klasse indeholder "get'ere" og "set'ere" for personernes attributter.
public class Persons {

    //Herunder ses de 3 attributter:
    private String name;
    private int alder;
    private String køn;
    private int adminstrator;
    private int analyst;
    private int creative;
    private int finisher;

    public Persons(String name, int alder, String køn) {
        this.name = name;
        this.alder = alder;
        this.køn = køn;
    }

    //Herunder ses de "get'ere" og "set'ere" der er lavet for attributterne:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public String getKøn() {
        return køn;
    }

    public void setKøn(String køn) {
        this.køn = køn;
    }
}
