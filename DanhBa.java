/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhbadienthoai;

/**
 *
 * @author iviettech
 */
public class DanhBa {
    String name,phone;

    public DanhBa() {
        this.name="";
        this.phone="";
    }

    public DanhBa(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void Print()
    {
       System.out.println(this.name+"-"+this.phone);
    }
    
}
