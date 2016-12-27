/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_app;

import java.util.Scanner;

/**
 *
 * @author iviettech
 */
public class ATM_APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Account acc1 = new Account(1000,"1234",1000000,"Nguyen Van A");
        Account acc2 = new Account(1124,"1244",1000000,"Nguyen Van B");
        
        if(Login(acc1)==true)
        { 
          int chon =0;
          Scanner sc= new Scanner(System.in);
          System.out.println("Login succes ");
          do{
              System.out.println("--Chon Menu--");
              System.out.println("1. Rut tien");
              System.out.println("2. Xem tai khoan");
              System.out.println("3. Chuyen khoan");
              System.out.println("4.Thoat");
              System.out.println("Ban chon: ");
              chon = sc.nextInt();
              switch(chon)
              {
                  case 1:
                        System.out.println("So tien can rut: ");
                        double soTienCanRut = sc.nextDouble();
                        if(soTienCanRut> acc1.getAmount())
                        {System.out.println("Khong du tien trong tai khoan de rut!!1 ");}
                        else
                        {
                          System.out.println("Rut thanh cong!!");
                          RutTien(acc1,soTienCanRut);
                          System.out.println("So tien con lai " +acc1.getAmount());
                        }
                        break;
                  case 2:
                      acc1.Print();
                      break;
                  case 3:
                      ChuyenKhoan(acc1,acc2);
                      break;
              
              }
          }
          while (chon!=4);
                 
        }
        else
        {
            System.out.println("Login fail!!! ");
        }
        //acc1.Print();
    }
    public static boolean Login(Account acc){
      
      Scanner sc= new Scanner(System.in);
      System.out.println("Input id no :");
      int idNo =sc.nextInt();
      System.out.println("Input your password :");
      Scanner sc1 =new Scanner(System.in);
      String pw= sc1.nextLine();
      
      return((idNo==acc.getAccountNo())&&(pw.equals(acc.getPassword())));
    }
    public static double RutTien(Account acc1,double soTienRut)
    {
        double soTienConLai = acc1.getAmount()-soTienRut;
        acc1.setAmount(soTienConLai);
        return soTienConLai; 
    }
    public static void ChuyenKhoan(Account acc1,Account acc2)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tien can chuyen");
        double amount = sc.nextDouble();
        if(acc1.getAmount()>= amount)
        {
            acc1.setAmount(acc1.getAmount()-amount);
            acc2.setAmount(acc2.getAmount()+amount);
            System.out.println("Ban vua chuyen cho "+acc2.getAccountNo()+"so tien"+amount);
        }
        else{
        System.out.println("Ban khong du tien de chuyen!!");
        }
        
    }
    /*Cach 2 
        public static void RutTien(Account acc)
    {
      Scanner sc = new Scanner(System.in);
      double soTienCanRut = sc.nextDouble();
      if(soTienCanRut> acc1.getAmount())
              {System.out.println("Khong du tien trong tai khoan de rut!!1 ");}
       else
            {
                          System.out.println("Rut thanh cong!!");
                          double soTienConLai = acc1.getAmount()-soTienCanRut;
                          acc1.setAmount(soTienConLai);
                          System.out.println("So tien con lai " +acc1.getAmount());
             }            
    }
    
     */
    
}
