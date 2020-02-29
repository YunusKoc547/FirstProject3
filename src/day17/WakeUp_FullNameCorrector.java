package day17;

public class WakeUp_FullNameCorrector {

    public static void main(String[] args) {

        String fullName = "yUNuS kOc";
        String firstName = fullName.substring(0,5); // yUNuS
        String lastName = fullName.substring(6);    // kOc

        String firstNameCorrected = firstName.toUpperCase().substring(0,1) + // "y" -->> "Y"
                firstName.toLowerCase().substring(1);                       // UNuS -->> "unus"

        System.out.println(firstNameCorrected);

        String lastNameCorrected = lastName.toUpperCase().substring(0,1) +
                lastName.toLowerCase().substring(1);
        System.out.println(lastNameCorrected);

        String fullNameCorrected = firstNameCorrected + lastNameCorrected;
        System.out.println(firstNameCorrected + " " + lastNameCorrected);
    }
}
