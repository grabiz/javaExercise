/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhbadienthoai;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author iviettech
 */
public class DanhBaDienThoai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<DanhBa> listdanhba = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String tieptuc ="";
        do
        {
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Phone : ");
            String phone = sc.next();
            DanhBa obj = new DanhBa(name,phone);
            listdanhba.add(obj); 
            System.out.print("Tiep tuc? Y/N ");
            tieptuc = sc.next();
        
        } 
        while(tieptuc.equalsIgnoreCase("Y"));
        System.out.println("--Danh ba---");
        for(DanhBa i:listdanhba)
        {
          i.Print();
        }
    }
    
}
