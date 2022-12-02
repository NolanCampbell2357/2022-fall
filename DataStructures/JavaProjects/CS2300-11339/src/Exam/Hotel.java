package Exam;

import java.util.ArrayList;
import java.util.Collections;

public class Hotel {
    static ArrayList<Room> getListOfRoom(String[] lines){
        // Define a new empty list of rooms
        ArrayList<Room> rooms = new ArrayList<Room>();

        // For each string in lines
        //      Split it using comma(",")
        //      Convert some words to int or double if necessary.
        //      trim() may be necessary to remove leading/trailing spaces
        //      create an instance of Room and add it to the list of rooms
        // return the list of rooms

        for(String line : lines) {
            String[] params = line.split(",");

            int roomNum = Integer.parseInt(params[0].trim());
            String type = params[1].trim();
            int capacity = Integer.parseInt(params[2].trim());
            double price = Double.parseDouble(params[3].trim());

            rooms.add(new Room(roomNum, type, capacity, price));
        }
        return rooms;
    }
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(new Room(310, "King", 3, 110.99));
        rooms.add(new Room(110, "Queen", 2, 59.99));
        rooms.add(new Room(210, "D Queen", 4, 89.99));

        System.out.println(rooms); // [Room(310,King,3,$110.99), Room(110,Queen,2,$59.99), Room(210,D Queen,4,$89.99)]
        System.out.println(rooms.contains(new Room(110))); // true
        System.out.println(rooms.contains(new Room(120))); // false
        System.out.println(rooms.indexOf(new Room(210))); // 2
        Collections.sort(rooms); // Make the class 'Room' comparable based on 'price'
        System.out.println(rooms); // [Room(110,Queen,2,$59.99), Room(210,D Queen,4,$89.99), Room(310,King,3,$110.99)]

        String[] lines = {"310, King, 3, 110.99", "110, Queen, 2, 59.99"};
        System.out.println(getListOfRoom(lines)); // [Room(310,King,3,$110.99), Room(110,Queen,2,$59.99)]
    }
}