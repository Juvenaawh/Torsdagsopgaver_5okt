// 3.d Create a Building.java class with the following fields (use appropriate types):
//rooms, numberOfBathrooms, numberOfFloors and isOfficeBuilding

import java.util.ArrayList;

public class Building {

    private ArrayList<Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

// 3.e Create a constructor that populates all the fields above.
    Building(ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

// 3.f As the fields of the Building class are private, create getters() for them.
    public ArrayList<Room> getRooms(){
        return rooms;
    }

    public int getNumberOfBathrooms(){
        return numberOfBathrooms;
    }

    public int getNumberOfFloors(){
        return numberOfFloors;
    }

    public boolean getIsOfficeBuilding(){
        return isOfficeBuilding;
    }
}
