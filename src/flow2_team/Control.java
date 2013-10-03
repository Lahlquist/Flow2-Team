package flow2_team;

/**
 * Flow 2 - "Team" Udarbejdet af: Andreas og Laura Torsdag 10.10.2013
 */
//Denne klasse indeholder bl.a. logikken bag vores ArrayList.
public class Control
{
    ReadFile rf;
    WriteFile wf;

    public Control()
    {
        this.rf = new ReadFile();
        this.wf = new WriteFile();
    }
}
