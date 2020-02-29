package day35;

public class StringParsingPractice {

    public static void main(String[] args) {

        String sentence = "I bought 3 tomatoes and the price was 3.14 each";
        // How much is your final checkout price
        // HINT :
        // The count is always 3rd word
        // The price is always at 2nd to last word

            // LOGIC : split by space, parse count and price, do calculation
        String[] sentenceSplit = sentence.split(" ");
        int count = Integer.parseInt(sentenceSplit[2]);
        String priceString = sentenceSplit[sentenceSplit.length-2];
        double price = Double.parseDouble(priceString);

        System.out.println("Total price is " + count * price);

    }
}
