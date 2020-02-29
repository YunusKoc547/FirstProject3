package replpractice;

import java.util.Scanner;

public class ParseHTML_102 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();

        if(! html.contains("<html>")){
            System.out.println("Invalid input!");

        }else{
            html = html.substring( html.indexOf("id=\"")+4 , html.lastIndexOf('"'));
            System.out.println(html);
        }


    }
}
