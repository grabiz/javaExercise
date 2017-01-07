/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tien_Len;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author iviettech
 */
public class BoBai {
    public ArrayList<QuanBai> bobai;
    public static final int Sizebobai =52;

    public BoBai() {
        bobai = new ArrayList<>();
        for(int i=0;i<Sizebobai;i++)
        {
          QuanBai quanbai =new QuanBai(i);
          bobai.add(quanbai);
        }
        
    }
    public void KiemBai()
    {
       System.out.println("---Kiem Bo Bai-----");
       int dem=1;
       for(QuanBai obj:bobai)
       {
           System.out.print(dem+":");
           obj.Show();
           System.out.print(" ");
           dem+=1;
       }
    }
    public static int[] TaoMangNgauNhien(int n)
    {
        Random random = new Random();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=i; 
        }
        for(int i=0;i<n;i++)
        {
           int vt = random.nextInt(n-i);
           int t = a[vt];
           a[vt]=a[n-i-1];
           a[n-i-1]=t;
        }
        return a;
    }
    
    public void XaoBai()
    {
       int Mang52[] = TaoMangNgauNhien(Sizebobai);
       int i=0;
       for(QuanBai obj:bobai)
       {
           obj.setGiatri(Mang52[i]);
           i++;
       }
    
    }
    
}
