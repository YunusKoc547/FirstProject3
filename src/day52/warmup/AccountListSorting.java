package day52.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {

    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();
        accountList.add(   new Account("John Snow", 10000)   );
        accountList.add(   new Account("Vald", 11000)   );
        accountList.add(   new Account("Sventlana", 13000)   );
        accountList.add(   new Account("Muhammad", 8000)   );
        accountList.add(   new Account("Emme", 17000)   );
        accountList.add(   new Account("Ata", 15000)   );
        System.out.println("accountList before = \n" + accountList);
        Collections.sort(accountList);
        System.out.println("accountList after = \n" + accountList);

        // Create another account with your name :
        // transfer everyone's money to your account

        Account myAccount = new Account("Muge",0);

        for (Account eachAccount : accountList) {
            eachAccount.transferAll(myAccount);
        }
        System.out.println("myAccount = " + myAccount);





        Account a1 = new Account("Polymorphism", 10000);
        Transferable t1 = new Account("Polymorphism2",10000);
        Object o1 = new Account("Polymorphism3",10000);
    }
}
