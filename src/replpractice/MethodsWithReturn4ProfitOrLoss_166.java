package replpractice;

public class MethodsWithReturn4ProfitOrLoss_166 {


    public String c_profits (int buyPrice,int sellPrice)
    {
        //your code here
        String profit = "profit";
        String loss = "loss";
        String noLoss = "no loss";

        if (buyPrice < sellPrice) {
            return profit;
        }else if (buyPrice > sellPrice) {
            return loss;
        }else {
            return noLoss;
        }



    }
}
