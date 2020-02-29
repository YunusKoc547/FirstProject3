package day26;

public class SwappingValues {

    public static void main(String[] args) {
        
        String name1 = "Emma";
        String name2 = "Jason";
        
        String tempContainer = name1;
        name1 = name2;
        name2 = tempContainer;

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);



        int[] myNumbers = new int[] {10,40,30,7};

        int temp = myNumbers[0];
        myNumbers[0] = myNumbers[3];
        myNumbers[3] = temp;

        System.out.println("first item = " + myNumbers[0]);
        System.out.println("last item = " + myNumbers[3]);

    }
}
