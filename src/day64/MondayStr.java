package day64;

public class MondayStr {

    public static void main(String[] args) {

        String str = "All lanes are currently closed. There was accident. Commuters' should avoid the area. ";


        String[] strArr = str.split("[\\s .']");
        String longestWord = strArr[0];
        for (String currentWord : strArr) {
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }
        }

        System.out.println(longestWord);

        int[] arr = {1,2,5,3,8,7,9,4};
        int largestNumber = arr[0];
        int secondLargestNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNumber) {
                largestNumber = arr[i];
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > secondLargestNumber && arr[j] < largestNumber) {
                    secondLargestNumber = arr[j];
                }
            }
        }
        System.out.println(secondLargestNumber);



    }
}
