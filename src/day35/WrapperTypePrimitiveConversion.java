package day35;

public class WrapperTypePrimitiveConversion {

    public static void main(String[] args) {

        Integer num1 = 100; // -->> auto-boxing 100 -->> new Integer(100)

        int num2 = Integer.valueOf("200"); // auto-unboxing into 200
        // THIS CANNOT HAPPEN BY ITSELF
        // int num3 = "200";

        int num3 = Integer.parseInt("200");

        /*
        Integer.parseInt("numberHere")
            it return an int value converted from String
        Integer.valueOf("numberHere")
            it return of an Integer Object by wrapping up the number

            YOU MAY USE WHICHEVER YOU WANT BECAUSE :
            Autoboxing and Auto-unboxing will take care of the conversion anyway
         */

        // Use this number IPR2012-00001 and store the year into an int variable
        // This case number always starts with 3 characters, either IPR, PGR, CBM, DER
        // followed by year, followed by hyphen and 5 digit number
        String caseNumber = "IPR2012-00001";
        System.out.println(getYearOutOfCaseNumber("IPR2012-00001"));
        System.out.println(getYearOutOfCaseNumber("DER2002-00001"));
        System.out.println(getYearOutOfCaseNumber("CBM2019-00001"));

        // get 2012 from int year

        String strYear = caseNumber.substring(3,7);
        int year = Integer.parseInt(strYear);
        System.out.println("strYear = " + strYear);



    }

    public static int getYearOutOfCaseNumber(String caseNumber) {
//        String strYear = caseNumber.substring(3,7);
////        int year = Integer.parseInt(strYear);
////        return year;

        // TODO : Case number should always start with either
                // CMB, IPR, PGR, DER
                // FOLLOWED BY 4 DIGIT NUMBER
                // FOLLOWED BY -
                // AND FOLLOWED BY 5 DIGITS
        if (caseNumber.startsWith("CMB") || caseNumber.startsWith("IPR") || caseNumber.startsWith("PGR") || caseNumber.startsWith("DER")) {
            return Integer.parseInt(caseNumber.substring(3,7));
        }

        return Integer.parseInt(caseNumber.substring(3,7));

    }



}
