package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mai on 2017/07/07.
 */
public class Building {
    //variable
    private String Name;
    private int yearBuild;
    private List<String> roomName;


    //constructor
    public Building(String name, int yearBuild, List<String> roomName) {
        Name = name;
        this.yearBuild = yearBuild;
        this.roomName = roomName;
    }

    //getter & setter
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getYearBuild() {
        return yearBuild;
    }
    public void setYearBuild(int yearBuild) {
        this.yearBuild = yearBuild;
    }
    public List<String> getList() {
        return roomName;
    }
    public void setList(List<String> roomName) {this.roomName = roomName;}

    //method

    //配列の境界(要素数)を宣言している
    List<Room> rooms  = new ArrayList<>();

    public void Open(Integer roomNumber){
//        for(Room room : rooms){
//            room.setLocked(false);
//        }
        rooms.get(roomNumber).setLocked(false);
        System.out.println( "The room x is unlocked");
    }

    public void Close(Integer roomNumber){
        rooms.get(roomNumber).setLocked(true);
        System.out.println( "The room x is locked");
    }

}
