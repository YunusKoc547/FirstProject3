package replpractice;

public class Value {

    int val;
    boolean isModified = false;


    public Value(int num) {
        this.val = num;
    }

    public Value() {
    }

    public void setVal(int num) {
        this.val = num;
        isModified = true;
    }

    public boolean wasModified() {
        return isModified;
    }

    public int getVal() {
        return val;
    }
}
