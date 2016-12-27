/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_app;

/**
 *
 * @author iviettech
 */
public class Account {
    int accountNo;
    String password;
    double amount;
    String customerName;

    public Account() {
        this.accountNo = 0;
        this.password = "";
        this.amount = 0;
        this.customerName = "";
        
    }
    
    public Account(int accountNo, String password, double amount, String customerName) {
        this.accountNo = accountNo;
        this.password = password;
        this.amount = amount;
        this.customerName = customerName;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void Print()
    {
     System.out.println(accountNo+","+customerName+","+amount+"$");
    }
    
}
