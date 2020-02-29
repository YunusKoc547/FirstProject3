package replpractice;

public class GasTank {

    double amount = 0;
    double capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }

    public void addGas (double gas) {
        if (amount < capacity) {
            amount += gas;
        }else {
            amount = capacity;
        }
    }

    public void useGas(double gasUsed) {
        if (amount > 0) {
            amount -= gasUsed;
        }else {
            amount = 0;
        }
    }

    public boolean isEmpty() {
        if (amount < 0.1) {
            return true;
        }else {
            return false;
        }
    }

    public boolean isFull() {
        if (amount > (capacity - 0.1)) {
            return true;
        }else {
            return false;
        }
    }

    public double getGasLevel() {
        return amount;
    }

    public double fillUp() {
        amount = capacity;
        return capacity - amount;

    }
}
