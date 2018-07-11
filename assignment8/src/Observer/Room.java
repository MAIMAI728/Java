package Observer;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by mai on 2017/07/07.
 */
public class Room extends Observable {
    //variable
    private int size;
    //beginning all rooms of the building is locked.
    private boolean locked = true;

    //constructor
    public Room(int size, boolean locked) {
        this.size = size;
        this.locked = locked;
    }

    //getter & setter
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public boolean isLocked() {
        return locked;
    }
    public void setLocked(boolean locked) {
        if(!locked){
            notifyObservers();
        }
        this.locked = locked;
    }


    private List<Observer> managerObserver = new ArrayList<>();


    //method
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : managerObserver){
            observer.update(this,null);
        }

    }
}
