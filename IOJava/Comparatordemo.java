/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuesday;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iviettech
 */
public class Comparatordemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        ArrayList<SinhVien> al = new ArrayList<>();
        SinhVien sv1 = new SinhVien("A",10);
        SinhVien sv2 = new SinhVien("E",12);
        SinhVien sv3 = new SinhVien("F",9);
        SinhVien sv4 = new SinhVien("D",11);
        al.add(sv1);
        al.add(sv2);
        al.add(sv3);
        al.add(sv4);
        inDSSV(al);
        
        //Collections.sort(al, new SapXepTheoTuoi());
        Collections.sort(al, new SapXepTheoTen());
        inDSSV(al);
        //Ghi vao file;
        try {
            
            FileOutputStream f =new FileOutputStream("sinhvien.dat");
            ObjectOutputStream oOT = new ObjectOutputStream(f);
            oOT.writeObject(al);
            oOT.close();
            f.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi vao file!!!");
        }
        
        //Doc tu file
        try{
            FileInputStream f = new FileInputStream("sinhvien.dat");
            ObjectInputStream oIT = new ObjectInputStream(f);
            ArrayList<SinhVien> sv = (ArrayList<SinhVien>) oIT.readObject();
            oIT.close();
            f.close();
            System.out.println("---Doc doi tuong tu file----");
            for(SinhVien o :sv)
            { 
                o.Print();
            }
           
        }
        catch(ClassNotFoundException e){
           System.out.println("Class not found!");
        }
        catch(IOException e){
        
           System.out.println("Loi doc file"); 
        
        }
        
        ArrayList<SinhVien> listStudent = DocFile("sinhvien.dat");
        inDSSV(listStudent);
     }
    public static void inDSSV(ArrayList<SinhVien> list)
    {
       System.out.println("----In Danh Sach Sinh Vien----");
       for(SinhVien i: list)
       {
          i.Print();
       }
    }
    public static void SapXepTheoTuoi(ArrayList<SinhVien> al)
    {
       Collections.sort(al, new Comparator<SinhVien>(){

           @Override
           public int compare(SinhVien o1, SinhVien o2) {
               if(o1.getTuoi()>o2.getTuoi())
               {
                   return 1;
                }
               else if(o1.getTuoi()==o2.getTuoi())
               {
                  return 0;
               }
               else 
               {
                 return -1;
               }
           }
         
    });
    }
    public static void SapXepTheoTen(ArrayList<SinhVien> al)
    {
       Collections.sort(al, new Comparator<SinhVien>(){

           @Override
           public int compare(SinhVien o1, SinhVien o2) {
               return o1.getName().compareTo(o2.getName());
           }
       
       });
    }
    public static void GhiFile(String dirPath,ArrayList<SinhVien> list)
    {
        try{
            FileOutputStream f = new FileOutputStream(dirPath);
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(list);
            f.close();        
            o.close();
        }
        catch(IOException e)
        {
            System.out.println("Loi mo file.");
        }
    
    }
    public static ArrayList<SinhVien> DocFile(String dirPath)
    {  
       ArrayList<SinhVien> al =null; 
       try{
           FileInputStream f = new FileInputStream(dirPath);
           ObjectInputStream o = new ObjectInputStream(f);
           al = (ArrayList<SinhVien>) o.readObject();
           o.close();
           f.close();
       
       }
       catch(ClassNotFoundException e)
       {
          System.out.println("Class not found");
       }
       catch(IOException e)
       {
          System.out.println("Loi doc file.");
       }
       return al;
    }
}
 