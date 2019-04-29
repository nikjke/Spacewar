package spacewar2;

/**
 * Created by nikjke on 03.11.2016.
 */
public class Pilot {
    String name;

    public Pilot(String name) {
        this.name = name;
    }

    void sayName() {
        System.out.println("My name is " + name);
    }
}
