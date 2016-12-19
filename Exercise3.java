/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author NGUYEN
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bai 1");
        System.out.println("Nhap vao 1 so tu nhien : ");
        Scanner sc = new Scanner(System.in);
        
        int number =sc.nextInt();
        switch(number%7)
        {
            case 0: System.out.println("Monday");
                    break;
            case 1: System.out.println("Tuesday");
                    break;
            case 2: System.out.println("Wednesday");
                    break;
            case 3: System.out.println("Thursday");
                    break;
            case 4: System.out.println("Friday");
                    break;
            case 5: System.out.println("Saturday");
                    break;
            case 6: System.out.println("Sunday");
                    break;
            default: ;
        }
        
        System.out.println("Bài 2");
        System.out.println("Nhập vào một năm bất kỳ: ");
        int year = sc.nextInt();
        if (year%4 !=0)
        {
            System.out.println("Không phải năm nhuận.");
        }
        else 
        {
            if (year%100==0)
            {System.out.println("Không phải năm nhuận.");}
            else
            { 
                System.out.println("Năm nhuận.");
            }
                
        }
        
        System.out.println("Bài 3");
        int n = sc.nextInt();
        byte n1,n2,nr;
        n1 = (byte) (n>>4);
        n2 = (byte) (n<<4);
        nr = (byte) (n1|n2);
        System.out.println("Đảo bit :" +nr);
        
        System.out.println("Bài 4");
        int m = sc.nextInt();
        ArrayList list = new ArrayList();
        int value;
        for (int i=0; i<m; i++)
        {
           
           do
           {Random rand = new Random(); 
            value = rand.nextInt(m);
           }
           while(checkDuplicate(value,list,i));
           list.add(value);
        }  
        String l="";
        for (int i=0;i<m;i++)
        {
            l= l+list.get(i)+",";
        }
        System.out.println("Day so tu nhien ngau nhien khac nhau tung doi mot: "+l);
        
    }
    public static boolean checkDuplicate(int n,ArrayList list,int i)
    {
        int check=0;
        
        for(int j=0;j<i;j++)
        {
            if (n== (int)list.get(j))
            {
                check=check+1;
            } 
        }
        return check != 0;
    }
}
