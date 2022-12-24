public class ElemanFrekans {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 20, 10, 10, 20, 5, 20,5,0,0,0};
        int arraylenght=arr.length;
        int []tekliSayilar=new int[arraylenght];
        int indexofarray=0;


        for(int numara:arr)
        {
            if(!isFind(tekliSayilar,numara))
            {
                System.out.println(numara+" sayisi "+frekansBul(numara,arr)+" kere tekrar edildi.");
                tekliSayilar[indexofarray++]=numara;
            }
        }
            if(isFind(arr,0))
            {
                System.out.println("0 sayisi "+frekansBul(0,arr)+" kere tekrar edildi");
            }

    }



 public static int frekansBul(int number,int[]array){
int sayac=0;
for(int i:array) {
if(i==number)
{
    sayac++;
}
}
return sayac;
    }

public static boolean isFind(int[]arr,int deger){
     boolean durum=false;

  for(int i:arr)
  {
      if(i==deger)
          durum=true;
  }
        return durum;

}


}
