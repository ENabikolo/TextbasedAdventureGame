import javax.swing.text.html.parser.Parser;
import java.util.ArrayList;

public abstract class GamePlan {

    //constructor
    private Location barrenMoor;
    private String Compass;
    private String moor;
    private String locationDescription;
    private String name;

public GamePlan(){
    createLocations();
}

/**
* Create locations and link their exits.
 */
private  void createLocations(){
    Location murkeyWaters, oceanGrotto, foggyClouds, caveEntrance, caveInside, caveFloor, secretTunnel ;

    //create locations
    murkeyWaters = new Location("as far as the eyes can see");
    oceanGrotto = new Location("an ocean Grotto appears up ahead");
    foggyClouds = new Location("Grey foggy clouds loom menacingly above");
    caveEntrance = new Location("you can see a cave Entrance at the bottom of the mountainside");
    caveInside = new Location("you are safe and inside the cave");
    caveFloor = new Location("there is a box on the floor of the cave");
    secretTunnel = new Location("The ocean grotto leads to a secret tunnel");

    //initialise location exit
    murkeyWaters.setExit("East,", oceanGrotto );
    murkeyWaters.setExit("West,", caveEntrance);
    murkeyWaters.setExit("north,", caveInside);
    murkeyWaters.setExit("south,", secretTunnel);

    oceanGrotto.setExit("north,",murkeyWaters);
    oceanGrotto.setExit("east,", caveInside );
    oceanGrotto.setExit("wesr,", murkeyWaters);
    oceanGrotto.setExit("south,",secretTunnel);



    caveEntrance.setExit("east,",oceanGrotto );
    caveEntrance.setExit("west,",caveInside);
    caveEntrance.setExit("north,",murkeyWaters);
    caveEntrance.setExit("south,",secretTunnel);

    secretTunnel.setExit("north,",murkeyWaters);
    secretTunnel.setExit("east,",oceanGrotto );
    secretTunnel.setExit("south,",caveInside);
    secretTunnel.setExit("west,",caveEntrance);
}




}
