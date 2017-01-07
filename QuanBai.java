package Tien_Len;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iviettech
 */
public class QuanBai {
    int giatri;
  
    String Ten[]={"Ba","Bon","Nam","Sau","Bay","Tam","Chin","Muoi","J","Q","K","A","Hai"};
    String Chat[]={"♠","♣","♦ ","♥"};

    public QuanBai(int giatri) {
        this.giatri = giatri;
    }
    
    
    public void Show()
    {
         System.out.print(Ten[giatri/4]+Chat[giatri%4]);
    }

    public int getGiatri() {
        return giatri;
    }

    public void setGiatri(int giatri) {
        this.giatri = giatri;
    }
    
}
