package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.CreditCard;
import com.pluralsight.finance.Gold;
import com.pluralsight.finance.Valuable;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Luna", "534", 18000);
        Valuable account2 = new BankAccount("Jerry", "789", 2000);

        account1.deposit(100);
    }
}
