package spacewar2;

/**
 * Created by nikjke on 03.11.2016.
 */
public class SpacePort {
    String name;
    SpaceShip spaceShip;
    MissionControlCenter missionControlCenter;

    public void setSpaceShip(SpaceShip spaceShip) {
        this.spaceShip = spaceShip;
    }

    public void setMissionControlCenter(MissionControlCenter missionControlCenter) {
        this.missionControlCenter = missionControlCenter;
    }
}
