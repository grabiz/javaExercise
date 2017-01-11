/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Bài 30: Với đối tượng QuanBai ở bài tập 29, viết chương trình ghi vào file bài của các player (player0, player1, player2, player3), sau đó đọc các quân bài của từng player (Lưu trữ bài lại để đề phòng trường hợp bị lỗi mạng, ...).
Lưu ý: có thể ghi bài mỗi người vào một tệp tin riêng hoặc cách khác miễn sao bài của từng người chơi được lưu lại.

Bài 31: Quản lý khách hàng xếp hàng mua vé tại nhà ga. 
Thông tin lưu trữ cho khách hàng gồm: số CMND khách hàng(String), Tên khách hàng, Ga đến, giá tiền (double).



Lưu ý:
o Số khách hàng trong danh sách hiện tại là số khách đang chờ, nhưng chưa có vé. Khi một
khách hàng đã mua vé, thì loại khách hàng này ra khỏi danh sách chờ mua vé.
o Việc mua vé phải có thứ tự: ai vào trước thì mua vé trước (FIFO).
o Mỗi khi khách hàng mua được vé phải lưu lại khách hàng này để dùng cho việc thống kê.
o Mỗi khi thêm một khác hàng mới, nếu Số CMND khách hàng đã có thì không tạo phần tử
mới mà chỉ cập nhật lại ga và giá tiền đến cho khác hàng đó.
o Mục thống kê tình hình: cho biết còn bao nhiêu khách hàng chờ nhận vé, bao nhiêu khách
hàng đã nhận vé, tổng số tiền đã thu về là bao nhiêu.
o Việc lưu danh sách: chỉ lưu các khách hàng chờ mua vé. Các khách hàng đã nhận vé xem
như kết sổ trong ngày không cần lưu lại.
o Khi chương trình vừa được chạy, lập tức tự động nạp toàn bộ danh sách khách hàng từ file
(cách khách hàng chưa có vé).
o Khi hiển thị danh sách các ga đến đang chờ mua vé, chỉ hiển thị tên ga đó một lần. (Ví dụ:
giả sử 10 khách hàng nhưng đăng ký đi đến 2 ga, thì chỉ hiển thị 2 hàng).
 */
package quanly;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Nguyen Euler
 */
public class QuanLyKhachHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Customer> customerInQueue = new ArrayList<>();
        ArrayList<Customer> customerNotInQueue = new ArrayList<>();
 
        /*File yourFile = new File("listCustomer.dat");
        try { 
            yourFile.createNewFile();
            System.out.println("File's availble for loading.");
        } catch (IOException ex) {
           System.out.println("Can't create file.");
        }*/
        /*Customer customer1 = new Customer("1","A","HaNoi",19);
        customerInQueue.add(customer1);
        try
            {FileOutputStream f = new FileOutputStream("listCustomer.dat") ;
             ObjectOutputStream o = new ObjectOutputStream(f);
             o.writeObject(customerInQueue);
             o.close();
             f.close();
             }
        catch(IOException e)
        {
            System.out.println("Can't save file.");
        }    
        
        try{
            FileInputStream f = new FileInputStream("listCustomer.dat");
            ObjectInputStream o = new ObjectInputStream(f);
            customerInQueue =(ArrayList<Customer>) o.readObject();
            o.close();
            f.close();
            System.out.println("File was loaded succesfully.");
        }
        catch(IOException e){
          
            System.out.println("Can't open customer file.");
        } catch (ClassNotFoundException ex) {
            System.out.println("List doesn't exist.");
        }*/
        int select = 0;
        
        while((select!=9))
        {   
            System.out.println("----MENU QUAN LY KHACH HANG----");
            System.out.println("1. Thêm một khách hàng mới vào hàng đợi mua vé.");
            System.out.println("2. Bán một vé cho khách hàng. Chỉ bán cho người đăng ký trước.");
            System.out.println("3. Hiển thị danh sách khách hàng.");
            System.out.println("4. Hủy một khách hàng ra khỏi danh sách."); 
            System.out.println("5. Thống kê tình hình bán vé."); 
            System.out.println("6. Lưu danh sách vào file.");
            System.out.println("7. Hiển thị danh sách các ga đang chờ mua vé.");
            System.out.println("8. Hiển thị danh sách các ga đang chờ mua vé và số vé tương ứng cho ga.");
            System.out.println("9. Thoat");
            System.out.println("Ban muon lam gi ? :");
            Scanner sc = new Scanner(System.in);
            select = sc.nextInt();
            switch(select)
            {
                case 1: 
                      {
                         
                         System.out.println("Enter civil ID :");
                         Scanner sc1 = new Scanner(System.in);
                         String codeID = sc1.nextLine();
                         System.out.println("Enter name :");
                         Scanner sc2 = new Scanner(System.in);
                         String name = sc2.nextLine();
                         System.out.println("Enter destination: ");
                         Scanner sc3 = new Scanner(System.in);
                         String destination = sc3.nextLine();
                         System.out.println("Price : ");
                         Scanner sc4 = new Scanner(System.in);
                         Double price = sc4.nextDouble();
                         if (!customerInQueue.isEmpty()) 
                         { if(isDuplicateCivilID(customerInQueue,codeID)!=null)
                            {
                                  isDuplicateCivilID(customerInQueue,codeID).setName(name);
                                  isDuplicateCivilID(customerInQueue,codeID).setDestination(destination);
                                  isDuplicateCivilID(customerInQueue,codeID).setPrice(price);
                            }
                                else
                                {
                                    Customer newCustomer = new Customer(codeID,name,destination,price);
                                    customerInQueue.add(newCustomer);
                                }
                            }
                         
                         else{
                         
                                Customer newCustomer = new Customer(codeID,name,destination,price);
                                customerInQueue.add(newCustomer);
                              }
                    
                         break;
                        
                      }
                case 2:
                     {   System.out.println("Issue a ticket.");
                         System.out.println("Enter civil ID :");
                         Scanner sc5 = new Scanner(System.in);
                         String codeID = sc5.nextLine();
                         /*for(Customer i:customerInQueue)
                            {
                                if ( i.getCivilID().equals(codeID) )
                                {
                                    customerNotInQueue.add(i);
                                    customerInQueue.remove(i);
                                  
                                }
                                else
                                {
                                    System.out.println("This customer is unregistered.");
                                }
                            }*/
                            ArrayList<String> temp =new ArrayList<>();
                            for(int i=0;i<customerInQueue.size();i++)
                            {
                                if ( customerInQueue.get(i).getCivilID().equals(codeID) )
                                {
                                  temp.add(Integer.toString(i));
                                }
                                else
                                {
                                    System.out.println("This customer is unregistered.");
                                }
                            }
                            for(String i: temp)
                            {
                                customerNotInQueue.add(customerInQueue.get(Integer.parseInt(i))); 
                                customerInQueue.remove(customerInQueue.get(Integer.parseInt(i)));
                                 
                            }
                         break;
                     }
                case 3:
                      {
                       System.out.println("---List customer in queue----");
                       for(Customer i: customerInQueue)
                        {
                           i.Print();
                        }
                       break;
                      }
                case 4:
                     {
                        System.out.println("---Delete customer who cancelled ticket---");   
                        System.out.println("Enter civil ID :");
                        Scanner sc6 = new Scanner(System.in);
                        String codeID = sc6.nextLine();
                        for(Customer i:customerInQueue)
                            {
                                if ( i.getCivilID().equals(codeID) )
                                {
                                  customerInQueue.remove(i);
                             
                                }
                            }
                      break;
                     }
                case 5:
                    {
                        int count1=0,count2=0;
                        double price=0;
                        
                        for (Customer i: customerInQueue)
                        {
                           count1+=1;
                           
                        }
                        System.out.println("So khach hang dang cho nhan ve: " +count1);
                        for (Customer i: customerNotInQueue)
                        {
                           count2+=1;
                           price+=i.getPrice();
                        }
                        System.out.println("So khach hang da nhan ve: " +count2+" ,tong tien ve da ban "+price);
                        break;
                    }
                case 6:
                      {
                       try
                       {FileOutputStream f = new FileOutputStream("listCustomer.dat") ;
                        ObjectOutputStream o = new ObjectOutputStream(f);
                        o.writeObject(customerInQueue);
                        o.close();
                        f.close();
                       }
                       catch(IOException e)
                       {
                         System.out.println("Can't save file.");
                       }
                       break;
                      }
                case 7:{
                        ArrayList<String> listDestination=new ArrayList<>();
                        
                        for(Customer i: customerInQueue)
                        {
                            for(int j=0;j<listDestination.size();j++)
                            {  
                                if(!i.getDestination().equals(listDestination.get(j)))
                               {       
                                    listDestination.add(i.getDestination()); 
                               }
                            }
                        }
                        System.out.println("Cac ga dang cho mua ve tau: ");
                        for(String k: listDestination)
                        {
                           System.out.println(""+k);
                        }
                        break;
                       }
                       
                case 8: {
                        
                        ArrayList<String> listDestination=new ArrayList<>();
                        for(Customer i: customerInQueue)
                        {
                            for(int j=0;j<listDestination.size();j++)
                            {  
                                if(!i.getDestination().equals(listDestination.get(j)))
                               {       
                                    listDestination.add(i.getDestination()); 
                               }
                            }
                        }
                        int count =0;
                        for (String k: listDestination)
                          {
                             for(Customer cust : customerInQueue)
                             {
                                if(k.equals(cust.getDestination()))
                                {
                                   
                                    count+=1; 
                                }
                             }
                             System.out.println("Ga den dang cho ve : "+k +" , so ve dang cho : "+count);
                          
                          }
                          break;
                        
                        }
                case 9: 
                       System.out.println("Da thoat");
                       break;
                default:
                    System.out.println("Hay lua chon mot so tu 1->9");
            }
            
        }
        
    }
    public static Customer isDuplicateCivilID(ArrayList<Customer> al,String civilID)
    {  
       
       Customer cust=null;
       for(Customer i:al)
       {
           if(i.getCivilID().equals(civilID)) 
           {
            cust=i;
           }
           
       }
           return cust;
    }
    
}
