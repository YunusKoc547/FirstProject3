package day41;

public class TV {

    String name;
    boolean isOn;
    int currentChannel;

    public void setCurrentChannel(int newChannel) {
        if (newChannel < 0 || newChannel > 50) {
            System.out.println("INVALID CHANNEL");
        }

        if (isOn == true) {
            currentChannel = newChannel;
        }else {
            System.out.println("TURN ON THE TV FIRST!");
        }
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void turnOn() {
        if (isOn == false) {
            System.out.println("Turning on TV");
            isOn = true;
        }else {
            System.out.println("TV IS ALREADY ON");
        }
    }

    public void turnOff() {
        if (isOn == true) {
            System.out.println("Turning off TV");
            isOn = false;
        }else {
            System.out.println("TV IS ALREADY OFF!");
        }
    }

    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
