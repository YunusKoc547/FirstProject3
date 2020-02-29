package day09;

public class SwitchStatementString {

    public static void main(String[] args) {

        int languageOption = 2;
        String greeting = "";

        switch (languageOption){
            case 1 :
                greeting = "Hello";
                break;
            case 2 :
                greeting = "Salam";
                break;
            case 3 :
                greeting = "Privet";
                break;
            case 4 :
                greeting = "Szia";
                break;
            case 5 :
                greeting = "Merhaba";
                break;
            case 6 :
                greeting = "Hola";
                break;
            case 7 :
                greeting = "Bonjour";
                break;

            default:
                greeting = "Unknown";
        }

        System.out.println(greeting);

    }
}
