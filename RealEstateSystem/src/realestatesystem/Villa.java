
package realestatesystem;

public class Villa extends Property {
    private boolean hasSwimmingPool;
    private int adjacentStreets;

    public Villa(double area, int rooms, String neighborhood, double price, boolean hasSwimmingPool, int adjacentStreets) {
        super(area, rooms, neighborhood, price);
        this.hasSwimmingPool = hasSwimmingPool;
        this.adjacentStreets = adjacentStreets;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: Villa, Swimming Pool: " + (hasSwimmingPool ? "Yes" : "No") +
                           ", Adjacent Streets: " + adjacentStreets);
    }
}
