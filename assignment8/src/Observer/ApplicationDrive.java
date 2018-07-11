package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mai on 2017/07/07.
 */
public class ApplicationDrive {
//    private List<Building> observers = new ArrayList<>();

    public static void main(String[] args) {

        Room room1 = new Room(50,true);
        Room room2 = new Room(200,true);

        Manager manager = new Manager();

        Intruder intruder1 = new Intruder();
        Building buiding = new Building();

        room1.addObserver(manager);
        room2.addObserver(manager);

        room1.setLocked(false);
        room2.setLocked(false);
    }
}
