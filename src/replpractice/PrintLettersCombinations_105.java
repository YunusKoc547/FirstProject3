package replpractice;

public class PrintLettersCombinations_105 {

    public static void main(String[] args) {

        for (char i = 'z'; i >= 'v' ; i--) {
            for (char j = 'z'; j >= 'v'; j--) {
                System.out.println("" + i + j);
            }
        }
    }
}
