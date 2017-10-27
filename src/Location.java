import java.util.ArrayList;
import java.util.HashMap;

public class Location {
    //Member variables
    private String magicCompass;
    private String m_moor;
    private String m_locationDescription;
    private String name;
    private ArrayList <Compass> items;
    private HashMap<String, Location> exits;
    private Location murkeyWaters, oceanGrotto, foggyClouds, caveEntrance, caveInside, caveFloor, secretTunnel;

    public void setMagicCompass(String magicCompass) {
        this.magicCompass = magicCompass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItems(ArrayList<Compass> items) {
        this.items = items;
    }

    public String getMagicCompass() {
        return magicCompass;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Compass> getItems() {
        return items;
    }

    public HashMap<String, Location> getExits() {
        return exits;
    }

    public Location getMurkeyWaters() {
        return murkeyWaters;
    }

    public Location getOceanGrotto() {
        return oceanGrotto;
    }

    public Location getFoggyClouds() {
        return foggyClouds;
    }

    public Location getCaveEntrance() {
        return caveEntrance;
    }

    public Location getCaveInside() {
        return caveInside;
    }

    public Location getCaveFloor() {
        return caveFloor;
    }

    public Location getSecretTunnel() {
        return secretTunnel;
    }

    public void setExit(HashMap<String, Location> exits) {
        this.exits = exits;
    }

    public void setMurkeyWaters(Location murkeyWaters) {
        this.murkeyWaters = murkeyWaters;
    }

    public void setOceanGrotto(Location oceanGrotto) {
        this.oceanGrotto = oceanGrotto;
    }

    public void setFoggyClouds(Location foggyClouds) {
        this.foggyClouds = foggyClouds;
    }

    public void setCaveEntrance(Location caveEntrance) {
        this.caveEntrance = caveEntrance;
    }

    public void setCaveInside(Location caveInside) {
        this.caveInside = caveInside;
    }

    public void setCaveFloor(Location caveFloor) {
        this.caveFloor = caveFloor;
    }

    public void setSecretTunnel(Location secretTunnel) {
        this.secretTunnel = secretTunnel;
    }

    //Locations {roomName, description, item}
 public Location(String m_locationDescription){
    this.m_locationDescription = m_locationDescription;
    exits = new HashMap<String, Location>();

}
    public String getM_moor() {
        return m_moor;
    }

    public void setM_moor(String m_moor) {
        this.m_moor = m_moor;
    }

    public String getM_locationDescription() {
        return m_locationDescription;
    }

    public void setM_locationDescription(String m_locationDescription) {
        this.m_locationDescription = m_locationDescription;
    }


}