package day54;

public class Utility {

    public static void main(String[] args) {

        Wearable w1 = new Clothes();
        wearMyWearable(w1);

        Wearable w2 = new Clothes();
        wearMyWearable(w2);

        Wearable w3 = new Watch();
        wearMyWearable(w3);

        Wearable w4 = new Perfume();
        wearMyWearable(w4);

        Wearable w5 = new Makeup();
        wearMyWearable(w5);
    }

    // create a static method called getMyWearableObject
    // if return a Wearable object (or anything IS-A Wearable)

    public static Wearable getMyWearableObject() {

        return new Clothes();
    }

    public static void wearMyWearable (Wearable any) {
        any.wear();
    }

    public static String getMyString() {
        return new String("bla bla");
    }

}
