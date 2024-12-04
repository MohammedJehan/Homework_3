
package realestatesystem;

public class Property {
    private double area;
    private int rooms;
    private String neighborhood;
    private double price;

    public Property(double area, int rooms, String neighborhood, double price) {
        this.area = area;
        this.rooms = rooms;
        this.neighborhood = neighborhood;
        this.price = price;
    }

    public void display() {
        System.out.println("Property Details:");
        System.out.println("Area: " + area + " m2, Rooms: " + rooms + 
                           ", Neighborhood: " + neighborhood + ", Price: $" + price);
    }
}
