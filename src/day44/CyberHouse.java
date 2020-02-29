package day44;

public class CyberHouse {

    int houseNum;
    String design;
    static String neighborhoodName = "Cybertek Ave";

    public CyberHouse(int houseNum, String design) {
        this.houseNum = houseNum;
        this.design = design;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public static String getNeighborhoodName() {
        return neighborhoodName;
    }

    public static void setNeighborhoodName(String neighborhoodName) {
        CyberHouse.neighborhoodName = neighborhoodName;
    }

    public String toString() {
        return "CyberHouse{" +
                "houseNum=" + houseNum +
                ", design='" + design + '\'' +
                ", neighborhoodName= " + neighborhoodName +
                '}';
    }

    public void showAllInfo() {
        System.out.println(toString());
    }

    public static void neighborhoodNameOnly() {
        System.out.println("neighborhoodName = " + neighborhoodName);
    }
}
