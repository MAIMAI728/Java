package Observer;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by mai on 2017/07/07.
 */
public class Manager implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("All rooms are unlocked. Not safe anymore");
    }

}