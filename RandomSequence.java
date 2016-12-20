/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomsequence;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author iviettech
 */
public class RandomSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
      int n;
      Scanner sc= new Scanner(System.in);
      n=sc.nextInt();
      int[] a = new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=i;
      }
      int temp;
      Random rand = new Random();
      for(int i=0;i<n;i++){
         int j= rand.nextInt(n-i);
         temp=a[i]; //a[n-i-1];
         a[i]=a[j]; //a[n-i-1]=a[j];
         a[j]=temp; //a[j]=temp;
      }
      for(int i=0;i<n;i++)
      {
          System.out.print(a[i]+"");
      }
    }
    
}
