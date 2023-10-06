import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

// 3.g In your main method, instantiate at least three different rooms.
    Room bedroom = new Room(2,6, 4);
    Room bathroom = new Room(1, 2, 1);
    Room kitchen = new Room(1, 9, 3);
    Room livingroom = new Room(2, 5, 5);

// 3.h Add the three rooms to a collection (preferably of the same data type used for the "rooms" field in your Building.java class).
        ArrayList<Room> floorplan = new ArrayList<>();
        floorplan.add(bedroom);
        floorplan.add(bathroom);
        floorplan.add(kitchen);
        floorplan.add(livingroom);

// 3.i In your main method, instantiate a new building.
    Building building1 = new Building(floorplan, 11, 5, false);

    System.out.println("Number of lamps in the building: " + countLampsInBuilding(building1));

    if(isNormal(building1)){
        System.out.println("This building is quite normal");
    }
    else{
        System.out.println("This is an odd building");
    }

    }

// 3.j create a static method in Main, countLampsInBuilding, that takes an object of type Building,
// and returns the total number of lamps in the entire building.
    private static int countLampsInBuilding(Building b){
        int sum = 0;
        for(Room r: b.getRooms()) {
            sum += r.getNumberOfLamps();
        }
        return sum;
    }

// 3.k create another static method in Main, isNormal, that takes an object of type Building.
// The method should return true if the Building's numberOfFloors is greater than its number of Rooms.
// If not it should print "This is an odd building" and return false.
    private static boolean isNormal(Building b) {
        if (b.getNumberOfFloors() > b.getRooms().size()) {
            return false;
        } else {
            return true;
        }
    }
}