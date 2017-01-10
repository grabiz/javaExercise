/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuesday;

import java.io.Serializable;

/**
 *
 * @author iviettech
 */
public class SinhVien implements Serializable {
    String name;
    int tuoi;
    public SinhVien() {
        this.name = "";
        this.tuoi = 0;
    }
    public SinhVien(String name, int tuoi) {
        this.name = name;
        this.tuoi = tuoi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void Print()
    {
        System.out.println("Ten : "+ name+ " Tuoi : " +tuoi);
    }
    
    
}
