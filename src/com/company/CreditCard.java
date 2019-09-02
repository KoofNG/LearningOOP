package com.company;

public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard(String cust, String bk, String acnt, int lim, double initalBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initalBal;
    }

    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0);
    }

    // Accessor Methods
    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    // Update Methods
    public boolean charge(double price) {
        if ((price + balance) > limit) {
            return false;
        }
        balance += price;
        return true;
    }

    public void makePayment(double amount) {
        balance -= amount;
    }

    public void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance);
        System.out.println("Limit = " + card.limit);
    }

    public static void main(String[] args) {
        CreditCard [] wallet = new CreditCard[3];

        //Initializing the Wallet
        wallet[0] = new CreditCard("John Bowman", "California Savings", "5391 0375 9387 5309", 5000);
        wallet[1] = new CreditCard("John Bowman", "California Financial", "3485 0399 3395 1954", 3000);
        wallet[2] = new CreditCard("John Bowman", "California Federal", "5391 0375 9387 5309", 2500);

        for (int i = 0; i <= 16; i++) {
            wallet[0].charge(3*i);
            wallet[1].charge(3*i);
            wallet[2].charge(3*i);
        }

        for (CreditCard card : wallet) {
            // CreditCard.printSummary(card);
            card.printSummary(card);
            while (card.getBalance( ) > 200.0) {
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance( ));
            }
        }
    }
}

