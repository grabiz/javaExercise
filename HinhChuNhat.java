package exercise;
import java.lang.*;
import java.util.Math.Pi*;
import java.util.Math.*;
public class 
public class HinhChuNhat{
	
	int x,y,w,h;
	public HinhChuNhat{)
	{
			
	}
	public static void GetRectangleParameters(int hoanhdo, int tungdo, int rong, int cao)
	{
		x=hoanhdo;
		y=tungdo;
		w=rong;
		h=cao;
	}
	public static int ChuVi()
	{
		
		return ((w+h)*2);
		
	}
	public static int DienTich()
	{
		
		return w*h;
	}
	public static void Print()
	{
		System.out.println("Toa do goc trai" +x +","+y);
		System.out.println("Chieu rong :" +w +" chieu cao :"+y);
		System.out.println("Chu vi" +ChuVi());
		System.out.println("Dien tich :" +DienTich());
	}
	public static boolean KiemTraGiaoNhau(HinhChuNhat rectangle)
	{
		
		int xTam = rectangle.x + (rectangle.w/2);
		int yTam = rectangle.y + (rectangle.h/2);
		if (xTam>=(x+w+rectangle.w/2)) || (xTam<=(x-rectangle.w/2)) || (yTam>=(y+h+rectangle.h/2)) || (yTam <=(y-rectangle.h/2))
		{System.out.println("Khong giao nhau");
		return false;}
	    else
		{System.out.println("Giao nhau");
		return true;}
		
	}	
	
}
public class HinhTron{
	
	int x,y,r;
	public HinhTron{)
	{
			
	}
	public static void GetRectangleParameters(int hoanhdo, int tungdo, int r)
	{
		x=hoanhdo;
		y=tungdo;
		r=bankinh;
	}
	public static int ChuVi()
	{
		return 2*Pi*r;
		
	}
	public static int DienTich()
	{
		return (int) Pi*pow(r,2)/2;
		
	}
	public static void Print()
	{
	    System.out.println("Toa do goc trai" +x +","+y);
		System.out.println("Ban kinh :" +r);
		System.out.println("Chu vi" +ChuVi());
		System.out.println("Dien tich :" +DienTich());    
       	
	}
	public static boolean KiemTraGiaoNhau(HinhTron circle)
	{
		
		if (Math.sqrt(pow(x-circle.x,2)+pow(x-circle.y,2))>=(r+circle.r)) 
		{
			System.out.println("Khong giao nhau");
			return false;
		}
		else
		   {System.out.println("Giao nhau");
		    return true;}
		
	}	
	
}

public static boolean CheckOverlap(HinhChuNhat rectangle,HinhTron circle)
{
	float distance1 = Math.sqrt(pow(circle.x-rectangle.x,2)+pow(circle.y-rectangle.y,2));
	float distance2 = Math.sqrt(pow(circle.x-rectangle.x,2)+pow(circle.y-(rectangle.y+rectangle.h),2));
	float distance3 = Math.sqrt(pow(circle.x-(rectangle.x+rectangle.w),2)+pow(circle.y-rectangle.y,2));
	float distance4 = Math.sqrt(pow(circle.x-(rectangle.x+rectangle.w),2)+pow(circle.y-(rectangle.y+rectangle.h),2));
	
	if ((circle.x <= rectangle.x-circle.r)||(circle.x>=rectangle.x+rectangle.w+circle.r)
		||(circle.y<=rectangle.y-circle.r)||(circle.y>=circle.r+rectangle.y+rectangle.h)
	    || ((distance1-circle.r)>=0) || ((distance2-circle.r)>=0) || ((distance3-circle.r)>=0) || ((distance4-circle.r)>=0))
		{
		  System.out.println("No overlap.");
		  return false;
		}
	else
	{
		System.out.println("Overlap !!");
		return true;
	}
}

