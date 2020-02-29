package day20;

public class ReversingAString {

    public static void main(String[] args) {

        String name = "Yunus Koc";
        String reversedName = "";

        for (int i = 8; i >= 0 ; i--) {
            System.out.print(i + " index : ");

           char currentChar = name.charAt(i);
           System.out.println(currentChar);

            reversedName = reversedName + name.charAt(i);
        }
        System.out.println(reversedName);

//        System.out.print(name.charAt(8));
//        System.out.print(name.charAt(7));
//        System.out.print(name.charAt(6));
//        System.out.print(name.charAt(5));
//        System.out.print(name.charAt(4));
//        System.out.print(name.charAt(3));
//        System.out.print(name.charAt(2));
//        System.out.print(name.charAt(1));
//        System.out.print(name.charAt(0));
//
//        System.out.println();
//
//        for (int i = 8; i >= 0 ; i--) {
//            System.out.print("index " + i + " : ");
//            System.out.println(name.charAt(i));
//        }

        }

    }

