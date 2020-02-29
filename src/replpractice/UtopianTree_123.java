package replpractice;

public class UtopianTree_123 {

    public static void main(String[] args) {


        int year = 0;
        int treeSize = 0;
        for (int i = 1; i <= 3; i++) {
            treeSize = treeSize + 1;
            year++;
            System.out.println("year " + year + " - growth 1 cm");
            System.out.println("tree size: " + treeSize + "cm");
        }for (int j = 4; j <= 10 ; j++) {
            treeSize = treeSize + 2;
            year++;
            System.out.println("year " + year + " - growth 2 cm");
            System.out.println("tree size: " + treeSize + "cm");
        }

    }
}
