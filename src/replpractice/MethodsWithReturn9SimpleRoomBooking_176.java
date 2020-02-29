package replpractice;

public class MethodsWithReturn9SimpleRoomBooking_176 {

    public boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)

    {
        return isAvailable && year == 2018 && (month != 7 || day > 8);


    }
}
