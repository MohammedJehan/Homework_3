
package realestatesystem;

public class FurnishedApartment extends Property {
    private int furnitureQuality;

    public FurnishedApartment(double area, int rooms, String neighborhood, double price, int furnitureQuality) {
        super(area, rooms, neighborhood, price);
        this.furnitureQuality = furnitureQuality;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: Furnished Apartment, Furniture Quality: " + furnitureQuality);
    }
}
