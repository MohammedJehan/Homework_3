
package realestatesystem;

import java.util.ArrayList;

public class RealEstateAgency {
    private ArrayList<Property> properties;

    public RealEstateAgency() {
        this.properties = new ArrayList<>();
    }

    public void addProperty(Property property) {
        if (properties.size() < 100) {
            properties.add(property);
            System.out.println("Property added successfully!");
        } else {
            System.out.println("Cannot add more properties. Maximum limit reached.");
        }
    }

    public void removeProperty(int index) {
        if (index >= 0 && index < properties.size()) {
            properties.remove(index);
            System.out.println("Property removed successfully!");
        } else {
            System.out.println("Invalid property index.");
        }
    }

    public void displayProperties() {
        if (properties.isEmpty()) {
            System.out.println("No properties to display.");
        } else {
            for (int i = 0; i < properties.size(); i++) {
                System.out.println("Property #" + (i + 1) + ":");
                properties.get(i).display();
                System.out.println();
            }
        }
    }
}
