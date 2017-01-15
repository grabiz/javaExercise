1. so sanh 2 so : dung ham a>b?a:b, dung ham Math.min, Math.max
2. Doi he nhi phan
String binary="";
        while(n!=0)
       {
          binary=(n%2)+binary; 
          n=n/2;
       }
3.Dao so
int inverse=0;
         while(n!=0)
         {
             inverse = inverse*10+(n%10);
             n=n/10;
         
         }
         return inverse;
4.Doi sang he co so 16
 String kq="";
        String m[]={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        while (n>0){
            int du=n%x;
            n=n/x;
            kq=m[du ]+ kq;
        }
        return kq;
 5.KT so nguyen to
  while(n<1){System.out.print("nhap lai so n=");
                    n=nhap.nextInt();}
        if(n==1) System.out.println("no");
        else if (n==2) System.out.println("yes");
        else{
            int dem = 0;
            for(int i=2;i<=n/2;i++){
                if(n%i==0) dem++;
                
                }
            if(dem==0) System.out.println("yes");
            else System.out.println("no");
        }
6. Dao bit
 int m1=n>>4;
        int m2=n<<4;
        n=m1|m2;
        int kq=n&0xFF;
7. Random day so 
for(int i=0;i<sequence.length;i++)
       {
       
          int random = (int)(Math.random()*(sequence.length-i));
          int temp=sequence[sequence.length-i-1];
          sequence[sequence.length-i-1]=sequence[random];
          sequence[random]=temp;
       }
