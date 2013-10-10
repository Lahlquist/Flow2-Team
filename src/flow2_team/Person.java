package flow2_team;

/**
 * Flow 2 - "Team"
 * Udarbejdet af:
 * Andreas og Laura
 * Torsdag 10.10.2013
 */

//Denne klasse indeholder bl.a. "get'ere" og "set'ere" for personernes attributter.
public class Person
{
    //Herunder ses konstruktøren "Person":
    public Person(String name, int adminstrator, int analyst, int creative, int finisher)
    {
        this.name = name;
        this.adminstrator = adminstrator;
        this.analyst = analyst;
        this.creative = creative;
        this.finisher = finisher;
    }
    
    //Herunder attributterne:
    private String name;
    private int adminstrator;
    private int analyst;
    private int creative;
    private int finisher;

    public int getAdminstrator()
    {
        return adminstrator;
    }

    public void setAdminstrator(int adminstrator)
    {
        this.adminstrator = adminstrator;
    }

    public int getAnalyst()
    {
        return analyst;
    }

    public void setAnalyst(int analyst)
    {
        this.analyst = analyst;
    }

    public int getCreative()
    {
        return creative;
    }

    public void setCreative(int creative)
    {
        this.creative = creative;
    }

    public int getFinisher()
    {
        return finisher;
    }

    public void setFinisher(int finisher)
    {
        this.finisher = finisher;
    }

    public Person(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name + "," + adminstrator + "," + analyst + "," + creative + "," + finisher;
    }
    
    public String toSaveString()
    {
        return name + "," + adminstrator + "," + analyst + "," + creative + "," + finisher;
    }
}
