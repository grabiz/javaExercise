/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanly;

/**
 *
 * @author Nguyen Euler
 */
public class Customer {
    String civilID,name,destination;
    double price;

    public Customer() {
        this.civilID ="";
        this.name="";
        this.destination="";
        this.price=0;
    }

    public Customer(String civilID, String name, String destination, double price) {
        this.civilID = civilID;
        this.name = name;
        this.destination = destination;
        this.price = price;
    }

    public String getCivilID() {
        return civilID;
    }

    public void setCivilID(String civilID) {
        this.civilID = civilID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void Print()
    {
       System.out.println("------Thong tin khach hang------");
       System.out.println("Customer's civil identity: "+ civilID);
       System.out.println("Customer's name: " +name);
       System.out.println("Destination: "+destination);
       System.out.println("Price: "+price);
       System.out.println("---------------------------------");
    }
    
}
