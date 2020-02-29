package day44;

public class CyberHouseAction {

    public static void main(String[] args) {

        CyberHouse.neighborhoodNameOnly();
        CyberHouse c1 = new CyberHouse(15,"modern");
        c1.showAllInfo();
        CyberHouse c2 = new CyberHouse(7,"big");
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        CyberHouse.setNeighborhoodName("big street");
        c1.showAllInfo();

        c1.setDesign("OldSchool");
    }
}
