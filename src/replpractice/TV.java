package replpractice;

public class TV {

    private int channel=1;
    private int volumeLevel=1;
    boolean on=false;
    private String brand = "undefined";

    public TV(){
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV(String brand){
        this.brand=brand;
        System.out.println("Creating TV object using 1 Args- constructor");
    }

    public int getVolumeLevel(){
        return volumeLevel;
    }
    public void setVolumeLevel(int volumeLevel){
        if(on==true){
            if(volumeLevel>1 && volumeLevel<7){
                this.volumeLevel=volumeLevel;
            }else{
                System.out.println("ERROR: TV is either OFF or invalid Volume level");
            }
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }

    }


    public int getChannel(){
        return channel;
    }

    public void setChannel(int channel){
        if(channel<=0 || channel>120){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
            return;//early exit from the method
        }
        if(on==true) {
            this.channel = channel;
        }
    }
    public String getBrand(){

        return brand;
    }
    public void setBrand(String brand){

        this.brand=brand;
    }

    public void channelUp(){
        channel+=1;
    }

    public void channelDown(){
        channel-=1;
    }

    public void volumeUp(){

        volumeLevel+=1;
    }

    public void volumeDown(){
        volumeLevel-=1;
    }

    public void isOn(){
        if(on==true){
            System.out.println("TV is already ON");
        }else{
            System.out.println("TV is already OFF");
        }
    }

    public void turnOn() {
        if (on == false) {
            System.out.println("TV is already ON");
            on = true;
        }
    }
    public void turnOff(){
        if(on==true){
            System.out.println("TV is already OFF");
            on=false;
        }
    }

    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", on=" + on +
                ", brand='" + brand + '\'' +
                '}';
    }



}
