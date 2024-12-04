
package realestatesystem;

public class RealEstateSystem {

    public static void main(String[] args) {
        RealEstateAgency agency = new RealEstateAgency();

        agency.addProperty(new Villa(350, 5, "Downtown", 500000, true, 2));
        agency.addProperty(new Apartment(120, 3, "Suburb", 150000, 3, true));
        agency.addProperty(new FurnishedApartment(90, 2, "City Center", 200000, 1));

        System.out.println("All Listed Properties:");
        agency.displayProperties();

        agency.removeProperty(1);

        System.out.println("Properties After Removal:");
        agency.displayProperties();
    }
    
}
