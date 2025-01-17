package sevices;

import models.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomService implements Management<Room> {

    static List<Room> roomList = new ArrayList<>();

    static {
        Room room1 = new Room(1, "Phòng Trống", 2, 4, 200);
        Room room2 = new Room(2, "Phòng Trống", 4, 6, 500);
        Room room3 = new Room(3, "Phòng Trống", 6, 8, 1000);
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
    }


    @Override
    public Room finById(long id) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getRoomNumber() == id) {
                return roomList.get(i);
            }
        }
        return null;
    }

    @Override
    public void printlist() {
        System.out.printf("%-16s%-26s%-26s%-26s%n", "Room Number:", "Status:", "Number Of Bed rooms", "Number Of Bath Rooms");
        for (int i = 0; i < roomList.size(); i++) {
            System.out.println(roomList.get(i));
        }
    }

    @Override
    public void updateById(long id, Room room) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getRoomNumber() == id) {
                roomList.get(i).setStatus(room.getStatus());
                break;
            }
        }
    }

    @Override
    public void add(Room room) {
        room.setRoomNumber(roomList.size() + 1);
        roomList.add(room);
    }

    @Override
    public void delete(long id) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getRoomNumber() == id) {
                roomList.remove(i);
                return;
            }
        }
    }
}
