/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tien_Len;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author iviettech
 */
public class Player {
    public  int id;
    public  ArrayList<QuanBai> myQuanBai;

    public Player() {
    }

    public Player(int id) {
        this.id = id;
        this.myQuanBai = new ArrayList<QuanBai>();
    }
    public void ChiaBai(QuanBai quanbai)
    {
       myQuanBai.add(quanbai);
    }
    public  void ShowBai()
    {
        System.out.println("\n----player"+ id +"-----");
        int dem=0;
        for(QuanBai obj:myQuanBai)
        {
            System.out.print(" "+dem+":");
            obj.Show();
            dem++;
        }
    }
    public void SapBai()
    {
        Collections.sort(myQuanBai,new Comparator<QuanBai>(){
        @Override
        public int compare(QuanBai o1,QuanBai o2)
        {
           if (o1.getGiatri()>o2.getGiatri())
           {return 1;}
           else if (o1.getGiatri()==o2.getGiatri())
           {return 0;}
           else 
           {return -1;}
        }
        });
    }
    public boolean HetBai()
    {
        return (myQuanBai.isEmpty());
    
    }
    public void DanhBai()  //Chon cai bai thu may
    {
     
       Scanner sc = new Scanner(System.in);
       //System.out.println(" Xem lai bai: ");
       ShowBai();
       System.out.println();
       System.out.println("Ban chon cay thu may 0->"+(myQuanBai.size()-1)+":");
       int chon=sc.nextInt(); //Nhap 1 so
       //int dem=0;
       System.out.print("Player"+this.id+ "danh con: ");
       myQuanBai.get(chon).Show();
       /*for(QuanBai obj:myQuanBai)
       {
          if (chon==dem)
          {
              obj.Show(); //chon con bai danh
          }
          dem++;
       }*/
       System.out.print("\n");
       myQuanBai.remove(chon);   
       
    }
    
}
