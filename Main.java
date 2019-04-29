package spacewar2;

/**
 * Created by nikjke on 03.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot("Юрий");
        pilot.sayName();
        SpaceShip spaceShip = new SpaceShip();
        spaceShip.name = "Союз";
        spaceShip.setPilot(pilot);
        SpacePort baikonur = new SpacePort();
        baikonur.setSpaceShip(spaceShip);
        baikonur.setMissionControlCenter(new MissionControlCenter());
        baikonur.missionControlCenter.setCurrentSpaceShip(spaceShip);
        baikonur.missionControlCenter.launch();
    }
}
