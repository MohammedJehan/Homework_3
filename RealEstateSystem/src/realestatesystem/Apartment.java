
package realestatesystem;

public class Apartment extends Property {
    private int floor;
    private boolean hasParkingLot;

    public Apartment(double area, int rooms, String neighborhood, double price, int floor, boolean hasParkingLot) {
        super(area, rooms, neighborhood, price);
        this.floor = floor;
        this.hasParkingLot = hasParkingLot;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: Apartment, Floor: " + floor +
                           ", Parking Lot: " + (hasParkingLot ? "Yes" : "No"));
    }
}
