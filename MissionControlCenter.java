package spacewar2;

/**
 * Created by nikjke on 03.11.2016.
 */
public class MissionControlCenter {
    SpaceShip currentSpaceShip;

    public void setCurrentSpaceShip(SpaceShip currentSpaceShip) {
        this.currentSpaceShip = currentSpaceShip;
    }

    void launch() {
        System.out.println("Полет разрешаю");

        for (int i = 10; i > 0; i--) {
            System.out.println("Обратный отсчет: " + i);
        }

        System.out.println("ПУСК!");
    }
}
