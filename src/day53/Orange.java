package day53;

public class Orange extends Fruit {

    int vCLevel;

    public Orange(String taste, String color, int vCLevel) {
        super(taste, color);
        this.vCLevel = vCLevel;
    }

    @Override
    public void getDigested() {
        System.out.println("Orange with Vitamin C level " + vCLevel
                + " has color " + color
                + " and it has " + taste + " taste when you digest");
    }

    @Override
    public String toString() {
        return "Orange{" +
                "vCLevel=" + vCLevel +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
