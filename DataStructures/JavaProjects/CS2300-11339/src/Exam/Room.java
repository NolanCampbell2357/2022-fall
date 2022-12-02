package Exam;

public class Room implements Comparable<Room>{
    public int roomNum, capacity;
    public double price;
    public String type;

    public Room(int roomNum) {
        this.roomNum = roomNum;

        this.capacity=0;
        this.price=0;
        this.type="";
    }

    public Room(int roomNum, String type, int capacity, double price) {
        this.roomNum = roomNum;
        this.type=type;
        this.capacity=capacity;
        this.price=price;
    }


    @Override
    public boolean equals(Object o) {
        Room room = (Room)o;
        return room.roomNum == this.roomNum;
    }

    @Override
    public int compareTo(Room room) {
        if(this.price > room.price) {
            return 1;
        } else if (this.price < room.price) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Room(%d, %s, %d, %.2f)", roomNum, type, capacity, price);
    }
}
