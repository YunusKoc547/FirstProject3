package day54;

public class Clothes implements Wearable {

    int size;

    public static void main(String[] args) {

        // try out all the polymorphic assignment
        // according to these relationship
        Clothes c1 = new Clothes();
        Wearable w1 = new Clothes();
        Object o1 = new Clothes();
        c1.wear();

        Watch wa = new Watch();
        Wearable w2 = new Watch();
        Object o2 = new Watch();
        wa.wear();

        Perfume p1 = new Perfume();
        Wearable w3 = new Perfume();
        Cosmetics c2 = new Perfume();
        Object o3 = new Perfume();
        p1.wear();

        Makeup m1 = new Makeup();
        Wearable m2 = new Makeup();
        Cosmetics m3 = new Makeup();
        Object o4 = new Makeup();
        m1.wear();
    }

    @Override
    public void wear() {
        System.out.println("Wearing Clothes");
    }
}

class Watch implements Wearable {


    @Override
    public void wear() {
        System.out.println("Wearing Watches");
    }
}

class Perfume implements Wearable, Cosmetics {


    @Override
    public void wear() {
        System.out.println("Wearing Perfumes");
    }
}

class Makeup implements Wearable, Cosmetics {


    @Override
    public void wear() {
        System.out.println("Wearing makeup");
    }
}
