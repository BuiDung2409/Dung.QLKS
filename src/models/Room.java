package models;

public class Room {
    private long roomNumber;
    private String status;
    private long numberOfBedrooms;
    private long numberOfbathrooms;
    private long price;

    public Room() {
    }

    public Room(long roomNumber, String status, long numberOfBedrooms, long numberOfbathrooms, long price) {
        this.roomNumber = roomNumber;
        this.status = status;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfbathrooms = numberOfbathrooms;
        this.price = price;
    }

    public long getPrice() { return price; }

    public void setPrice(long price) { this.price = price; }

    public long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getnumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setnumberOfBedrooms(long numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public long getnumberOfbathrooms() {
        return numberOfbathrooms;
    }

    public void setnumberOfbathrooms(long numberOfbathrooms) {
        this.numberOfbathrooms = numberOfbathrooms;
    }



    @Override
    public String toString() {
        return String.format("%-16s%-26s%-26s%-26s%n", getRoomNumber(), getStatus(), getnumberOfBedrooms(), getnumberOfbathrooms());
    }

}
