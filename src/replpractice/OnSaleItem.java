package replpractice;

public class OnSaleItem extends Item{

    /**
     * private instance variable, used for discount percentage
     */
    private double discount;

    /**
     * public constructor for OnSaleItem
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     * @param discount
     *
     * - Calls Super class constructor by passing name,quantity,catalogNumber,price
     * - it will assign the price after deducting(minus) discount from the price
     * - assigns discount
     */
    public OnSaleItem(String name,int quantity,int catalogNumber,double price, double discount) {
        super("hi",1,2,1.0);

    }

    /**
     * getter for discount
     * @return
     */
    public double getDiscount() {
        //TODO
        return 0.0;
    }

    /**
     * setter for discount
     * @param discount
     */
    public void setDiscount(double discount) {

    }

    /**
     * overrides toString from Item:
     *
     * @returns Object description in this format:
     *      * "OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"
     *
     */
    @Override
    public String toString() {
        return "";
    }
}
