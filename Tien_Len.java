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
public class Tien_Len {

    /**
     * @param args the command line arguments
     */
    public static final int SoNguoiChoi=4;
    public static void main(String[] args) {
        // TODO code application logic here
        BoBai newbobai =new BoBai();
        newbobai.KiemBai();
        newbobai.XaoBai();
        newbobai.KiemBai();
        
        Player player[] = new Player[SoNguoiChoi];
        for(int i=0;i<SoNguoiChoi;i++)
        {
            player[i] = new Player(i);
        }
        //Chia bai
        int dem=0;
        for(QuanBai obj: newbobai.bobai)
        {
           player[dem%4].ChiaBai(obj);
           dem++;
        }
        //Lat bai
        for(int i=0;i<SoNguoiChoi;i++)
        {
            player[i].ShowBai();
        }
        //Sap Bai
        for(int i=0;i<SoNguoiChoi;i++)
        {
            player[i].SapBai();
        }
        LatBaiNguoiChoi(player);
        //danh bai
        while(!DungChoi(player))
        {
          for(int i=0;i<SoNguoiChoi;i++)
          {
              player[i].DanhBai();
          }
           
        }
    }
    public static void LatBaiNguoiChoi(Player[] player)
    {
        for(int i=0;i<SoNguoiChoi;i++)
        {
            player[i].ShowBai();
        }
    }
    public static boolean DungChoi(Player[] player)
    {
       return (player[0].HetBai()&&player[1].HetBai()&&player[2].HetBai())||
               (player[0].HetBai()&&player[2].HetBai()&&player[3].HetBai())||
               (player[0].HetBai()&&player[1].HetBai()&&player[3].HetBai())||
               (player[1].HetBai()&&player[2].HetBai()&&player[3].HetBai());
    
    }
    /*public static boolean DungChoi(Player[] player)
    {
       int dem=0;
       for(int i=0;i<SoNguoiChoi;i++)
        {
            if(player[i].HetBai())
            {
              dem+=1;
            }
        }
       return (dem==3);
    
    }
    */
}
